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
public class Ejercicio6 {
    public Ejercicio6(){
        String sc = JOptionPane.showInputDialog(null,"Introduce una velocidad en Km/H " );
        double velocidad = Double.parseDouble(sc);
        JOptionPane.showMessageDialog(null,velocidad+"Km/h = " + velocidad*1000/3600 + " m/s");
    }
}
