package variables_trabajo;

import java.util.Scanner;

/**
 * e10_notaPonderada
 */
public class e10_notaPonderada {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nombre;
        double nfinal;
        float nota1, nota2, nota3, nota4, nota5;
        final double peso1 = 0.15;
        final double peso2 = 0.20;

        System.out.println("\n***** Promedio ponderado de 5 notas *****");
        System.out.print("> Por favor digite su nombre: ");
        nombre = scanner.next();

        System.out.println("  Hola " + nombre);
        System.out.print("> Digite la primera nota del 0 al 5 (15%): ");
        nota1 = scanner.nextFloat();
        System.out.print("> Digite la segunda nota del 0 al 5 (15%): ");
        nota2 = scanner.nextFloat();
        System.out.print("> Digite la tercera nota del 0 al 5 (20%): ");
        nota3 = scanner.nextFloat();
        System.out.print("> Digite la segunda nota del 0 al 5 (20%): ");
        nota4 = scanner.nextFloat();
        System.out.print("> Digite la tercera nota del 0 al 5 (20%): ");
        nota5 = scanner.nextFloat();

        nfinal = 
            nota1 * peso1 + 
            nota2 * peso1 + 
            nota3 * peso2 + 
            nota4 * peso2 + 
            nota5 * peso2;

        System.out.println("\n  El promedio ponderado de esas 5 notas es: " + nfinal);

        scanner.close();
    }
}
