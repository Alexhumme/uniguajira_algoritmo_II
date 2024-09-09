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
public class Ejercicio4 {
    public Ejercicio4(){
        String sc =JOptionPane.showInputDialog(null,"Ingrese grados centigrados ");
        double gradosc =Double.parseDouble(sc);
        double  gradosf=32+(9*gradosc/5);
        JOptionPane.showMessageDialog(null,gradosc+" °C = "+gradosf+"°F");
    }
}
