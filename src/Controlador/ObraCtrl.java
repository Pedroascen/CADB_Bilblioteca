/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ObraSQL;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;

/**
 *
 * @author Eliot
 */
public class ObraCtrl {

    //llamada al manejo de errores
    static final Logger log = Logger.getLogger(ObraCtrl.class);
    
    //Instanciando clase en modelo
    ObraSQL obrasql = new ObraSQL();

    //metodo para guardar 
    public boolean save_update(String codMaterial, String titulo, String ufisica, String cejemp, String autor, String npaginas, String editorial, String pais, String isbn, String anio, String edicion, String idioma, String genero) {
        //confirmar si el resultado del metodo es true o false
        if (obrasql.insert_update(codMaterial, titulo, ufisica, cejemp, autor, npaginas, editorial, pais, isbn, anio, edicion, idioma, genero)) {
            JOptionPane.showMessageDialog(null, "El registro se guardó con éxito.");
            return true;
        } else {
            log.error("Error en metodo guardar.");
            JOptionPane.showMessageDialog(null, "El registro no se guardó...");
            return false;
        }
    }
}
