package variables_trabajo;

import java.util.Scanner;

/**
 * e7_repartirPlata
 */
public class e7_repartirPlata {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String nombre;
        int miembros;
        double pago;
        double parte;

        System.out.println("\n***** Repartir plata *****");
        System.out.print("> Por favor digite su nombre: ");
        nombre = scanner.next();

        System.out.println("  Hola "+nombre);
        System.out.print("> Digite la cantidad de miembros de su equipo: ");
        miembros = scanner.nextInt();
        System.out.print("> Digite el pago recibido por su servicio: $");
        pago = scanner.nextDouble();

        parte = pago / miembros;

        System.out.println("  Cada uno ha de recibir $"+parte+" por su trabajo");

        scanner.close();

    }
}
