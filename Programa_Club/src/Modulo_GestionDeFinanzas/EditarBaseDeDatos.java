/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo_GestionDeFinanzas;

import Modulo_Ventas.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.JTextField;
import Modulo_Ventas.ConexionBDD;
import javax.swing.JOptionPane;
import java.sql.*;

public class EditarBaseDeDatos {
    //Declaracion de variables a usar
    int codigo;
    int codigo2;
    String nombreCategoria;
    
    //GET y SET para los parametros
    public int getCodigo() {
        return codigo;
    }
    
    public int getCodigo2() {
        return codigo2;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public void setCodigo2(int codigo2) {
        this.codigo2 = codigo2;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }
    
    //Insertar
    //Declaracion de parametros
    public void InsertarCategoria(JTextField paramNombreCategoria){
        setNombreCategoria(paramNombreCategoria.getText());
    
    // Verificar si ya existe una categoría con ese nombre
    if (categoriaExiste(getNombreCategoria())) {
        JOptionPane.showMessageDialog(null, "Error: Ya existe una categoría con ese nombre.");
        return; // No continuar con la inserción si la categoría ya existe
    }
    
    //Abrir Conexion
    ConexionBDD objetoConexion = new ConexionBDD();
    
    //Consulta SQL
    String consulta = "insert into Categorias (NombreCategoria) values (?);";
    
    try {
        //Adquiere los parametros del JTextField
        CallableStatement cs = objetoConexion.Conectar().prepareCall(consulta);
        cs.setString(1, getNombreCategoria());
        
        // Ejecuta la sentencia con los parámetros
        cs.execute();
        
        JOptionPane.showMessageDialog(null, "Se insertó correctamente la categoría");
        
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "No se insertó correctamente la categoría, error: " + e.toString());
    } finally {
        objetoConexion.cerrarConexion();
    }
    }
    
    // Método para verificar si la categoría ya existe en la base de datos
    public boolean categoriaExiste(String nombreCategoria) {
    ConexionBDD objetoConexion = new ConexionBDD();
    String sql = "SELECT COUNT(*) FROM Categorias WHERE NombreCategoria = ?";
    
    try {
        PreparedStatement ps = objetoConexion.Conectar().prepareStatement(sql);
        ps.setString(1, nombreCategoria);
        ResultSet rs = ps.executeQuery();
        
        if (rs.next()) {
            // Si el contador es mayor que 0, significa que la categoría existe
            return rs.getInt(1) > 0;
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al verificar la categoría: " + e.getMessage());
    } finally {
        objetoConexion.cerrarConexion();
    }
    
    return false; // Si no se encuentra la categoría, devolvemos false
    }

    public void SeleccionarCategoria(JTable paramTablaCategorias, JTextField paramID){
        try{
            //Declarar parametros
            int fila= paramTablaCategorias.getSelectedRow();
            
            //Mostrar seleccion si existe una fila
            if(fila>=0){
                paramID.setText((paramTablaCategorias.getValueAt(fila, 0).toString()));
            }
            else{
                JOptionPane.showMessageDialog(null, "Fila no encontrada");
            }
            
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error de seleccion, error:"+e.toString());
        }
    } 
    //Modificar
    public void ModificarCategoria(JTextField paramCodigo, JTextField paramNombre) {
    // Declarar parámetros
    setCodigo(Integer.parseInt(paramCodigo.getText()));
    setNombreCategoria(paramNombre.getText());
    
    // Verificar si ya existe una categoría con ese nombre (y no sea la misma categoría)
    if (categoriaExiste(getNombreCategoria())) {
        JOptionPane.showMessageDialog(null, "Error: Ya existe una categoría con ese nombre.");
        return; // Si existe, no proceder con la modificación
    }
    
    ConexionBDD objetoConexion = new ConexionBDD();
    // Consulta SQL
    String consulta = "UPDATE Categorias SET Categorias.NombreCategoria=? WHERE Categorias.CategoriaID=?";
    
    try {
        // Conectar BDD
        CallableStatement cs = objetoConexion.Conectar().prepareCall(consulta);
        // Ingresar parámetros
        cs.setString(1, getNombreCategoria());
        cs.setInt(2, getCodigo());
        // Ejecutar
        cs.execute();
        
        JOptionPane.showMessageDialog(null, "Modificación exitosa");
        
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "No se modificó: " + e.toString());
    } finally {
        objetoConexion.cerrarConexion();
    }
}
    
    public void HacerConsulta(JTextField paramCodigo1){
        //Declarar parametros
        ConexionBDD objetoConexion= new ConexionBDD();
        
        String consulta1 = "SELECT pc.iD_Equipamiento,te.Nombre FROM Pedido_Compra pc inner JOIN Tipo_Equipamiento te ON pc.Id_Equipamiento=te.Tipo_Id;";

        try (PreparedStatement ps1 = objetoConexion.Conectar().prepareStatement(consulta1)){

            ps1.setInt(1, getCodigo());
            ps1.executeUpdate();

            JOptionPane.showMessageDialog(null, "Se eliminó correctamente el registro");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"No se eliminó correctamente el registro, error:"+ e.toString())  ;
        }finally{
            objetoConexion.cerrarConexion();
        }
    } 

    public void MoverDinero(JTextField paramCodigo1, JTextField paramCodigo2, float monto, String desc){
        //Declarar parametros
        setCodigo(Integer.parseInt(paramCodigo1.getText()));
        setCodigo2(Integer.parseInt(paramCodigo2.getText()));
        ConexionBDD objetoConexion= new ConexionBDD();
        
        String descripcion = String.valueOf(desc);
        
        
        String consulta1 = "UPDATE Cuenta SET saldo = saldo - "+String.valueOf(monto)+" WHERE id_cuenta = ?;";
        String consulta2 = "UPDATE Cuenta SET saldo = saldo + "+String.valueOf(monto)+" WHERE id_cuenta = ?;";
        String consulta3 = "INSERT INTO Movimientos (id_movimiento, fk_cuenta, descripcion) VALUES ((SELECT COALESCE(MAX(id_movimiento), 0) + 1 FROM (SELECT id_movimiento FROM Movimientos) AS temp), ?, ?);";


        try (PreparedStatement ps1 = objetoConexion.Conectar().prepareStatement(consulta1);
             PreparedStatement ps2 = objetoConexion.Conectar().prepareStatement(consulta2);
             PreparedStatement ps3 = objetoConexion.Conectar().prepareStatement(consulta3)){

            ps1.setInt(1, getCodigo());
            ps1.executeUpdate();

            ps2.setInt(1, getCodigo2());
            ps2.executeUpdate();
            
            ps3.setInt(1, getCodigo());
            ps3.setString(2, descripcion);
            ps3.executeUpdate();

            JOptionPane.showMessageDialog(null, "El movimiento se hizo correctamente");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"El movimiento no se hizo correctamente, error:"+ e.toString())  ;
        }finally{
            objetoConexion.cerrarConexion();
        }
    }    //Eliminar
    
    public void EliminarCategoria(JTextField paramCodigo, String consulta){
        //Declarar parametros
        setCodigo(Integer.parseInt(paramCodigo.getText()));
        ConexionBDD objetoConexion= new ConexionBDD();
        
        try{
            //Conectar BDD
            CallableStatement cs= objetoConexion.Conectar().prepareCall(consulta);
            //Adquirir parametros
            cs.setInt(1, getCodigo());
            //Ejecutar
            cs.execute();
            
            JOptionPane.showMessageDialog(null,"Se eliminó correctamente el registro");
            
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"No se eliminó correctamente el registro, error:"+ e.toString())  ;
        }finally{
            objetoConexion.cerrarConexion();
        }
    }

        
}
