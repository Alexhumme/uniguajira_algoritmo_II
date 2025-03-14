/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alfanumerico.Numeros.variables;

import javax.swing.JOptionPane;

/**
 *
 * @author Windows 11
 */
public class Ejercicio8 {
    public Ejercicio8(){
        String sc = JOptionPane.showInputDialog(null,"Introduzca el radio de la esfera");
        double radio =Double.parseDouble(sc);
        JOptionPane.showMessageDialog(null,"El volumen de la esfera de radio "+ radio+" = "+(4.0/3)* Math.PI * Math.pow(radio, 3));
    }
    
}
