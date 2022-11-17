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
public class PrestamoSQL {
    //Llamando a la libreria del framwork log4j que nos servirá para el manejo de errores.
    static final Logger log = Logger.getLogger(PrestamoSQL.class);
    //sentencias SQL
    private final String SQL_SELECT_MATERIAL_DISPO = "SELECT codigoMaterial, Titulo, ubicacionFisica, cantidadEjemplares, cantidadDisponibles FROM `material` WHERE estado=1";
    private final String SQL_SELECT_MATERIAL_NODISPO = "SELECT codigoMaterial, Titulo, ubicacionFisica, cantidadEjemplares, cantidadDisponibles FROM `material` WHERE estado=0";

    public String GuardarPrestamo(String materialId, String carnetId) {
        //inicialización de las variables
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String Result = "", PrestamoId = "";

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement("CALL `biblioteca`.`prestamo`('" + materialId + "', '" + carnetId + "');");

            rs = stmt.executeQuery();

            while (rs.next()) {
                Result = rs.getString(1);
                PrestamoId = rs.getString(2);
            }

        } catch (SQLException sqle) {
            log.error("Error al guardar registros de prestamo: "+sqle);
            //cerramos la conexión
        } finally {
            Conexion.close(stmt);
            Conexion.close(rs);
            Conexion.close(conn);
        }

        return Result;
    }

    //metodo para listar materiales en tablas
    public DefaultTableModel obtenerMaterialesDispo() {
        //inicializacion de las variables
        DefaultTableModel dtm = new DefaultTableModel();
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            //se inicia la conexion con la base
            conn = Conexion.getConnection();
            //llamando sentencia sql
            stmt = conn.prepareStatement(SQL_SELECT_MATERIAL_DISPO);
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
            log.error("Error al consultar los materiales disponibles: "+sqle);

        } finally {
            Conexion.close(conn);
            Conexion.close(stmt);
            Conexion.close(rs);
        }
        return dtm;
    }
    
    //metodo para listar materiales en tablas
    public DefaultTableModel obtenerMaterialesNoDispo() {
        //inicializacion de las variables
        DefaultTableModel dtm = new DefaultTableModel();
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            //se inicia la conexion con la base
            conn = Conexion.getConnection();
            //llamando sentencia sql
            stmt = conn.prepareStatement(SQL_SELECT_MATERIAL_NODISPO);
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
            log.error("Error al consultar los materiales no disponibles: "+sqle);

        } finally {
            Conexion.close(conn);
            Conexion.close(stmt);
            Conexion.close(rs);
        }
        return dtm;
    }
}
