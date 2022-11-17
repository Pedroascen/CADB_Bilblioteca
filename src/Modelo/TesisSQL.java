package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.apache.log4j.Logger;

public class TesisSQL {

    //Llamando a la libreria del framwork log4j que nos servirá para el manejo de errores.
    static final Logger log = Logger.getLogger(TesisSQL.class);

    //metodos para insertar y actualizar
    public boolean insert_update(String codMaterial, String titulo, String ufisica, String cejemp, String autor, String pais, String ciudad, String universidad, String carrera, String idioma, String fechaPublicacion, String numeroPaginas, String descripcion, String palabrasclave) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;//no se ocupa

        int rows = 0;//registra no de registros afectados
        try {
            conn = Conexion.getConnection();
            //llamada al procedimiento almacenado  call new_upd_libro('"+codMaterial+"','"+titulo+"','"+autor+"','"+npaginas+"','"+editorial+"','"+isbn+"','"+anio+"');
            stmt = conn.prepareStatement("call new_upd_tesis('" + codMaterial + "','" + titulo + "','" + ufisica + "','" + cejemp + "','" + autor + "','" + pais + "','" + ciudad + "','" + universidad + "','" + carrera + "','" + idioma + "','" + fechaPublicacion + "','" + numeroPaginas + "','" + descripcion + "','" + palabrasclave + "');");
            System.out.println(codMaterial + "','" + titulo + "','" + ufisica + "','" + cejemp + "','" + autor + "','" + pais + "','" + ciudad + "','" + universidad + "','" + carrera + "','" + idioma + "','" + fechaPublicacion + "','" + numeroPaginas + "','" + descripcion + "','" + palabrasclave);
            System.out.println("Ejecutando query.");
            stmt.executeQuery();//no registros afectados
            //System.out.println("No Registros afectados: "+rows);
            return true;
        } catch (SQLException sqle) {
            log.error("Error al guardar registros de tesis: " + sqle);
            return false;
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
    }
}
