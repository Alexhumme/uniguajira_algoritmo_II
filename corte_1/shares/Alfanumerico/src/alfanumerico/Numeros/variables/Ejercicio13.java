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
public class Ejercicio13 {
    public Ejercicio13(){
        String di =JOptionPane.showInputDialog(null,"Introduzcafecha de nacimiento (dia:)");
        int dia=Integer.parseInt(di);
        String me =JOptionPane.showInputDialog(null,"mes");
        int mes=Integer.parseInt(me);
        String añ =JOptionPane.showInputDialog(null,"mes");
        int año=Integer.parseInt(añ);
        int suma =dia + mes +año;
        int cifra1 = suma/1000; //obtiene la primera cifra
        int cifra2 = suma/100%10; //obtiene la segunda cifra
        int cifra3 = suma/10%10; //obtiene la tercera cifra
        int cifra4 = suma%10;
       int suerte = cifra1 + cifra2 + cifra3 + cifra4;
         JOptionPane.showMessageDialog(null,"Su numero de suerte es "+suerte);
    }
}
