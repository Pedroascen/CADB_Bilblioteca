package Modelo;

import Modelo.Entidad.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioSQL extends Conexion {

    //metodo para registrar usuarios
    public boolean registrar(Usuario usr) {
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

            stmt.setString(i++, usr.getNombre());
            stmt.setString(i++, usr.getApellido());
            stmt.setString(i++, usr.getCarnet());
            stmt.setString(i++, usr.getContrasenia());
            stmt.setInt(i++, usr.getId_rol());
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
    public boolean login(Usuario usr) {
        //inicializacion de las variables
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int rows = 0;

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement("SELECT id_usuario,carnet,contrasenia,rol_id FROM usuarios WHERE carnet = ?");

            int i = 1;//contador para la columnas para guardar registro
            stmt.setString(i++, usr.getCarnet());
            rs = stmt.executeQuery();

             while(rs.next()) {
                if (usr.getContrasenia().equals(rs.getString(3))) {
                    usr.setId_usuario(rs.getInt(1));
                    usr.setCarnet(rs.getString(2));
                    usr.setId_rol(rs.getInt(4));
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
