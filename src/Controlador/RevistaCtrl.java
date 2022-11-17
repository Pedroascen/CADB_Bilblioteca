/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Modelo.RevistaSQL;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;

public class RevistaCtrl {
     //llamada al manejo de errores
    static final Logger log = Logger.getLogger(RevistaCtrl.class);
    //Instancia al modelo
    RevistaSQL revistasql = new RevistaSQL();
    
    //Método para guardar
    public boolean save_update(String codMaterial, String titulo, String ufisica, String cejemp, String editorial, String issn, String idioma, String tamano, String periodicidad, String fechapublicacion ){
        
        if(revistasql.insert_update(codMaterial, titulo, ufisica, cejemp, editorial, issn, idioma, tamano, periodicidad, fechapublicacion)) {
            JOptionPane.showMessageDialog(null, "El registro se guardó con éxito.");
            return true;
        } else {
            log.error("Error en metodo guardar.");
            JOptionPane.showMessageDialog(null, "El registro no se guardó...");
            return false;
        }
        
    }
    
}
