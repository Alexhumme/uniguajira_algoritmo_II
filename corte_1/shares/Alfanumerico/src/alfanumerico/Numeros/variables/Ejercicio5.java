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
public class Ejercicio5 {
    public Ejercicio5(){
    String sc = JOptionPane.showInputDialog(null,"Introduce el radio de la circunferencia");
    double radio=Double.parseDouble(sc);
    double longitud = 2 * Math.PI * radio;
    double area = Math.PI * Math.pow(radio, 2);
    String result="Longitud de la circunferencia = "+longitud+"\n"+
          "Area de la circunferencia = "+area;  
  
    JOptionPane.showMessageDialog(null,result);
}
}
