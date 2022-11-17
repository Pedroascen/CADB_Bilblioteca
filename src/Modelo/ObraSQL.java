package Modelo;

import static Modelo.LibroSQL.log;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.apache.log4j.Logger;

public class ObraSQL {
    //Llamando a la libreria del framwork log4j que nos servirá para el manejo de errores.
    static final Logger log = Logger.getLogger(ObraSQL.class);
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
             log.error("Error al guardar registros de obra: "+sqle);
            return false;
        } finally{
            Conexion.close(stmt);
            Conexion.close(conn);
        }      
    } 
}

