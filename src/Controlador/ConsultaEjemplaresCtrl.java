/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ConsultaEjemplares;
import Modelo.ConsultaEjemplaresSQL;
import java.util.ArrayList;

/**
 *
 * @author Rocio Abrego
 */
public class ConsultaEjemplaresCtrl {
    ConsultaEjemplaresSQL cesql = new ConsultaEjemplaresSQL();
    
    public ArrayList<ConsultaEjemplares> ObtenerEjemplaresCtrl(String titulo, String autor, String tipoMaterial, String idioma, String orderby) {
        ArrayList<ConsultaEjemplares> resultado = cesql.ConsultarEjemplares(titulo, autor, tipoMaterial, idioma, orderby);
        
        return resultado;
    }
}
