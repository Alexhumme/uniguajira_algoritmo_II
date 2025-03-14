/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alfanumerico.Numeros.variables;

import javax.swing.JOptionPane;

/**
 *
 * @author B8
 */
public class Ejercicio11 {
   public Ejercicio11(){
       String sc =JOptionPane.showInputDialog(null,"Introduzca el valor de N");
       int N=Integer.parseInt(sc);
       String numero = (N/10000)+" \n"+
                       (N/1000)+" \n"+
                        (N/100)+" \n"+
                         (N/10)+" \n"+
                          (N); 
        JOptionPane.showMessageDialog(null,numero);
   } 
}
