/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu_RH;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author tm_galli
 */
public class Modifica extends javax.swing.JFrame {

    
    public Modifica() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        ingre_edad = new javax.swing.JTextField();
        jSpinner3 = new javax.swing.JSpinner();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ingr_nombre = new javax.swing.JTextField();
        ingre_ape = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tipo_docu = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        tipo_nacio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        nro_documen = new javax.swing.JTextField();
        btn_enviar_alta = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        ing_edad = new javax.swing.JTextField();
        Volver_alta = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        cargos_ele = new javax.swing.JComboBox<>();

        ingre_edad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingre_edadActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(31, 50, 69));
        jPanel1.setForeground(new java.awt.Color(229, 232, 236));
        jPanel1.setToolTipText("WAREE");

        jLabel1.setForeground(new java.awt.Color(229, 232, 236));
        jLabel1.setText("MODIFICACION");

        jLabel2.setFont(new java.awt.Font("Waree", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(229, 232, 236));
        jLabel2.setText("Nombre:");
        jLabel2.setToolTipText("WAREE");

        jLabel3.setFont(new java.awt.Font("Waree", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(229, 232, 236));
        jLabel3.setText("Apellido:");

        ingr_nombre.setForeground(new java.awt.Color(61, 61, 61));
        ingr_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingr_nombreActionPerformed(evt);
            }
        });
        ingr_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ingr_nombreKeyTyped(evt);
            }
        });

        ingre_ape.setForeground(new java.awt.Color(61, 61, 61));
        ingre_ape.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingre_apeActionPerformed(evt);
            }
        });
        ingre_ape.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ingre_apeKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Waree", 0, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(229, 232, 236));
        jLabel4.setText("Tipo de documento:");

        tipo_docu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DNI", "Pasaporte" }));
        tipo_docu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipo_docuActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Waree", 0, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(229, 232, 236));
        jLabel5.setText("Nacionalidad:");

        tipo_nacio.setForeground(new java.awt.Color(61, 61, 61));
        tipo_nacio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipo_nacioActionPerformed(evt);
            }
        });
        tipo_nacio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tipo_nacioKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Waree", 0, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(229, 232, 236));
        jLabel6.setText("Nro de documento:");

        nro_documen.setForeground(new java.awt.Color(61, 61, 61));
        nro_documen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nro_documenActionPerformed(evt);
            }
        });
        nro_documen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nro_documenKeyTyped(evt);
            }
        });

        btn_enviar_alta.setText("Enviar");
        btn_enviar_alta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_enviar_altaActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Waree", 0, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(229, 232, 236));
        jLabel9.setText("Edad:");

        ing_edad.setForeground(new java.awt.Color(61, 61, 61));
        ing_edad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ing_edadKeyTyped(evt);
            }
        });

        Volver_alta.setText("<-");
        Volver_alta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Volver_altaActionPerformed(evt);
            }
        });

        jLabel10.setText("Cargo");
        jLabel10.setFont(new java.awt.Font("Waree", 0, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(229, 232, 236));
        List<String> listaCargos;
        listaCargos = consulta();
        cargos_ele.setModel(new javax.swing.DefaultComboBoxModel<>(listaCargos.toArray(new String[0])));
        cargos_ele.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cargos_eleKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Volver_alta)
                        .addGap(284, 284, 284)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(btn_enviar_alta, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nro_documen))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tipo_docu, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ingre_ape, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ingr_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel9)
                                .addGap(3, 3, 3)
                                .addComponent(ing_edad))
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tipo_nacio, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                            .addComponent(cargos_ele, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(72, 72, 72))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Volver_alta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ingr_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ing_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ingre_ape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipo_docu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipo_nacio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nro_documen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)
                        .addComponent(cargos_ele, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addComponent(btn_enviar_alta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>                        

    private void ingr_nombreActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                          

    private void tipo_docuActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                        

    private void tipo_nacioActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                          

    private void nro_documenActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                          

    private void ingre_apeActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                        

    private void ingre_edadActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                          

    private void btn_enviar_altaActionPerformed(java.awt.event.ActionEvent evt) { 
       
       if (ing_edad.getText().trim().isEmpty() || ingr_nombre.getText().trim().isEmpty() || 
        ingre_ape.getText().trim().isEmpty() || tipo_nacio.getText().trim().isEmpty() || 
        nro_documen.getText().trim().isEmpty()) {
        
        JOptionPane.showMessageDialog(null, "Por favor, falta ingresar datos.", 
                                      "Error", JOptionPane.ERROR_MESSAGE);
        return; // Salir si hay campos vacíos
    }

    try {
        int edad = Integer.parseInt(ing_edad.getText());

        // Verificar si la edad es menor a 18
        if (edad < 18) {
            JOptionPane.showMessageDialog(null, "La edad debe ser 18 o mayor.", 
                                          "Error", JOptionPane.ERROR_MESSAGE);
            ing_edad.setText(""); // Limpiar el campo
            return; // Salir si la edad no es válida
        }
    } catch (NumberFormatException e) {
        // Manejo de errores si no es un número válido
        JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido para la edad.", 
                                      "Error", JOptionPane.ERROR_MESSAGE);
        ing_edad.setText(""); // Limpiar el campo en caso de error
        return; // Salir si hay un error de formato
    }

        limpiarFormulario();
        
       
    }                                              
    private void inserta(String nombre, String cargoSeleccionado,String dni){
        Connection con = null;
        PreparedStatement pstUsuario = null;
        ResultSet rsUsuario = null;
        String nombre2 = null;
        String dniOriginal = null;

    try {
        con = DatabaseConnection.getConnection(); // Asegúrate de que este método maneje excepciones

        // 1. Obtener el DNI original del empleado a partir de su ID
        String queryDniOriginal = "SELECT * FROM Empleado WHERE dni = ?";
        pstUsuario = con.prepareStatement(queryDniOriginal);
        pstUsuario.setString(1,dni); // Usamos el idEmpleado para obtener el dni original
        rsUsuario = pstUsuario.executeQuery();

        if (rsUsuario.next()) {
            dniOriginal = rsUsuario.getString("dni"); // Obtener el DNI original
        } else {
            JOptionPane.showMessageDialog(null, "Empleado no encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Salir si el empleado no existe
        }

        // 2. Verificar si el DNI es diferente y si ya existe otro empleado con ese DNI
        if (!dni.equals(dniOriginal)) {
            String queryDNI = "SELECT COUNT(*) FROM Empleado WHERE dni = ?";
            pstUsuario = con.prepareStatement(queryDNI);
            pstUsuario.setString(1, dni);
            rsUsuario = pstUsuario.executeQuery();

            if (rsUsuario.next() && rsUsuario.getInt(1) > 0) {
                JOptionPane.showMessageDialog(null, "El DNI ya está registrado con otro empleado.", "Error", JOptionPane.ERROR_MESSAGE);
                return; // Salir si el nuevo DNI ya existe
            }
        }

        // 3. Obtener el ID del cargo a partir del nombre del cargo seleccionado
        String queryCargo = "SELECT idcargo FROM Cargo WHERE cargos = ?";
        pstUsuario = con.prepareStatement(queryCargo);
        pstUsuario.setString(1, cargoSeleccionado); // Asignar el nombre del cargo
        rsUsuario = pstUsuario.executeQuery();

        if (rsUsuario.next()) {
            nombre2 = rsUsuario.getString("idcargo"); // Obtener el id del cargo
        }

        // 4. Actualizar los datos del empleado sin tocar el DNI
        String queryUpdate = "UPDATE Empleado SET nombre = ?, idcargo = ? WHERE dni = ?";
        pstUsuario = con.prepareStatement(queryUpdate);
        pstUsuario.setString(1, nombre); // Asignar el nuevo nombre
        pstUsuario.setString(2, nombre2); // Asignar el id del cargo
        pstUsuario.setString(3, dni); // Mantener el DNI como está

        // Ejecutar la actualización
        int filasActualizadas = pstUsuario.executeUpdate();
        if (filasActualizadas > 0) {
            JOptionPane.showMessageDialog(null, "Empleado modificado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Error al modificar los datos.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    } catch (Exception e) {
        e.printStackTrace(); // Manejo de errores
    } finally {
        // Cerrar conexiones
        try {
            if (rsUsuario != null) rsUsuario.close();
            if (pstUsuario != null) pstUsuario.close();
            if (con != null) con.close();
        } catch (Exception e) {
            e.printStackTrace(); // Manejo de errores al cerrar
        }
    }
}
    private List<String> consulta() {
    Connection con = null;
    PreparedStatement pstUsuario = null;
    ResultSet rsUsuario = null;
    List<String> listaCargos = new ArrayList<>();
    try {
        con = DatabaseConnection.getConnection(); // Asegúrate de que este método maneje excepciones
       
        // Verificar si el usuario está registrado
        String queryUsuario = "SELECT * FROM Cargo";
        pstUsuario = con.prepareStatement(queryUsuario);
        rsUsuario = pstUsuario.executeQuery();

        // Procesar los resultados
        while (rsUsuario.next()) {
            // Aquí puedes obtener los datos que necesites
            String nombre = rsUsuario.getString("cargos"); // Cambia "nombre_columna" al nombre real            
            listaCargos.add(nombre);
            // Hacer algo con los datos, por ejemplo, agregar a un JComboBox
            // cargos_ele.addItem(nombre);
        }
    } catch (Exception e) {
        e.printStackTrace(); // Manejo de errores
    } finally {
        // Cerrar conexiones
        try {
            if (rsUsuario != null) rsUsuario.close();
            if (pstUsuario != null) pstUsuario.close();
            if (con != null) con.close();
        } catch (Exception e) {
            e.printStackTrace(); // Manejo de errores al cerrar
        }
    }
      
        return listaCargos;
    }
    private void limpiarFormulario() {
    String nombre = ingr_nombre.getText();
    String cargoSeleccionado = (String) cargos_ele.getSelectedItem();
    String dni = nro_documen.getText();
    inserta(nombre,cargoSeleccionado,dni);
    ingr_nombre.setText("");
    ingre_ape.setText("");
    tipo_docu.setSelectedIndex(0); // Resetea a la primera opción
    tipo_nacio.setText("");
    nro_documen.setText("");
    ing_edad.setText("");
    cargos_ele.setSelectedIndex(0);
}
  
    
    
    private void Volver_altaActionPerformed(java.awt.event.ActionEvent evt) {                                            
        Gtn_personal newframe = new Gtn_personal();
       
        newframe.setVisible(true);
       
        this.dispose();
    }                                          

    private void nro_documenKeyTyped(java.awt.event.KeyEvent evt) {                                    
        if(nro_documen.getText().length() >= 8)
        {
            evt.consume();
       
        }
       
       
        char c = evt.getKeyChar();
       
        if(c<'0' || c>'9') evt.consume();
       
       
    }                                    

    private void ingr_nombreKeyTyped(java.awt.event.KeyEvent evt) {                                    
         char c = evt.getKeyChar();
       
        if((c<'a' || c>'z') && (c<'A') | c>'Z') evt.consume();
    }                                    

    private void ingre_apeKeyTyped(java.awt.event.KeyEvent evt) {                                  
         char c = evt.getKeyChar();
       
        if((c<'a' || c>'z') && (c<'A') | c>'Z') evt.consume();
    }                                  

    private void tipo_nacioKeyTyped(java.awt.event.KeyEvent evt) {                                    
         char c = evt.getKeyChar();
       
        if((c<'a' || c>'z') && (c<'A') | c>'Z') evt.consume();
    }                                  

    private void ing_edadKeyTyped(java.awt.event.KeyEvent evt) {   
        
        if(ing_edad.getText().length() >= 2)
        {
            evt.consume();
       
        }
       
       
        char c = evt.getKeyChar();
       
        if(c<'0' || c>'9') evt.consume();
    }                                

    private void cargos_eleKeyTyped(java.awt.event.KeyEvent evt) {                                    
       
    }                                  
   
     
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Alta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Alta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Alta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Alta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Alta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                    
    private javax.swing.JButton Volver_alta;
    private javax.swing.JButton btn_enviar_alta;
    private javax.swing.JComboBox<String> cargos_ele;
    private javax.swing.JTextField ing_edad;
    private javax.swing.JTextField ingr_nombre;
    private javax.swing.JTextField ingre_ape;
    private javax.swing.JTextField ingre_edad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JTextField nro_documen;
    private javax.swing.JComboBox<String> tipo_docu;
    private javax.swing.JTextField tipo_nacio;
    // End of variables declaration                  
}
