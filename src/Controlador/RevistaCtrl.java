/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Modelo.RevistaSQL;
import javax.swing.JOptionPane;

/**
 *
 * @author Jazmine
 */
public class RevistaCtrl {
    
    //Instancia al modelo
    RevistaSQL revistasql = new RevistaSQL();
    
    //Método para guardar
    public boolean guardar_update (String codMaterial, String titulo, String ufisica, String cejemp, String editorial, String issn, String idioma, String tamano, String periodicidad, String fechapublicacion ){
        
        if(revistasql.insert_update(codMaterial, titulo, ufisica, cejemp, editorial, issn, idioma, tamano, periodicidad, fechapublicacion)) {
            JOptionPane.showMessageDialog(null, "El registro se guardó con éxito.");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "El registro no se guardó...");
            return false;
        }
        
    }
    
}
