package variables_trabajo;

import java.util.Scanner;

/**
 * e9_notalFinal
 */
public class e9_notalFinal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nombre;
        float nfinal;
        float nota1;
        float nota2;
        float nota3;
        float sum;
        final int cantidad = 3;

        System.out.println("\n***** Promedio de 3 notas *****");
        System.out.print("> Por favor digite su nombre: ");
        nombre = scanner.next();

        System.out.println("  Hola " + nombre);
        System.out.print("> Digite la primera nota del 0 al 5: ");
        nota1 = scanner.nextFloat();
        System.out.print("> Digite la segunda nota del 0 al 5: ");
        nota2 = scanner.nextFloat();
        System.out.print("> Digite la tercera nota del 0 al 5: ");
        nota3 = scanner.nextFloat();

        sum = nota1 + nota2 + nota3;
        nfinal = sum / cantidad;

        System.out.println("\n  El promedio final de esas 3 notas es: "+nfinal);

        scanner.close();
    }
}
