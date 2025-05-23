/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;
import gestiondeeventos.DatabaseConnection;
import javax.swing.JOptionPane;
import java.sql.SQLException;
/**
 *
 * @author ddesktop
 */
public class AgregarEstadio extends javax.swing.JFrame {

    /**
     * Creates new form PanelPrincipal
     */
    public AgregarEstadio() {
        initComponents();
        


    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenido = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        body = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        direccionField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nombreField = new javax.swing.JTextField();
        guardarEstadio = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        addSector = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cantsectoresField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        contenido.setBackground(new java.awt.Color(0, 0, 0));
        contenido.setPreferredSize(new java.awt.Dimension(1042, 576));
        contenido.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(31, 50, 67));
        jPanel1.setPreferredSize(new java.awt.Dimension(1042, 576));

        jLabel1.setFont(new java.awt.Font("Waree", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("GESTION DE ESTADIO");

        body.setBackground(new java.awt.Color(182, 192, 199));

        jLabel2.setFont(new java.awt.Font("Waree", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(31, 50, 67));
        jLabel2.setText("Agregar nuevo estadio");

        direccionField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direccionFieldActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Waree", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(31, 50, 67));
        jLabel3.setText("Nombre del estadio:");

        jLabel4.setFont(new java.awt.Font("Waree", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(31, 50, 67));
        jLabel4.setText("Direccion:");

        nombreField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreFieldActionPerformed(evt);
            }
        });

        guardarEstadio.setBackground(new java.awt.Color(31, 50, 67));
        guardarEstadio.setForeground(new java.awt.Color(254, 254, 254));
        guardarEstadio.setText("Guardar");
        guardarEstadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarEstadioActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Waree", 0, 18)); // NOI18N
        jLabel5.setText("Una vez agregado el estadio, ingrese los sectores");

        addSector.setBackground(new java.awt.Color(31, 50, 67));
        addSector.setForeground(new java.awt.Color(254, 254, 254));
        addSector.setText("Agregar sectores->");
        addSector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSectorActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Waree", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(31, 50, 67));
        jLabel6.setText("Cantidad de sectores:");

        cantsectoresField.setToolTipText("");
        cantsectoresField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantsectoresFieldActionPerformed(evt);
            }
        });
        cantsectoresField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cantsectoresFieldKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyLayout.createSequentialGroup()
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addGap(364, 364, 364)
                        .addComponent(jLabel2))
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(bodyLayout.createSequentialGroup()
                                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6))
                                .addGap(32, 32, 32)
                                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(direccionField, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nombreField, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cantsectoresField, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addGroup(bodyLayout.createSequentialGroup()
                                    .addGap(107, 107, 107)
                                    .addComponent(addSector, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addGap(463, 463, 463)
                        .addComponent(guardarEstadio, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(287, Short.MAX_VALUE))
        );
        bodyLayout.setVerticalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(direccionField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cantsectoresField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addComponent(guardarEstadio, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addSector, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        jButton1.setText("<-");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(30, 30, 30))
            .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel1))
                .addGap(11, 11, 11)
                .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        contenido.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(contenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        PantallaEstadio esta = new PantallaEstadio();
            esta.setSize(1042,576);
            esta.setLocation(0,0);
            this.setVisible(false);
            esta.setVisible(true);
            body.removeAll();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void guardarEstadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarEstadioActionPerformed
        gestiondeeventos.CRUDEventos estadio = new gestiondeeventos.CRUDEventos();
        estadio.subirEstadio(nombreField, direccionField, cantsectoresField);
        

    }//GEN-LAST:event_guardarEstadioActionPerformed

    private void addSectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSectorActionPerformed
        SectorEstadio sector = new SectorEstadio();
            sector.setSize(1042,576);
            sector.setLocation(0,0);
            this.setVisible(false);
            sector.setVisible(true);
            body.removeAll();          // TODO add your handling code here:
    }//GEN-LAST:event_addSectorActionPerformed

    private void cantsectoresFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantsectoresFieldActionPerformed
     // TODO add your handling code here:
    }//GEN-LAST:event_cantsectoresFieldActionPerformed

    private void direccionFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccionFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_direccionFieldActionPerformed

    private void nombreFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreFieldActionPerformed

    private void cantsectoresFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantsectoresFieldKeyTyped
        if (cantsectoresField.getText().length() >= 2) {
            evt.consume();
        }
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }     // TODO add your handling code here:
    }//GEN-LAST:event_cantsectoresFieldKeyTyped

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addSector;
    private javax.swing.JPanel body;
    private javax.swing.JTextField cantsectoresField;
    private javax.swing.JPanel contenido;
    private javax.swing.JTextField direccionField;
    private javax.swing.JButton guardarEstadio;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nombreField;
    // End of variables declaration//GEN-END:variables
}
