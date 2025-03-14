package condicionales1;

import java.util.Scanner;

/**
 * ej1_mayor18
 */
public class ejemplos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int edad;
        boolean esMayor;

        // mayor a 18
        System.out.println("***** Usuario mayo de edad *****");

        System.out.print("> Digite su edad por favor: ");
        edad = scanner.nextInt();

        if (edad > 0) {
            esMayor = edad >= 18;
            if (esMayor) {
                System.out.println("  Usted es mayor de edad!");
            }
        } else {
            System.out.println("  Edad no valida");
        }

        // uso de booleanos
        boolean esVedadero = true;
        if (esVedadero) {
            System.out.println("la condicion es verdadera");
        }

        // activiad segun la temperatura

        float temperatura;

        System.out.println("\n***** Actividad segun la temperatura *****");
        System.out.print("> Digite el valor de la temperatura: ");
        temperatura = scanner.nextFloat();

        if (temperatura > 25) {
            System.out.println("  A la playa!");
        } else {
            System.out.println("  Pa' la casa a dormir");
        }

        // positivonegativo o neutro
        int numero;
        System.out.println("***** Positivo, negativo o neutro");
        System.out.print("> Digite un numero entero: ");
        numero = scanner.nextInt();
        System.out.println();

        if (numero > 0) {

            System.out.println("  El numero es Positivo");

            if (numero >= 1 && numero <= 10) {
                System.out.println("  El numero esta entre 1 y 10");
            } else if (numero <= 20) {
                System.out.println("  El numero esta entre 11 y 20");
            } else {
                System.out.println("  El numero esta fuera de los rangos especificados");
            }

        } else if (numero < 0) {
            System.out.println("  El numero es negativo");
        } else {
            System.out.println("  El numero es neutro");
        }

        scanner.close();

    }
}
