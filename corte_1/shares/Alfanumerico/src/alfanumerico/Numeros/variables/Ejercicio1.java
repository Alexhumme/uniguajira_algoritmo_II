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
public class Ejercicio1 {
  public  Ejercicio1(){
 String entero1 = JOptionPane.showInputDialog(null,"Introduce un número entero: ");
int n1 = Integer.parseInt(entero1);
String entero2=JOptionPane.showInputDialog(null,"Introduce otro número entero: ");
int n2 = Integer.parseInt(entero2);
JOptionPane.showMessageDialog(null,"Ha introducido los números: " + n1 + " y " + n2);
        
    }
    
}
