package condicionales1;

import java.util.Scanner;

/**
 * quiz1
 */
public class quiz1_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("***** Clasificar edades *****");
        System.out.println("Digite su edad: ");
        System.out.println(" A) Niño");
        System.out.println(" B) Adolescente");
        System.out.println(" C) Joven");
        System.out.println(" D) Adulto");
        System.out.println(" E) Adulto mayor");
        System.out.print(" > ");
        String option = scanner.next();

        switch (option.toUpperCase()) {
            case "A":
                System.out.print("Usted es un niño");
                break;
            case "B":
                System.out.print("Usted es un adolescente");
                break;
            case "C":
                System.out.print("Usted es un joven");
                break;
            case "D":
                System.out.print("Usted es un adulto");
                break;
            case "E":
                System.out.print("Usted es un adulto mayor");
                break;
            default:
                System.out.println("Edad no valida :(");
        }

        scanner.close();
    }
}
