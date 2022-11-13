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
import java.util.ArrayList;

/**
 *
 * @author Rocio Abrego
 */
public class ConsultaEjemplaresSQL {
    public ArrayList<ConsultaEjemplares> ConsultarEjemplares(String titulo, String autor, String tipoMaterial, String idioma, String orderby) {
        //inicializacion de las variables
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int rows = 0;
        ArrayList<ConsultaEjemplares> resultado = new ArrayList<>();
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement("CALL `biblioteca`.`consulta_ejemplares`('"+ titulo +"', '"+ autor +"','"+ tipoMaterial +"','"+ idioma +"','"+ orderby +"');");

            rs = stmt.executeQuery();
            
            while (rs.next()) {

               //Result = rs.getString(1);
               ConsultaEjemplares ce = new ConsultaEjemplares();
               ce.setTipoMaterial(rs.getString(1));
               ce.setCodigoMaterial(rs.getString(2));
               ce.setTitulo(rs.getString(3));
               ce.setAutores(rs.getString(4));
               ce.setMaterialInfo(rs.getString(5));
               
               resultado.add(ce);
            }
            
            
        } catch (SQLException sqle) {
            sqle.printStackTrace();
            System.err.println(sqle);
            //cerramos la conexion
        } finally {
            Conexion.close(stmt);
            Conexion.close(rs);
            Conexion.close(conn);
        }
        
        return resultado;
    }
}
