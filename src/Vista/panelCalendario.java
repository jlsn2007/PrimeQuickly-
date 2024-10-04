package Vista;

import Controlador.ctrlfrmMenuAdmin;


public class panelCalendario extends javax.swing.JPanel {

    
    public panelCalendario() {
        initComponents();
        
        //panelCalendario panel = this;
        frmMenuAdmin vista = new frmMenuAdmin();
        frmAgregarusuarios vista2 = new frmAgregarusuarios();
        panelPrincipaladmin panel2 = new panelPrincipaladmin();
        
        ctrlfrmMenuAdmin controlador = new ctrlfrmMenuAdmin(vista, vista2, panel2);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        btnfrmagregareventos = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Inter 18pt ExtraBold", 0, 25)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Calendario");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 14, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Circlescalendar.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 330, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Circlescalendar2.png"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(762, 6, -1, -1));
        add(jCalendar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 51, 613, 350));

        btnfrmagregareventos.setBackground(new java.awt.Color(248, 48, 48));
        btnfrmagregareventos.setFont(new java.awt.Font("Inter 18pt ExtraBold", 1, 12)); // NOI18N
        btnfrmagregareventos.setForeground(new java.awt.Color(255, 255, 255));
        btnfrmagregareventos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Eventos.png"))); // NOI18N
        btnfrmagregareventos.setText("Agregar eventos");
        add(btnfrmagregareventos, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 407, 177, 51));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnfrmagregareventos;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
