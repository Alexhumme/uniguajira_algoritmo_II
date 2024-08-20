package variables_trabajo;

import java.util.Scanner;

/**
 * e5_tablaMultiplicar
 */
public class e5_tablaMultiplicar {

    public static void main(String[] args) {
         
        Scanner scanner = new Scanner(System.in);

        String nombre;
        int num;
        int prod;

        System.out.println("\n***** Tabla de multiplicar *****");
        System.out.print("> Por favor digite su nombre: ");
        nombre = scanner.next();

        System.out.println("  Hola "+nombre);
        System.out.print("> Digite numero a multiplicar: ");
        num = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            prod = num * i;
            System.out.println("  • "+num+"×"+i+"="+prod);
        }

        scanner.close();

    }
}
