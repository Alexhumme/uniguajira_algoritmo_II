/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alfanumerico.Letras.variables;

import javax.swing.JOptionPane;



/**
 *
 * @author Windows 11
 */
public class Ejercicio4 {
   public Ejercicio4(){
       String input1 = JOptionPane.showInputDialog("Introduzca el primer carácter:");
        char car1 = input1.charAt(0);
        String input2 = JOptionPane.showInputDialog("Introduzca el segundo carácter:");
        char car2 = input2.charAt(0);
        if (car1 == car2) {
            JOptionPane.showMessageDialog(null, "Son iguales");
        } else {
            JOptionPane.showMessageDialog(null, "No son iguales");
        }
   }
}
