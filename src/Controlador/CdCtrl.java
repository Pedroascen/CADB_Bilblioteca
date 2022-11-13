package Controlador;

import Modelo.CdSQL;
import javax.swing.JOptionPane;

public class CdCtrl {
    //instacia a modelo
    CdSQL cdsql = new CdSQL();
    
    //metodo para guardar 
    public boolean guardar_update(String codMaterial, String titulo, String ufisica, String cejemp, String autor, String paispubli, String ciudadpub, String anio_publi, String volumen, String idioma, String tema) {
        //confirmar si el resultado del metodo es true o false
        if (cdsql.insert_update(codMaterial, titulo, ufisica, cejemp, autor, paispubli, ciudadpub, anio_publi, volumen, idioma, tema)) {
            JOptionPane.showMessageDialog(null, "El registro se guardo con exito.");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "El registro no se guardo...");
            return false;
        }
    }
}
