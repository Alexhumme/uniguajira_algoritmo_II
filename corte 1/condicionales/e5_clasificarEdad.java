package condicionales;

import java.util.Scanner;

public class e5_clasificarEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();

        if (edad >= 0) {
            if (edad < 12) {
                System.out.println("Eres un niño.");
            } else if (edad < 18) {
                System.out.println("Eres un adolescente.");
            } else if (edad < 65) {
                System.out.println("Eres un adulto.");
            } else {
                System.out.println("Eres un adulto mayor.");
            }
        } else {
            System.out.println("Edad no válida.");
        }

        scanner.close();
    }
}

