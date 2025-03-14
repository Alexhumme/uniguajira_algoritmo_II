/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alfanumerico.Letras.variables;


import javax.swing.JOptionPane;

/**
 *
 * @author B8
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public Ejercicio2(){
        String cadena;
        cadena = JOptionPane.showInputDialog(null,"Introduce un nombre: ");
        JOptionPane.showMessageDialog(null,"Buenos Días " + cadena);
    
    } 
}
