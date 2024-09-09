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
public class Ejercicio3 {
    public Ejercicio3(){
        String  sc = JOptionPane.showInputDialog(null,"Ingrese un numero entero");
        int numero=Integer.parseInt(sc);
        String mensaje = "Número introducido: " + numero + "\n" +
        "El doble de " + numero + " = " + (2 * numero) + "\n" +
        "El triple de " + numero + " = " + (3 * numero);
        JOptionPane.showMessageDialog(null, mensaje);   
    }
}
