/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo_GestionDeFinanzas;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author tm_galli
 */
public class GestionDePagosYCambios extends javax.swing.JFrame {

    /**
     * Creates new form GestionDePagosYCambios
     */
    public GestionDePagosYCambios() {
        MostrarTabla mostrarTablasFunc = new MostrarTabla();
        initComponents();
        AceptarButton.setEnabled(false);
        RechazarButton.setEnabled(false);
        
        jtext.setVisible(false);
        
        Object[] PagosColums = new Object[]{"id_pago", "monto", "fk_medio", "motivo"};
        mostrarTablasFunc.MostrarTabla(PagosTable, PagosColums, "SELECT * FROM Pagos;");
        
        Object[] SugerenciasColums = new Object[]{"Id", "Mensaje", "Id_Equipamiento", "Cant_Comprar", "Precio"};
        mostrarTablasFunc.MostrarTabla(SugerenciasTable, SugerenciasColums, "SELECT * FROM Pedido_Compra;");
        
        
        SugerenciasTable.getSelectionModel().addListSelectionListener(e -> {
        // Verificar que hay una selección y que el evento no sea parte de un ajuste
            if (!e.getValueIsAdjusting()) {
                int selectedRow = SugerenciasTable.getSelectedRow();
                if (selectedRow != -1) {
                    RechazarButton.setEnabled(true); // Habilitar botón si hay una fila seleccionada
                    AceptarButton.setEnabled(true); // Habilitar botón si hay una fila seleccionada
                    
                } else {
                    RechazarButton.setEnabled(false); // Deshabilitar botón si no hay selección
                    AceptarButton.setEnabled(false); // Deshabilitar botón si no hay selección
                }
            }
        });
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        PagosTable = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        SugerenciasTable = new javax.swing.JTable();
        RechazarButton = new javax.swing.JButton();
        AceptarButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        SalirButton = new javax.swing.JButton();
        jtext = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(99, 140, 181));

        jLabel5.setBackground(new java.awt.Color(31, 50, 69));
        jLabel5.setFont(new java.awt.Font("Waree", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(31, 50, 69));
        jLabel5.setText("SEGUIMIENTO DE PAGOS");
        jLabel5.setPreferredSize(new java.awt.Dimension(180, 17));

        PagosTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Tipo", "Riesgo", "Causa", "Descripcion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(PagosTable);

        jLabel6.setBackground(new java.awt.Color(31, 50, 69));
        jLabel6.setFont(new java.awt.Font("Waree", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(31, 50, 69));
        jLabel6.setText("ACEPTAR SUGERENCIA DE COMPRA");
        jLabel6.setPreferredSize(new java.awt.Dimension(180, 17));

        SugerenciasTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Tipo", "Riesgo", "Causa", "Descripcion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        SugerenciasTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SugerenciasTableMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(SugerenciasTable);

        RechazarButton.setText("Rechazar");
        RechazarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RechazarButtonActionPerformed(evt);
            }
        });

        AceptarButton.setText("Aceptar");
        AceptarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarButtonActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(31, 50, 69));
        jLabel7.setFont(new java.awt.Font("Waree", 1, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(31, 50, 69));
        jLabel7.setText("Rechazar o aceptar sugerencia");
        jLabel7.setPreferredSize(new java.awt.Dimension(180, 17));

        SalirButton.setText("Salir");
        SalirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SalirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(AceptarButton)
                        .addGap(88, 88, 88)
                        .addComponent(RechazarButton)))
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AceptarButton)
                    .addComponent(RechazarButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(SalirButton)
                .addGap(4, 4, 4)
                .addComponent(jtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel6.setBackground(new java.awt.Color(31, 50, 69));
        jPanel6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel4.setFont(new java.awt.Font("Waree", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(245, 246, 247));
        jLabel4.setText("GESTION DE PAGOS Y CAMBIOS");
        jLabel4.setPreferredSize(new java.awt.Dimension(180, 17));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RechazarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RechazarButtonActionPerformed
        // TODO add your handling code here:
        EditarBaseDeDatos crudtabla = new EditarBaseDeDatos();
        Object[] SugerenciasColums = new Object[]{"Id", "Mensaje", "Id_Equipamiento", "Cant_Comprar", "Precio"};
        
        MostrarTabla mostrarTablasFunc = new MostrarTabla();
        crudtabla.EliminarCategoria(jtext, "DELETE FROM Pedido_Compra WHERE Pedido_Compra.Id=?;");
        mostrarTablasFunc.MostrarTabla(SugerenciasTable, SugerenciasColums, "SELECT * FROM Pedido_Compra;");
    }//GEN-LAST:event_RechazarButtonActionPerformed

    private void SalirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirButtonActionPerformed
        // TODO add your handling code here:
        PlanificacionFinanciera GesFin= new PlanificacionFinanciera();
        
        GesFin.setVisible(true);
        this.setVisible(false);
        GesFin.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_SalirButtonActionPerformed

    private void SugerenciasTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SugerenciasTableMouseClicked
        EditarBaseDeDatos CrudTabla = new EditarBaseDeDatos();
        
        CrudTabla.SeleccionarCategoria(SugerenciasTable, jtext);
        
    }//GEN-LAST:event_SugerenciasTableMouseClicked

    private void AceptarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarButtonActionPerformed
        EditarBaseDeDatos crudtabla = new EditarBaseDeDatos();
        Object[] SugerenciasColums = new Object[]{"Id", "Mensaje", "Id_Equipamiento", "Cant_Comprar", "Precio"};
        
        
        
        MostrarTabla mostrarTablasFunc = new MostrarTabla();
        crudtabla.EliminarCategoria(jtext, "DELETE FROM Pedido_Compra WHERE Pedido_Compra.Id=?;");
        mostrarTablasFunc.MostrarTabla(SugerenciasTable, SugerenciasColums, "SELECT * FROM Pedido_Compra;");
    }//GEN-LAST:event_AceptarButtonActionPerformed

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
            java.util.logging.Logger.getLogger(GestionDePagosYCambios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionDePagosYCambios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionDePagosYCambios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionDePagosYCambios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionDePagosYCambios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AceptarButton;
    private javax.swing.JTable PagosTable;
    private javax.swing.JButton RechazarButton;
    private javax.swing.JButton SalirButton;
    private javax.swing.JTable SugerenciasTable;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField jtext;
    // End of variables declaration//GEN-END:variables
}
