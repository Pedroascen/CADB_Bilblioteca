package Controlador;

import Modelo.TesisSQL;
import javax.swing.JOptionPane;

public class TesisCtrl {
     //instacia a modelo
    TesisSQL tesissql = new TesisSQL();
    
     //metodo para guardar 
    public boolean guardar_update(String codMaterial, String titulo, String ufisica, String cejemp, String autor, String pais, String ciudad,String universidad, String carrera, String idioma, String fechaPublicacion, String numeroPaginas, String descripcion, String palabrasclave) {
        //confirmar si el resultado del metodo es true o false
        if (tesissql.insert_update(codMaterial, titulo, ufisica, cejemp, autor, pais, ciudad, universidad, carrera, idioma, fechaPublicacion, numeroPaginas, descripcion, palabrasclave)) {
            JOptionPane.showMessageDialog(null, "El registro se guardó con éxito.");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "El registro no se guardó...");
            return false;
        }
    }
}
