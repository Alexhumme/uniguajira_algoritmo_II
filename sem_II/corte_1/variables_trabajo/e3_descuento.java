package variables_trabajo;

import java.util.Scanner;

/**
 * e3_descuento
 */
public class e3_descuento {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nombre;
        double monto;
        double montoDescuento;

        System.out.println("\n***** Monto en descuento al 20% *****");
        System.out.print("> Por favor digite su nombre: ");
        nombre = scanner.next();

        System.out.println("  Hola "+nombre);
        System.out.print("> Digite el costo total de la compra: ");
        monto = scanner.nextDouble();
        

        montoDescuento = monto - (monto * 20/100);

        System.out.print("  El total con un 20% de descuento es: "+montoDescuento);


        scanner.close();
    }
}
