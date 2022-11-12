package Controlador;

import Modelo.LibroSQL;
import javax.swing.JOptionPane;

public class LibroCtrl {
    //instacia a modelo
    LibroSQL librosql = new LibroSQL();

    //metodo para guardar 
    public boolean guardar_update(String codMaterial, String titulo, String ufisica, String cejemp, String autor,String npaginas, String editorial,String pais, String isbn, String anio, String edicion, String idioma, String materia, String descripcion) {
        //confirmar si el resultado del metodo es true o false
        if (librosql.insert_update(codMaterial, titulo, ufisica, cejemp, autor,npaginas,editorial,pais,isbn,anio,edicion,idioma,materia,descripcion)) {
            JOptionPane.showMessageDialog(null, "El registro se guardó con éxito.");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "El registro no se guardó...");
            return false;
        }
    }
}
