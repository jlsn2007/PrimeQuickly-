package Controlador;

import Modelo.Encriptacion;
import Modelo.Usuario;
import Vista.frmLogin;
import Vista.frmRecuperarcontrasena;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;


public class ctrlLogin implements MouseListener, KeyListener{
    
     Usuario ModeloUsuario;
     frmLogin Vistalogin;
    
    public ctrlLogin(Usuario usuarios, frmLogin frmlogin){
        
        this.ModeloUsuario = usuarios;
        this.Vistalogin = frmlogin;
        
        frmlogin.btntxtRecucontra.addMouseListener(this);
        frmlogin.btnSiguiente.addMouseListener(this);
        frmlogin.txtCorreo.addMouseListener(this);
        frmlogin.txtContrasena.addMouseListener(this);
        
    }
       

    @Override
    public void mouseClicked(MouseEvent e) {
        
        if (e.getSource() == Vistalogin.btnSiguiente) {
            System.out.println("se dio clic");
            ModeloUsuario.setCorreo_electronico(Vistalogin.txtCorreo.getText());
            ModeloUsuario.setContraseña (ModeloUsuario.SHA256(Vistalogin.txtContrasena.getText()));
            
            // Validación del correo electrónico en el login
            
            String correo = Vistalogin.txtCorreo.getText();
            if (!correo.endsWith("@ricaldone.edu.sv")) {
                JOptionPane.showMessageDialog(Vistalogin, "El correo debe terminar con @ricaldone.edu.sv");
                return;
            }
 
            // Validación de la conraseña en el login
            
            if (ModeloUsuario.SHA256(Vistalogin.txtContrasena.getText()).length() < 7) {

                JOptionPane.showMessageDialog(Vistalogin, "La contraseña debe tener más de 7 caracteres");
                return;
            } 
            
            
            boolean comprobar = ModeloUsuario.IniciarSesion();
            
            if (comprobar == true) {
                JOptionPane.showMessageDialog(Vistalogin,"¡Bienvenido!");
            } else {
                JOptionPane.showMessageDialog(Vistalogin, "Usuario inexistente");

            }
            
                Vista.frmMenuAdmin.initfrmMenuAdmin();
                Vistalogin.dispose();
                               
        }
        
      
        if (e.getSource() == Vistalogin.btntxtRecucontra) {
            Vista.frmRecuperarcontrasena.initfrmRecucontra();
            Vistalogin.dispose();
        }

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

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
    
}

