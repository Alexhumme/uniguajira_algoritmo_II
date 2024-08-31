package variables_trabajo;

import java.util.Scanner;

/**
 * e4_piesAKm
 */
public class e4_piesAKm {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String nombre;
        float pies;
        double kms;

        System.out.println("\n***** Conversion pies Kilometros *****");
        System.out.print("> Por favor digite su nombre: ");
        nombre = scanner.next();

        System.out.println("  Hola "+nombre);
        System.out.print("> Digite la cantidad de pies a convertir: ");
        pies = scanner.nextFloat();
    
        kms = pies * 0.000305;

        System.out.println("  "+pies+"pies son equivalentes a "+kms+"km");


        scanner.close();
    }
}
