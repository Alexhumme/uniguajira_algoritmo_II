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
public class Ejercicio10 {
    public Ejercicio10(){
        String cifra =JOptionPane.showInputDialog(null,"Introduzca valor del numero(N)");
        int N=Integer.parseInt(cifra);
        String mensaje = "Primera cifra de " + N +" = "+(N/100)+ "\n" +
        ("Cifra central de " + N + " = " + (N/10)%10) + "\n" +
        "Cifra final de " + N + " = " + (N%10);
         JOptionPane.showMessageDialog(null,mensaje);
    }
}
