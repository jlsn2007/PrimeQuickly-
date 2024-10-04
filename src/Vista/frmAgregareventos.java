package Vista;

import Controlador.ctrlAgregareventos;
import Modelo.Eventos;
import Modelo.Usuario;


public class frmAgregareventos extends javax.swing.JFrame {

    
    public frmAgregareventos() {
        initComponents();
        this.setLocationRelativeTo(this);
    }

    public static void initfrmAgregareventos(){  
        frmMenuAdmin vistaMenuAdmin = new frmMenuAdmin();
        panelCalendario panelCalendadio = new panelCalendario();
        frmAgregareventos vistaAgregareventos = new frmAgregareventos();
        Eventos modeloEventos = new Eventos();
        Usuario modeloUsuario = new Usuario();
        
        ctrlAgregareventos controlador = new ctrlAgregareventos(vistaMenuAdmin, panelCalendadio, vistaAgregareventos, modeloEventos, modeloUsuario);
        
        vistaAgregareventos.setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtDescripcion = new javax.swing.JTextField();
        txtLugar = new javax.swing.JTextField();
        txtHora = new javax.swing.JTextField();
        txtNombreevento = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbEventos = new javax.swing.JTable();
        btnEditar = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnAgregareventos = new javax.swing.JButton();
        btnvolvercalendario = new javax.swing.JLabel();
        cbUsuario = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        jLabel6.setFont(new java.awt.Font("Inter 18pt Medium", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Fecha:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtDescripcion.setBackground(new java.awt.Color(233, 233, 233));
        txtDescripcion.setFont(new java.awt.Font("Inter 18pt SemiBold", 0, 12)); // NOI18N
        txtDescripcion.setForeground(new java.awt.Color(102, 102, 102));
        txtDescripcion.setBorder(null);
        txtDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripcionActionPerformed(evt);
            }
        });
        jPanel1.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 330, 104));

        txtLugar.setBackground(new java.awt.Color(233, 233, 233));
        txtLugar.setFont(new java.awt.Font("Inter 18pt SemiBold", 0, 12)); // NOI18N
        txtLugar.setForeground(new java.awt.Color(102, 102, 102));
        txtLugar.setBorder(null);
        txtLugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLugarActionPerformed(evt);
            }
        });
        jPanel1.add(txtLugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 330, 40));

        txtHora.setBackground(new java.awt.Color(233, 233, 233));
        txtHora.setFont(new java.awt.Font("Inter 18pt SemiBold", 0, 12)); // NOI18N
        txtHora.setForeground(new java.awt.Color(102, 102, 102));
        txtHora.setBorder(null);
        txtHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoraActionPerformed(evt);
            }
        });
        jPanel1.add(txtHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 160, 40));

        txtNombreevento.setBackground(new java.awt.Color(233, 233, 233));
        txtNombreevento.setFont(new java.awt.Font("Inter 18pt SemiBold", 0, 12)); // NOI18N
        txtNombreevento.setForeground(new java.awt.Color(102, 102, 102));
        txtNombreevento.setBorder(null);
        txtNombreevento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreeventoActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombreevento, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 330, 40));

        txtFecha.setBackground(new java.awt.Color(233, 233, 233));
        txtFecha.setFont(new java.awt.Font("Inter 18pt SemiBold", 0, 12)); // NOI18N
        txtFecha.setForeground(new java.awt.Color(102, 102, 102));
        txtFecha.setBorder(null);
        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });
        jPanel1.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 160, 40));

        jtbEventos.setBackground(new java.awt.Color(255, 255, 255));
        jtbEventos.setFont(new java.awt.Font("Inter 18pt Medium", 1, 10)); // NOI18N
        jtbEventos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtbEventos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, 490, 299));

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/e.png"))); // NOI18N
        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 360, -1, -1));

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/b.png"))); // NOI18N
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 360, -1, -1));

        jLabel8.setFont(new java.awt.Font("Inter 18pt Medium", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 153, 255));
        jLabel8.setText("Editar");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 400, -1, -1));

        jLabel9.setFont(new java.awt.Font("Inter 18pt Medium", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 255));
        jLabel9.setText("Eliminar");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 400, -1, -1));

        btnAgregareventos.setBackground(new java.awt.Color(0, 153, 51));
        btnAgregareventos.setFont(new java.awt.Font("Inter 18pt ExtraBold", 1, 14)); // NOI18N
        btnAgregareventos.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregareventos.setText("Agregar");
        jPanel1.add(btnAgregareventos, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, 120, 46));

        btnvolvercalendario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Back.png"))); // NOI18N
        jPanel1.add(btnvolvercalendario, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 16, -1, -1));

        cbUsuario.setFont(new java.awt.Font("Inter 18pt ExtraBold", 1, 12)); // NOI18N
        cbUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cbUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 126, 34));

        jLabel1.setFont(new java.awt.Font("Inter 28pt Black", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("Agregar Eventos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionActionPerformed

    private void txtLugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLugarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLugarActionPerformed

    private void txtHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoraActionPerformed

    private void txtNombreeventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreeventoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreeventoActionPerformed

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaActionPerformed

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
            java.util.logging.Logger.getLogger(frmAgregareventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAgregareventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAgregareventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAgregareventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                initfrmAgregareventos();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAgregareventos;
    public javax.swing.JLabel btnEditar;
    public javax.swing.JLabel btnEliminar;
    public javax.swing.JLabel btnvolvercalendario;
    public javax.swing.JComboBox<String> cbUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jtbEventos;
    public javax.swing.JTextField txtDescripcion;
    public javax.swing.JTextField txtFecha;
    public javax.swing.JTextField txtHora;
    public javax.swing.JTextField txtLugar;
    public javax.swing.JTextField txtNombreevento;
    // End of variables declaration//GEN-END:variables
}
