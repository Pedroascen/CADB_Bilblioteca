package Controlador;

import Modelo.UsuarioDataLogin;
import Modelo.UsuarioSQL;
import Vista.AdministrarUsuario;
import Vista.Login;
import Vista.ModificarUsuarios;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;

public class UsuarioCtrl {
     //llamada al manejo de errores
    static final Logger log = Logger.getLogger(UsuarioCtrl.class);
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
            log.warn("Advertencia de inicio sesion.");
            JOptionPane.showMessageDialog(null, "No se pudo autentificar su identidad.\n Verifique su carnet y contraseña.");
            return false;
        }
    }

    //metodo para guardar
    public boolean Guardar(String nombre, String apellido, String contrasenia, int id_rol) {
        //confirmar si el resultado es true o false
        if (usrsql.registrar(nombre, apellido, contrasenia, id_rol)) {
            JOptionPane.showMessageDialog(null, "El registro se guardo con exito.");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "El registro no se guardo...");
            return false;
        }
    }

    //metodo para guardar
    public boolean Actualizar(String carnet, String nombre, String apellido, String contrasenia, int id_rol) {
        //confirmar si el resultado es true o false
        if (usrsql.actualizar(carnet, nombre, apellido, contrasenia, id_rol)) {
            JOptionPane.showMessageDialog(null, "El usuario: " + carnet + " se actualizo con exito.");
            return true;
        } else {
            log.error("Error al iniciar sesion.");
            //JOptionPane.showMessageDialog(null, "" + carnet + ":" + nombre + ":" + apellido + ":" + contrasenia + ":" + id_rol);
            JOptionPane.showMessageDialog(null, "El registro no se pudo actualizar...");
            return false;
        }
    }

    //metodo para listar en tabla
    public boolean ListarUsuario() {
        if (usrsql.obtenerUsuarios().getColumnCount() > 0) {
            JOptionPane.showMessageDialog(null, "Hay usuarios que cargar." + usrsql.obtenerUsuarios().getColumnCount());
        } else {
            log.error("Error al mostrar usuarios.");
            JOptionPane.showMessageDialog(null, "No hay registros que mostrar.");
        }
        return true;
    }

    //metodo para listar en tabla
    public boolean ObtenerUsuarioPorCarnet(String carnet) {
        //arreglo para los datos del usuario
        ArrayList lstusr = new ArrayList<>();
        //llamando a la vista del formulario
        ModificarUsuarios modusr = new ModificarUsuarios();
        //variables a mostrar
        String nombre = "", apellido = "", contrasena = "", id_rol = "";
        if (usrsql.obtenerUsuarioPorCarnet(carnet).size() > 0) {
            lstusr = usrsql.obtenerUsuarioPorCarnet(carnet);
            for (int i = 0; i < lstusr.size(); i++) {
                nombre = (String) lstusr.get(0);
                apellido = (String) lstusr.get(1);
                carnet = (String) lstusr.get(2);
                contrasena = (String) lstusr.get(3);
                id_rol = (String) lstusr.get(4);
            }
            modusr.mostrarDatos(carnet, nombre, apellido, contrasena, id_rol);
            modusr.setVisible(true);
            //JOptionPane.showMessageDialog(null, "Hay usuarios que cargar." + id_rol);
            return true;
        } else {
            log.warn("No se encontraron registros.");
            JOptionPane.showMessageDialog(null, "No hay registros que mostrar.");
            return false;
        }
    }

}
