package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LibroSQL {
    //declaracion de sentencias sql y procedimientos almacenados 
    private final String SQL_CREATE_UPDATE =
            "call new_upd_libro('?','?','?','?','?','?','?');";
    private final String SQL_DELETE
            = "DELETE FROM libro WHERE codigoMaterialL=?";
    
    //metodos para insertar y actualizar
    public int insert_update(String codMaterial, String titulo, String ufisica, String cejemp, String autor,String npaginas, String editorial,String pais, String isbn, String anio, String edicion, String idioma, String materia, String descripcion){
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        int rows = 0;//registra no de registros afectados
        try {
            conn = Conexion.getConnection();
            //llamada al procedimiento almacenado  call new_upd_libro('"+codMaterial+"','"+titulo+"','"+autor+"','"+npaginas+"','"+editorial+"','"+isbn+"','"+anio+"');
            stmt = conn.prepareStatement("");
           
            //System.out.println(codMaterial+" "+titulo+" "+autor+" "+String.valueOf(npaginas)+" "+editorial+" "+" "+String.valueOf(isbn)+" "+String.valueOf(anio));
            System.out.println("Ejecutando query.");
            rows = stmt.executeUpdate();//no registros afectados
            System.out.println("No Registros afectados: "+rows);
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        } finally{
            Conexion.close(stmt);
            Conexion.close(conn);
        }       
    return rows;
    }
}
