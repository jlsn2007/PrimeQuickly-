package Vista;

import Controlador.ctrlAgregarusuarios;
import Modelo.Comite;
import Modelo.Grado;
import Modelo.Rol;
import Modelo.Usuario;


public class frmAgregarusuarios extends javax.swing.JFrame {

    
    public frmAgregarusuarios() {
        initComponents();
        this.setLocationRelativeTo(this);
    }

   public static void initfrmAgregarusuarios(){
       frmMenuAdmin vista = new frmMenuAdmin();
       panelPrincipaladmin panel = new panelPrincipaladmin();
       frmAgregarusuarios vista2 = new frmAgregarusuarios();
       Rol modeloRol = new Rol();
       Grado modeloGrado = new Grado();
       Comite modeloComite = new Comite();
       Usuario modeloUsuario = new Usuario();
       
       ctrlAgregarusuarios controlador = new ctrlAgregarusuarios(vista2, vista, panel, modeloRol, modeloGrado, modeloComite, modeloUsuario);
       
       vista2.setVisible(true);
   }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtNombreus = new javax.swing.JTextField();
        txtCorreous = new javax.swing.JTextField();
        cbRol = new javax.swing.JComboBox<>();
        btnAgregarusuario = new javax.swing.JButton();
        imgbtnEliminar = new javax.swing.JLabel();
        imgbtnEditar = new javax.swing.JLabel();
        cbComite = new javax.swing.JComboBox<>();
        cbGrado = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbUsuarios = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtContraus = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombreus.setBackground(new java.awt.Color(233, 233, 233));
        txtNombreus.setFont(new java.awt.Font("Inter 18pt SemiBold", 0, 12)); // NOI18N
        txtNombreus.setForeground(new java.awt.Color(102, 102, 102));
        txtNombreus.setBorder(null);
        txtNombreus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreusActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombreus, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 116, 287, 51));

        txtCorreous.setBackground(new java.awt.Color(233, 233, 233));
        txtCorreous.setFont(new java.awt.Font("Inter 18pt SemiBold", 0, 12)); // NOI18N
        txtCorreous.setForeground(new java.awt.Color(102, 102, 102));
        txtCorreous.setBorder(null);
        txtCorreous.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreousActionPerformed(evt);
            }
        });
        jPanel1.add(txtCorreous, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 194, 287, 51));

        cbRol.setFont(new java.awt.Font("Inter 18pt ExtraBold", 0, 12)); // NOI18N
        cbRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbRolActionPerformed(evt);
            }
        });
        jPanel1.add(cbRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 347, 100, -1));

        btnAgregarusuario.setBackground(new java.awt.Color(0, 153, 51));
        btnAgregarusuario.setFont(new java.awt.Font("Inter 18pt ExtraBold", 0, 14)); // NOI18N
        btnAgregarusuario.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarusuario.setText("Agregar");
        jPanel1.add(btnAgregarusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 390, 130, 41));

        imgbtnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/b.png"))); // NOI18N
        jPanel1.add(imgbtnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(695, 451, -1, -1));

        imgbtnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/e.png"))); // NOI18N
        jPanel1.add(imgbtnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 448, -1, -1));

        cbComite.setFont(new java.awt.Font("Inter 18pt ExtraBold", 0, 12)); // NOI18N
        cbComite.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cbComite, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 347, 90, -1));

        cbGrado.setFont(new java.awt.Font("Inter 18pt ExtraBold", 0, 12)); // NOI18N
        cbGrado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cbGrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 398, 100, -1));

        jtbUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        jtbUsuarios.setFont(new java.awt.Font("Inter 18pt ExtraBold", 1, 10)); // NOI18N
        jtbUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtbUsuarios.setGridColor(new java.awt.Color(204, 204, 255));
        jScrollPane1.setViewportView(jtbUsuarios);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 42, 575, 366));

        jLabel1.setFont(new java.awt.Font("Inter 18pt Black", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(138, 85, 226));
        jLabel1.setText("Agregar Usuario");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 42, -1, -1));

        txtContraus.setBackground(new java.awt.Color(233, 233, 233));
        txtContraus.setFont(new java.awt.Font("Inter 18pt SemiBold", 0, 12)); // NOI18N
        txtContraus.setForeground(new java.awt.Color(102, 102, 102));
        txtContraus.setBorder(null);
        txtContraus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContrausActionPerformed(evt);
            }
        });
        jPanel1.add(txtContraus, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 278, 287, 51));

        jLabel2.setFont(new java.awt.Font("Inter 18pt Medium", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 153, 255));
        jLabel2.setText("Editar");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(449, 463, -1, -1));

        jLabel3.setFont(new java.awt.Font("Inter 18pt Medium", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 255));
        jLabel3.setText("Eliminar");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(641, 459, -1, -1));

        jLabel4.setFont(new java.awt.Font("Inter 18pt Medium", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Nombre");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 95, -1, -1));

        jLabel5.setFont(new java.awt.Font("Inter 18pt Medium", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Correo electrónico");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 173, -1, -1));

        jLabel6.setFont(new java.awt.Font("Inter 18pt Medium", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Contraseña");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 257, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreusActionPerformed

    private void txtCorreousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreousActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreousActionPerformed

    private void txtContrausActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContrausActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContrausActionPerformed

    private void cbRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbRolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbRolActionPerformed

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
            java.util.logging.Logger.getLogger(frmAgregarusuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAgregarusuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAgregarusuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAgregarusuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAgregarusuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAgregarusuario;
    public javax.swing.JComboBox<String> cbComite;
    public javax.swing.JComboBox<String> cbGrado;
    public javax.swing.JComboBox<String> cbRol;
    public javax.swing.JLabel imgbtnEditar;
    public javax.swing.JLabel imgbtnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jtbUsuarios;
    public javax.swing.JTextField txtContraus;
    public javax.swing.JTextField txtCorreous;
    public javax.swing.JTextField txtNombreus;
    // End of variables declaration//GEN-END:variables
}
