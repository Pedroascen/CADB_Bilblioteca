package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CdSQL {
        //metodos para insertar y actualizar
    public boolean insert_update(String codMaterial, String titulo, String ufisica, String cejemp, String autor,String paispubli, String ciudadpub,String anio_publi, String volumen, String idioma, String tema){
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        int rows = 0;//registra no de registros afectados
        try {
            conn = Conexion.getConnection();
            //llamada al procedimiento almacenado  call new_upd_libro('"+codMaterial+"','"+titulo+"','"+autor+"','"+npaginas+"','"+editorial+"','"+isbn+"','"+anio+"');
            stmt = conn.prepareStatement("call new_upd_cd('"+codMaterial+"','"+titulo+"','"+ufisica+"','"+cejemp+"','"+autor+"','"+paispubli+"','"+ciudadpub+"','"+anio_publi+"','"+volumen+"','"+idioma+"','"+tema+"');");
            System.out.println(codMaterial+"','"+titulo+"','"+ufisica+"','"+cejemp+"','"+autor+"','"+paispubli+"','"+ciudadpub+"','"+anio_publi+"','"+volumen+"','"+idioma+"','"+tema);
            System.out.println("Ejecutando query.");
            stmt.executeQuery();//no registros afectados
            //System.out.println("No Registros afectados: "+rows);
            return true;
        } catch (SQLException sqle) {
            sqle.printStackTrace();
            return false;
        } finally{
            Conexion.close(stmt);
            Conexion.close(conn);
        }      
    }
}
