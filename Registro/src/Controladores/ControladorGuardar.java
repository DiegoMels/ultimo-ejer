package Controladores;

import DAO.Consulta;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
import principal.Datos_Registro;

public class ControladorGuardar implements MouseListener  {
    private JTextField nombre, apellido, dni, calle, altura;
    Datos_Registro datosRegistro = new Datos_Registro();
    Consulta consultar;
    
    
    public ControladorGuardar(JTextField txtNombre, JTextField txtApellido, JTextField txtDni, JTextField txtCalle, JTextField txtAltura) {
        this.nombre = txtNombre;
        this.apellido = txtApellido;
        this.dni = txtDni;
        this.calle = txtCalle;
        this.altura = txtAltura;
        
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        
        consultar = new Consulta();
         
        try {
            consultar.GrabarCalculo(nombre, apellido, dni, calle, altura);
        } catch (SQLException ex) {
            Logger.getLogger(ControladorGuardar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ControladorGuardar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
            
        
    }

    @Override
    public void mousePressed(MouseEvent me) {
    }

    @Override
    public void mouseReleased(MouseEvent me) {
    }

    @Override
    public void mouseEntered(MouseEvent me) {
    }

    @Override
    public void mouseExited(MouseEvent me) {
    }
    
    
    
}
