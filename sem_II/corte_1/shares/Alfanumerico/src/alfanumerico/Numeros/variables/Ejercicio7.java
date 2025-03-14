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
public class Ejercicio7 {
    public Ejercicio7(){
        String sc = JOptionPane.showInputDialog(null,"Introduzca longitud del primer cateto");
        double cateto1 =Double.parseDouble(sc);
        String scn = JOptionPane.showInputDialog(null,"Introduzca longitud del segundo cateto");
        double cateto2=Double.parseDouble(scn);
        JOptionPane.showMessageDialog(null,"Hipotenusa = "+ Math.sqrt(Math.pow(cateto1,2)+Math.pow(cateto2,2)));
    }
}
