package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ObraSQL {
   //declaracion de sentencias sql y procedimientos almacenados 
    private final String SQL_DELETE
            = "DELETE FROM libro WHERE codigoMaterialL=?";
    
    //metodos para insertar y actualizar
    public boolean insert_update(String codMaterial, String titulo, String ufisica, String cejemp, String autor,String npaginas, String editorial,String pais, String isbn, String anio, String edicion, String idioma, String genero){
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        int rows = 0;//registra no de registros afectados
        try {
            conn = Conexion.getConnection();
            //llamada al procedimiento almacenado  ;
            stmt = conn.prepareStatement("call new_upd_obra('"+codMaterial+"','"+titulo+"','"+ufisica+"','"+cejemp+"','"+autor+"','"+npaginas+"','"+editorial+"','"+pais+"','"+isbn+"','"+anio+"','"+edicion+"','"+idioma+"','"+genero+"');");
            System.out.println(codMaterial+", "+titulo+", "+ufisica+", "+cejemp+", "+autor+", "+npaginas+", "+editorial+", "+pais+", "+isbn+", "+anio+", "+edicion+", "+idioma+", "+genero);
            System.out.println("Ejecutando query.");
            rows=stmt.executeUpdate();//no registros afectados
            System.out.println("No Registros afectados: "+rows);
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

