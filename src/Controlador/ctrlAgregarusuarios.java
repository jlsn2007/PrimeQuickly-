package Controlador;

import Modelo.Comite;
import Modelo.Grado;
import Modelo.Rol;
import Modelo.Usuario;
import Vista.frmAgregarusuarios;
import Vista.frmMenuAdmin;
import Vista.panelPrincipaladmin;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;


public class ctrlAgregarusuarios implements MouseListener{
    
    //Creamos los métodos
    
    private frmMenuAdmin vistaa;
    private panelPrincipaladmin panel;
    private frmAgregarusuarios vistaus;
    
    private Usuario ModeloUsuario;
    private Rol ModeloRol;
    private Grado ModeloGrado;
    private Comite ModeloComite;
    
    public ctrlAgregarusuarios(frmAgregarusuarios Vistaus, frmMenuAdmin Vistaa, panelPrincipaladmin Panel, 
            Rol modeloRol, Grado modeloGrado, Comite modeloComite, Usuario modeloUsuario){
        
        this.vistaus = Vistaus;
        this.vistaa = Vistaa;
        this.panel = Panel;
        this.ModeloRol = modeloRol;
        this.ModeloGrado = modeloGrado;
        this.ModeloComite = modeloComite;
        this.ModeloUsuario = modeloUsuario;
        
        this.vistaus.cbGrado.addMouseListener(this);
        this.ModeloGrado.CargarComboboxGrados(vistaus.cbGrado);
        this.vistaus.cbRol.addMouseListener(this);
        this.ModeloRol.CargarComboboxRoles(vistaus.cbRol);
        this.vistaus.cbComite.addMouseListener(this);
        this.ModeloComite.CargarComboboxComites(vistaus.cbComite);
        
        //Mandamos a llamar los elementos de la vista
        
        Vistaus.btnAgregarusuario.addMouseListener(this);
        Vistaus.imgbtnEditar.addMouseListener(this);
        Vistaus.imgbtnEliminar.addMouseListener(this);
        Vistaus.jtbUsuarios.addMouseListener(this);
        
        
        //Cargar los datos del combobox de roles con el método en el modelo Rol
        
        vistaus.cbRol.addActionListener(e ->{
            if(e.getSource()== vistaus.cbRol){
            Rol selectedItem =(Rol) vistaus.cbRol.getSelectedItem();
            if(selectedItem != null){
                int idr = selectedItem.getId_rol();
                ModeloRol.setId_rol(idr);
            }
        }
        });
        
        //Cargar los datos del combobox de roles con el método en el modelo Grado
        
        vistaus.cbGrado.addActionListener(e ->{
            if(e.getSource()== vistaus.cbGrado){
            Grado selectedItem =(Grado) vistaus.cbGrado.getSelectedItem();
            if(selectedItem != null){
                int idg = selectedItem.getId_grado();
                ModeloGrado.setId_grado(idg);
            }
            else{
                
            }
        }
        });
        
        //Cargar los datos del combobox de roles con el método en el modelo Comite
        
        vistaus.cbComite.addActionListener(e ->{
            if(e.getSource()== vistaus.cbComite){
            Comite selectedItem =(Comite) vistaus.cbComite.getSelectedItem();
            if(selectedItem != null){
                String idc =selectedItem.getComite();
                ModeloComite.setComite(idc);
            }
        }
        });
        
        //Se manda a llamar el método de mostrar en el ModeloUsuario para que muestre los usuarios
        
        ModeloUsuario.Mostrar(vistaus.jtbUsuarios);
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
        //Botón para guardar un usuario nuevo
        
        if(e.getSource()== vistaus.btnAgregarusuario){
            
            //Validaciones para el nombre
            
            if (vistaus.txtNombreus.getText().isEmpty()) {

                JOptionPane.showMessageDialog(vistaus, "El nombre es obligatorio");
                return;
            } 
            
            //Validaciones para el correo
            
            String correo = vistaus.txtCorreous.getText();
            
            if (!correo.endsWith("@ricaldone.edu.sv")) {
                JOptionPane.showMessageDialog(vistaus, "El correo debe terminar con @ricaldone.edu.sv");
                return;
            }
            
            //Validaciones para la contraseña
            
            if (ModeloUsuario.SHA256(vistaus.txtContraus.getText()).length() < 7) {

                JOptionPane.showMessageDialog(vistaus, "La contraseña debe tener más de 7 caracteres");
                return;
            } 
            
            ModeloUsuario.setNombre(vistaus.txtNombreus.getText());
            ModeloUsuario.setCorreo_electronico(vistaus.txtCorreous.getText());
            ModeloUsuario.setContraseña(ModeloUsuario.SHA256(vistaus.txtContraus.getText()));
            
            ModeloUsuario.GuardarUsuario();          
            
            //Muestro una alerta que el usuario se ha guardado
            JOptionPane.showMessageDialog(vistaus, "Usuario Guardado");
            
            ModeloUsuario.Mostrar(vistaus.jtbUsuarios);
            
        }
        
        // Botón para editar al usuario
        
        if(e.getSource()== vistaus.imgbtnEditar){
            
            ModeloUsuario.setNombre(vistaus.txtNombreus.getText());
            ModeloUsuario.setCorreo_electronico(vistaus.txtCorreous.getText());
            ModeloUsuario.setContraseña(ModeloUsuario.SHA256(vistaus.txtContraus.getText()));
            
            ModeloUsuario.ActualizarUsuario(vistaus.jtbUsuarios);
            ModeloUsuario.Mostrar(vistaus.jtbUsuarios);
  
        }
        
        //Botón para eliminar al usuario
        
        if(e.getSource()== vistaus.imgbtnEliminar){
            
            System.err.println("Se ha eliminado un Usuario");
            ModeloUsuario.EliminarUsuario(vistaus.jtbUsuarios);
            ModeloUsuario.Mostrar(vistaus.jtbUsuarios);
  
        }
        
        if(e.getSource()== vistaus.jtbUsuarios){
            ModeloUsuario.cargarDatosTabla(vistaus);
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
    
}
