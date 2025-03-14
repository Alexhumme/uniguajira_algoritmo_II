package variables_trabajo;

import java.util.Scanner;

/**
 * e8_proporcion
 */
public class e8_proporcion {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nombre;
        float cantidad;
        double porc;
        double parte;
        double costo;
        double aporte;

        System.out.println("\n***** Pago proporcional *****");
        System.out.print("> Por favor digite su nombre: ");
        nombre = scanner.next();

        System.out.println("  Hola "+nombre);
        System.out.print("> Digite el costo de un kilo de trigo: ");
        costo = scanner.nextDouble();
        System.out.print("> Digite la cantidad de kilos comprados: ");
        cantidad = scanner.nextFloat();
        System.out.print("> Digite el aporte realizado por usted: ");
        aporte = scanner.nextDouble();

        porc = (aporte * 100) / (costo * cantidad);
        parte = cantidad * porc / 100;

        System.out.println("  A usted le corresponde un "+porc+"% del trigo ("+parte+"kilos)");

        scanner.close();

    }
}
