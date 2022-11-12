package Modelo;

import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class UsuarioSQL extends Conexion {

    private final String SQL_SELECT = "SELECT u.carnet,u.nombre, u.apellido,r.nombre_rol FROM usuario AS u INNER JOIN rol AS r ON u.id_rol = r.id";
    private final String SQL_SELECT_BY_CARNET = "SELECT nombre,apellido,carnet,contrasena,id_rol FROM usuario WHERE carnet = ?";
    private final String SQL_UPDATE = "UPDATE usuario SET nombre=?, apellido=?, contrasena=?, id_rol=? WHERE carnet=?";
    
    //metodo para validar usuario en login
    public boolean login(UsuarioDataLogin usrlog) {
        //inicializacion de las variables
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int rows = 0;

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement("SELECT u.carnet,u.contrasena,u.id_rol,r.nombre_rol FROM usuario AS u INNER JOIN rol AS r ON u.id_rol = r.id WHERE carnet = ?");

            int i = 1;//contador para la columnas para guardar registro
            stmt.setString(i++, usrlog.getCarnet());
            rs = stmt.executeQuery();
            //se recorre el registro obtenido por el carnet
            while (rs.next()) {
                //se valida la contrasenia
                if (usrlog.getContrasenia().equals(rs.getString(2))) {
                    usrlog.setCarnet(rs.getString(1));
                    usrlog.setId_rol(rs.getInt(3));
                    usrlog.setNombre_TipoUser(rs.getString(4));
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
            Conexion.close(rs);
            Conexion.close(conn);
        }
    }

    //metodo para registrar usuarios
    public boolean registrar(String nombre, String apellido, String contrasenia, int id_rol) {
        //inicializacion de las variables
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int rows = 0;

        try {
            //se crea la conexion con la base +"','"+descripcion+"');"
            conn = Conexion.getConnection();
            //se declara la sentencia sql
            stmt = conn.prepareStatement("call new_user('"+nombre+"','"+apellido+"','"+contrasenia+"','"+id_rol+"');");
            stmt.executeQuery();
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
    
    //metodo para actualizar usuarios
    public boolean actualizar(String carnet, String nombre, String apellido, String contrasena, int id_rol) {
        //inicializacion de las variables
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;//no se usa
        int rows = 0;

        try {
            //se crea la conexion con la base
            conn = Conexion.getConnection();
            //se declara la sentencia sql
            stmt = conn.prepareStatement(SQL_UPDATE);
            int i = 1;//contador para la columnas para guardar registro
            stmt.setString(i++, nombre);
            stmt.setString(i++, apellido);
            stmt.setString(i++, contrasena);
            stmt.setInt(i++, id_rol);
            stmt.setString(i, carnet);
            //ejecutando el query
            rows = stmt.executeUpdate();
            //mensaje de salida
            System.out.println("No Registros afectados: " + rows);
            return true;
            
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, ""+carnet+":"+nombre+":"+apellido+":"+contrasena+":"+id_rol);
            sqle.printStackTrace();
            System.err.println(sqle);
            return false;
            //cerramos la conexion
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
    }

    //metodo para obtener usuario por carnet
    public ArrayList obtenerUsuarioPorCarnet(String Icarnet) {
        //inicializacion de las variables
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList lstusr = new ArrayList();
        int rows = 0;
        try {
            //se inicia la conexion con la base
            conn = Conexion.getConnection();
            //llamando sentencia sql
            stmt = conn.prepareStatement(SQL_SELECT_BY_CARNET);
            stmt.setString(1, Icarnet);
            //ejecutando
            rs = stmt.executeQuery();

            while (rs.next()) {
                int id_rol = rs.getInt(5);
                String idRol = String.valueOf(id_rol);
                
                lstusr.add(rs.getString(1));
                lstusr.add(rs.getString(2));
                lstusr.add(rs.getString(3));
                lstusr.add(rs.getString(4));
                lstusr.add(idRol);
            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();

        } finally {
            Conexion.close(conn);
            Conexion.close(stmt);
            Conexion.close(rs);
        }
        return lstusr;
    }

    //metodo para listar estudiantes en tablas
    public DefaultTableModel obtenerUsuarios() {
        //inicializacion de las variables
        DefaultTableModel dtm = new DefaultTableModel();
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            //se inicia la conexion con la base
            conn = Conexion.getConnection();
            //llamando sentencia sql
            stmt = conn.prepareStatement(SQL_SELECT);
            //ejecutando
            rs = stmt.executeQuery();
            //obteniendo valores en ResultSetMetaData para DefaultTable
            ResultSetMetaData meta = rs.getMetaData();
            int numeroColumnas = meta.getColumnCount();
            //Formando encabezado para DefaultTable
            for (int i = 1; i <= numeroColumnas; i++) {
                dtm.addColumn(meta.getColumnLabel(i));
            }
            //creando las filas segun los datos obtenidos
            while (rs.next()) {
                Object[] fila = new Object[numeroColumnas];
                for (int i = 0; i < numeroColumnas; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                //se agrega el regitro en la fila de la tabla
                dtm.addRow(fila);
            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();

        } finally {
            Conexion.close(conn);
            Conexion.close(stmt);
            Conexion.close(rs);
        }
        return dtm;
    }
}
