package Controlador;

import Modelo.Entidad.Usuario;
import Modelo.UsuarioSQL;
import javax.swing.JOptionPane;

public class UsuarioCtrl {

    //instancia de la entidad
    Usuario usr = new Usuario();
    UsuarioSQL usrsql = new UsuarioSQL();

    //metodo para guardar
    public boolean Guardar(String nombre, String apellido, String carnet, String contrasenia, int id_rol) {

        //datos que vienen de la vista para guardar
        usr.setNombre(nombre);
        usr.setApellido(apellido);
        usr.setCarnet(carnet);
        usr.setContrasenia(contrasenia);
        usr.setId_rol(id_rol);

        //confirmar si el resultado es true o false
        if (usrsql.registrar(usr)) {
            JOptionPane.showMessageDialog(null, "El registro se guardo con exito.");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "El registro no se guardo...");
            return false;
        }
    }

    //metodo para iniciar sesion
    public boolean Login(String carnet, String contrasenia) {
        usr.setCarnet(carnet);
        usr.setContrasenia(contrasenia);
        if (usrsql.login(usr)) {
            //JOptionPane.showMessageDialog(null, "El usuario ingreso con exito.");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo autentificar su identidad.\n Verifique su carnet y contraseña.");
            return false;
        }
    }

}
