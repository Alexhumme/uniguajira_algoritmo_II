package condicionales1;

import java.util.Scanner;

/**
 * quiz2
 */
public class quiz2_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String rango = "";
        System.out.println("***** Clasificar nota *****");
        System.out.print("> Digite su nota: ");
        float nota = scanner.nextFloat();
        System.out.print("  Calificacion: ");

        if (nota >= 0 && nota <= 5) {
            if (nota <= 1.9) {
                rango = "pesima";
            } else if (nota <= 3.5) {
                rango = "mala";
            } else if (nota <= 4) {
                rango = "regular";
            } else if (nota <= 4.5) {
                rango = "buena";        
            } else if (nota <= 5) {
                rango = "excelente";
            } 
        } 

        System.out.print("Su nota es "+rango);
        switch (rango) {
            case "pesima": System.out.println(" le van a echar"); break;
            case "mala": System.out.println(" tendrá que repetir"); break;
            case "regular": System.out.println(", podria ser mejor"); break;
            case "buena": System.out.println(" siga así"); break;
            case "excelente": System.out.println(", felicidades!"); break;
            default: System.out.println("Invalida"); break;
        }

        scanner.close();

    }
}
