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
public class Ejercicio9 {
   public Ejercicio9(){
       String sc = JOptionPane.showInputDialog(null, "Introduzca longitud del primer lado del triángulo");
       double a =Double.parseDouble(sc);
        String sc1 = JOptionPane.showInputDialog(null, "Introduzca longitud del primer lado del triángulo");
       double b =Double.parseDouble(sc1);
        String sc2 = JOptionPane.showInputDialog(null, "Introduzca longitud del primer lado del triángulo");
       double c =Double.parseDouble(sc2);
       double p =(a+b+c)/2;
       JOptionPane.showMessageDialog(null,"Area ="+Math.sqrt(p*(p-a)*(p-b)*(p-c)));
   } 
}
