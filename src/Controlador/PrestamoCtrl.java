package Controlador;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Modelo.PrestamoSQL;
import javax.swing.JOptionPane;

/**
 *
 * @author Rocio Abrego
 */
public class PrestamoCtrl {
    
    PrestamoSQL presql = new PrestamoSQL();

    //método para iniciar sesión
    public void Prestamo(String materialId, String carnetId) {
        String resultado = presql.GuardarPrestamo(materialId, carnetId);
        
        JOptionPane.showMessageDialog(null, resultado, "Préstamo", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
