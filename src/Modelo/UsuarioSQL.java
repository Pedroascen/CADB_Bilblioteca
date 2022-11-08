package Modelo;

import Modelo.Entidad.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioSQL extends Conexion {

    //metodo para registrar usuarios
    public boolean registrar(String nombre, String apellido, String carnet, String contrasenia, int id_rol) {
        //inicializacion de las variables
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int rows = 0;

        try {
            //se crea la conexion con la base
            conn = Conexion.getConnection();
            //se declara la sentencia sql
            stmt = conn.prepareStatement("INSERT INTO usuarios (nombre,apellido,carnet,contrasenia,rol_id) VALUES(?,?,?,?,?)");
            int i = 1;//contador para la columnas para guardar registro

            stmt.setString(i++, nombre);
            stmt.setString(i++, apellido);
            stmt.setString(i++, carnet);
            stmt.setString(i++, contrasenia);
            stmt.setInt(i++, id_rol);
            rows = stmt.executeUpdate();
            System.out.println("No Registros afectados: " + rows);
            return true;

        } catch (SQLException sqle) {
            sqle.printStackTrace();
            System.err.println(sqle);
            return false;
            //cerramos la conexion
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
    }

    //metodo para validar usuario en login
    public boolean login(UsuarioDataLogin usrlog) {
        //inicializacion de las variables
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int rows = 0;

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement("SELECT u.id_usuario,u.carnet,u.contrasenia,u.rol_id,r.nombre FROM usuarios AS u INNER JOIN rol AS r ON u.rol_id = r.id_rol WHERE carnet = ?");

            int i = 1;//contador para la columnas para guardar registro
            stmt.setString(i++, usrlog.getCarnet());
            rs = stmt.executeQuery();

             while(rs.next()) {
                if (usrlog.getContrasenia().equals(rs.getString(3))) {
                    usrlog.setId_usuario(rs.getInt(1));
                    usrlog.setCarnet(rs.getString(2));
                    usrlog.setId_rol(rs.getInt(4));
                    usrlog.setNombre_TipoUser(rs.getString(5));
                    return true;
                }
            }
            return false;
        } catch (SQLException sqle) {
            sqle.printStackTrace();
            System.err.println(sqle);
            return false;
        //cerramos la conexion
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
    }
}
