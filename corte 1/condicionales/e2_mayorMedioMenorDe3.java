package condicionales;

import java.util.Scanner;

/**
 * e2_mayorMedioMenorDe3
 */
public class e2_mayorMedioMenorDe3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nombre;
        double n1, n2, n3;

        System.out.println("\n***** Mayor, medio y menor de 3 numeros distintos *****");
        System.out.print("> Por favor digite su nombre: ");
        nombre = scanner.next();

        System.out.println("  Hola " + nombre);
        System.out.print("> Digite el primer numero: ");
        n1 = scanner.nextDouble();
        System.out.print("> Digite el segundo numero: ");
        n2 = scanner.nextDouble();
        System.out.print("> Digite el tercer numero: ");
        n3 = scanner.nextDouble();

        if (n1 > n2) {
            if (n2 > n3) {
                System.out.println(" El orden es: A: " + n1 + ", B: " + n2 + ", C: " + n3);
            } else if (n3 > n1) {
                System.out.println(" El orden es: C: " + n3 + ", A: " + n1 + ", B: " + n2);
            } else {
                System.out.println(" El orden es: A: " + n1 + ", C: " + n3 + ", B: " + n2);
            }
        } else {
            if (n1 > n3) {
                System.out.println(" El orden es: B: " + n2 + ", A: " + n1 + ", C: " + n3);
            } else if (n3 > n2) {
                System.out.println(" El orden es: C: " + n3 + ", B: " + n2 + ", A: " + n1);
            } else {
                System.out.println(" El orden es: B: " + n2 + ", C: " + n3 + ", A: " + n1);
            }
        }

        scanner.close();
    }
}
