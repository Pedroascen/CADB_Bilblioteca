/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.DevolucionSQL;
import javax.swing.JOptionPane;

/**
 *
 * @author Rocio Abrego
 */
public class DevolucionCtrl {
   DevolucionSQL presql = new DevolucionSQL();

    //metodo para iniciar sesion
    public void Devolucion(String materialId, String carnetId) {
        String resultado = presql.GuardarDevolucion(materialId, carnetId);
        
        JOptionPane.showMessageDialog(null, resultado, "Devolución", JOptionPane.INFORMATION_MESSAGE);
    }
}
