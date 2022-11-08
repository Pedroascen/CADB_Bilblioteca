package Controlador;

import Modelo.UsuarioDataLogin;
import Modelo.UsuarioSQL;
import Vista.Login;
import javax.swing.JOptionPane;

public class UsuarioCtrl {

    //instancia de la entidad
    UsuarioSQL usrsql = new UsuarioSQL();

    //metodo para guardar
    public boolean Guardar(String nombre, String apellido, String carnet, String contrasenia, int id_rol) {

        //confirmar si el resultado es true o false
        if (usrsql.registrar(nombre,apellido,carnet, contrasenia,id_rol)) {
            JOptionPane.showMessageDialog(null, "El registro se guardo con exito.");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "El registro no se guardo...");
            return false;
        }
    }

    //metodo para iniciar sesion
    public boolean Login(String carnet, String contrasenia) {
        UsuarioDataLogin usrlog = new UsuarioDataLogin();
        Login frmLogin = new Login();
        usrlog.setCarnet(carnet);
        usrlog.setContrasenia(contrasenia);
        if (usrsql.login(usrlog)) {
            frmLogin.mostrarHome(usrlog);
            //JOptionPane.showMessageDialog(null, "El usuario ingreso con exito.");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo autentificar su identidad.\n Verifique su carnet y contraseña.");
            return false;
        }
    }

}
