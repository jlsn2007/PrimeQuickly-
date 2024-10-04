package Controlador;


import Vista.frmAgregarusuarios;
import Vista.frmMenuAdmin;
import Vista.panelCalendario;
import Vista.panelConfiguracion;
import Vista.panelPrincipaladmin;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class ctrlfrmMenuAdmin implements MouseListener{
    
    frmMenuAdmin vistaa;
    frmAgregarusuarios vistaus;
    panelPrincipaladmin Panelprincipal;
    panelCalendario Panelcalen;
    
    
    public ctrlfrmMenuAdmin(frmMenuAdmin Vista, frmAgregarusuarios Vistaus, panelPrincipaladmin panelprincipal){
        
        this.vistaa = Vista;
        //this.Panelcalen = panelcalen; 
        this.Panelprincipal = panelprincipal;
        this.vistaus = Vistaus;
        
        
        vistaa.btnHome.addMouseListener(this);
        vistaa.btnCalendar.addMouseListener(this);
        vistaa.btnSettings.addMouseListener(this);
        
        Panelprincipal.btnPagregarus.addMouseListener(this);
        Panelprincipal.btnPasishoras.addMouseListener(this);
        Panelprincipal.btnPverhishoras.addMouseListener(this);
        Panelprincipal.btnPverus.addMouseListener(this);
        
//        Panelcalen.btnfrmagregareventos.addMouseListener(this);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
        if(e.getSource() == vistaa.btnHome){
            panelPrincipaladmin objpadmin = new panelPrincipaladmin();
            
            vistaa.jpContenedor.removeAll();
            vistaa.jpContenedor.add(objpadmin);
            vistaa.jpContenedor.revalidate();
            vistaa.jpContenedor.repaint();
            
        }
        
        if(e.getSource() == vistaa.btnCalendar){
            panelCalendario objcal = new panelCalendario();
            
            vistaa.jpContenedor.removeAll();
            vistaa.jpContenedor.add(objcal);
            vistaa.jpContenedor.revalidate();
            vistaa.jpContenedor.repaint();
        }
        
        if(e.getSource() == vistaa.btnSettings){
            panelConfiguracion objconfig = new panelConfiguracion();
            
            vistaa.jpContenedor.removeAll();
            vistaa.jpContenedor.add(objconfig);
            vistaa.jpContenedor.revalidate();
            vistaa.jpContenedor.repaint();
        }
            
        if(e.getSource() == Panelprincipal.btnPagregarus){ 
            Vista.frmAgregarusuarios.initfrmAgregarusuarios();
            vistaa.dispose();
            
        }
        
        /*if(e.getSource() == Panelcalen.btnfrmagregareventos){ 
            Vista.frmAgregareventos.initfrmAgregareventos();
            vistaa.dispose();
            
        }*/
        
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
    
}
