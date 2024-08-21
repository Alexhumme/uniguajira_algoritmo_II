package condicionales;

import java.util.Scanner;

/**
 * e1_mayorDe3
 */
public class e1_mayorDe3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nombre;
        double n1, n2, n3;

        System.out.println("\n***** Mayor de 3 numeros distintos *****");
        System.out.print("> Por favor digite su nombre: ");
        nombre = scanner.next();

        System.out.println("  Hola " + nombre);
        System.out.print("> Digite el primer numero: ");
        n1 = scanner.nextDouble();
        System.out.print("> Digite el segundo numero: ");
        n2 = scanner.nextDouble();
        System.out.print("> Digite el tercer numero: ");
        n3 = scanner.nextDouble();

        if (n1 > n2 && n1 > n3) {
            System.out.println("  El mayor de los 3 es: " + n1);
        } else if (n2 > n1 && n2 > n3) {
            System.out.println("  El mayor de los 3 es: " + n2);
        } else {
            System.out.println("  El mayor de los 3 es: " + n3);
        }

        scanner.close();
    }
}
