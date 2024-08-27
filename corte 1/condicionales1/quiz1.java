package condicionales1;

import java.util.Scanner;

/**
 * quiz1
 */
public class quiz1 {

    public static void main(String[] args) { 
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("***** Clasificar edades *****");
        System.out.print("> Digite su edad: ");
        int edad = scanner.nextInt();

        if (edad < 0) {
            System.out.println("  Edad no valida :(");
        } else {
            System.out.print("Usted es un ");
            if (edad <= 10) {System.out.println("niño");}
            else if (edad <= 17) {System.out.println("adolescente");}
            else if (edad <= 35) {System.out.println("joven");}
            else if (edad <= 65) {System.out.println("adulto");}
            else {System.out.println("adulto mayor");}
        }

        scanner.close();
    }
}
