package variables_trabajo;

import java.util.Scanner;

/**
 * e6_costoCompra5p
 */
public class e6_costoCompra5p {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nombre;
        double total = 0;

        System.out.println("\n***** Costo total por 5 productos*****");
        System.out.print("> Por favor digite su nombre: ");
        nombre = scanner.next();

        System.out.println("  Hola "+nombre);
        System.out.print("> Digite el costo del primer producto: ");
        total += scanner.nextDouble();
        System.out.print("> Digite el costo del segundo producto: ");
        total += scanner.nextDouble();
        System.out.print("> Digite el costo del tercer producto: ");
        total += scanner.nextDouble();
        System.out.print("> Digite el costo del cuarto producto: ");
        total += scanner.nextDouble();
        System.out.print("> Digite el costo del quinto producto: ");
        total += scanner.nextDouble();
        System.out.println("  El costo totlal de su compra es: "+total);

        scanner.close();

    }
}
