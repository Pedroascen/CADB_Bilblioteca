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
import org.apache.log4j.Logger;

/**
 *
 * @author Jazmine
 */
public class RevistaSQL {
    //Llamando a la libreria del framwork log4j que nos servirá para el manejo de errores.
    static final Logger log = Logger.getLogger(RevistaSQL.class);

     //Métodos para insertar y actualizar:
     public boolean insert_update (String codMaterial, String titulo, String ufisica, String cejemp, String editorial, String issn, String idioma, String tamano, String periodicidad, String fechapublicacion ){
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        int rows = 0;//registra no de registros afectados
        try {
            conn = Conexion.getConnection();
            //Llama al procedimiento almacenado  call new_upd_revista('"+codMaterial+"','"+titulo+"','"+autor+"','"+npaginas+"','"+editorial+"','"+isbn+"','"+anio+"');
            stmt = conn.prepareStatement("call new_upd_revista('"+codMaterial+"','"+titulo+"','"+ufisica+"','"+cejemp+"','"+editorial+"','"+issn+"','"+idioma+"','"+tamano+"','"+periodicidad+"','"+fechapublicacion+"');");
            System.out.println(codMaterial+", "+titulo+", "+ufisica+", "+cejemp+", "+editorial+", "+issn+", "+idioma+", "+tamano+", "+periodicidad+","+ fechapublicacion);
            System.out.println("Ejecutando query.");
            stmt.executeQuery();//no registros afectados
            //System.out.println("No Registros afectados: "+rows);
            return true;
        } catch (SQLException sqle) {
            log.error("Error al guardar registros de revista: "+sqle);
            return false;
        } finally{
            Conexion.close(stmt);
            Conexion.close(conn);
        }      
    }
}
