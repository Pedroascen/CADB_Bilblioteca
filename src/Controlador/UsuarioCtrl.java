package Controlador;

import Modelo.UsuarioDataLogin;
import Modelo.UsuarioSQL;
import Vista.Login;
import Vista.ModificarUsuarios;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class UsuarioCtrl {
    //instancia de la entidad

    UsuarioSQL usrsql = new UsuarioSQL();

    //metodo para iniciar sesion
    public boolean Login(String carnet, String contrasenia) {
        UsuarioDataLogin usrlog = new UsuarioDataLogin();
        usrlog.setCarnet(carnet);
        usrlog.setContrasenia(contrasenia);
        if (usrsql.login(usrlog)) {
            Login frmLogin = new Login();
            frmLogin.mostrarHome(usrlog);
            //JOptionPane.showMessageDialog(null, "El usuario ingreso con exito.");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo autentificar su identidad.\n Verifique su carnet y contraseña.");
            return false;
        }
    }

    //metodo para guardar
    public boolean Guardar(String nombre, String apellido, String carnet, String contrasenia, int id_rol) {
        //confirmar si el resultado es true o false
        if (usrsql.registrar(nombre, apellido, carnet, contrasenia, id_rol)) {
            JOptionPane.showMessageDialog(null, "El registro se guardo con exito.");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "El registro no se guardo...");
            return false;
        }
    }

    //metodo para listar en tabla
    public boolean ListarUsuario() {
        if (usrsql.obtenerUsuarios().getColumnCount() > 0) {
            JOptionPane.showMessageDialog(null, "Hay usuarios que cargar." + usrsql.obtenerUsuarios().getColumnCount());
        } else {
            JOptionPane.showMessageDialog(null, "No hay registros que mostrar.");
        }
        return true;
    }

    //metodo para listar en tabla
    public boolean ObtenerUsuarioPorCarnet(String carnet) {
        //arreglo para los datos del usuario
        ArrayList lstusr = new ArrayList<>();
        //llamando a la vista del formulario
        ModificarUsuarios modif = new ModificarUsuarios();
        //variables a mostrar
        String nombre = "", apellido = "", contrasena = "";
        int id_rol=0;
        if (usrsql.obtenerUsuarioPorCarnet(carnet).size() > 0) {
            lstusr = usrsql.obtenerUsuarioPorCarnet(carnet);
            
            for (int i = 0; i < lstusr.size(); i++) {
                apellido = (String) lstusr.get(1);
                nombre = (String) lstusr.get(2);
                carnet = (String) lstusr.get(3);
                contrasena = (String) lstusr.get(4);
                //id_rol = (int) lstusr.get(5);
            }
            //JOptionPane.showMessageDialog(null, "Hay usuarios que cargar."+String.valueOf(id_rol));
        } else {
            JOptionPane.showMessageDialog(null, "No hay registros que mostrar.");
        }
        return true;
    }

}
