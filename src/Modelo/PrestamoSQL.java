/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Rocio Abrego
 */
public class PrestamoSQL {
    
    public String GuardarPrestamo(String materialId, String carnetId) {
        //inicialización de las variables
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String Result = "", PrestamoId = "";

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement("CALL `biblioteca`.`prestamo`('"+ materialId +"', '"+ carnetId +"');");

            rs = stmt.executeQuery();
            
            while (rs.next()) {
               Result = rs.getString(1);
               PrestamoId = rs.getString(2);
            }
            
            
        } catch (SQLException sqle) {
            sqle.printStackTrace();
            System.err.println(sqle);
            //cerramos la conexión
        } finally {
            Conexion.close(stmt);
            Conexion.close(rs);
            Conexion.close(conn);
        }
        
        return Result;
    }
     
}
