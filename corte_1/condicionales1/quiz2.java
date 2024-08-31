package condicionales1;

import java.util.Scanner;

/**
 * quiz2
 */
public class quiz2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("***** Clasificar nota *****");
        System.out.print("> Digite su nota: ");
        float nota = scanner.nextFloat();
        System.out.print("  Calificacion: ");
        if (nota >= 0 && nota <= 5) {
            if (nota <= 1.9) {
                System.out.println("pesimo");
            } else if (nota <= 3.5) {
                System.out.println("mala");
            } else if (nota <= 4) {
                System.out.println("regular");
            } else if (nota <= 4.5) {
                System.out.println("Buena");        
            } else if (nota <= 5) {
                System.out.println("Excelente");
            } 
        } else {
            System.out.println("Invalida");
        }
        scanner.close();

    }
}
