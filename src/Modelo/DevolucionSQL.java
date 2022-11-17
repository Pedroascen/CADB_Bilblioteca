/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;

/**
 *
 * @author Rocio Abrego
 */
public class DevolucionSQL {

    //Llamando a la libreria del framwork log4j que nos servirá para el manejo de errores.
    static final Logger log = Logger.getLogger(DevolucionSQL.class);

    //METODO PARA OBTENER LOS PRESTAMOS ACTIVOS
    private final String SQL_SELECT_PRESTAMOS_ACTIVE = "SELECT p.carnet,p.codmaterial,m.titulo,p.fecha_inicio,p.fecha_fin,p.mora,p.estado FROM prestamo AS p INNER JOIN material AS m ON p.codmaterial = m.codigoMaterial WHERE p.estado=1 ORDER BY fecha_fin DESC;";
    private final String SQL_SELECT_PRESTAMOS_INACTIVE = "SELECT p.carnet,p.codmaterial,m.titulo,p.fecha_inicio,p.fecha_fin,p.fecha_devolucion,p.mora,p.estado FROM prestamo AS p INNER JOIN material AS m ON p.codmaterial = m.codigoMaterial WHERE p.estado=0 ORDER BY fecha_fin DESC;";

    public String GuardarDevolucion(String materialId, String carnetId) {
        //inicializacion de las variables
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String Result = "", PrestamoId = "";

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement("CALL `biblioteca`.`devolucion`('" + materialId + "', '" + carnetId + "');");

            rs = stmt.executeQuery();

            while (rs.next()) {
                Result = rs.getString(1);
                PrestamoId = rs.getString(2);
            }

        } catch (SQLException sqle) {
            log.error("insertar devolucion: " + sqle);
            //cerramos la conexion
        } finally {
            Conexion.close(stmt);
            Conexion.close(rs);
            Conexion.close(conn);
        }

        return Result;
    }

    //metodo para listar prestamos en tablas
    public DefaultTableModel obtenerPrestamosActive() {
        //inicializacion de las variables
        DefaultTableModel dtm = new DefaultTableModel();
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            //se inicia la conexion con la base
            conn = Conexion.getConnection();
            //llamando sentencia sql
            stmt = conn.prepareStatement(SQL_SELECT_PRESTAMOS_ACTIVE);
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
            log.error("Error al listar los prestamos activos: " + sqle);
        } finally {
            Conexion.close(conn);
            Conexion.close(stmt);
            Conexion.close(rs);
        }
        return dtm;
    }

    //metodo para listar prestamos en tablas
    public DefaultTableModel obtenerTodosPrestamosActive() {
        //inicializacion de las variables
        DefaultTableModel dtm = new DefaultTableModel();
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            //se inicia la conexion con la base
            conn = Conexion.getConnection();
            //llamando sentencia sql
            stmt = conn.prepareStatement(SQL_SELECT_PRESTAMOS_INACTIVE);
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
            log.error("Error al listar todos los prestamos: " + sqle);
        } finally {
            Conexion.close(conn);
            Conexion.close(stmt);
            Conexion.close(rs);
        }
        return dtm;
    }
}
