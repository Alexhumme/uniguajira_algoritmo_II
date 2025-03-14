package condicionales;

import java.util.Scanner;

/**
 * e9_nombreBebe
 */
public class e3_nombreBebe {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String sel_apellido;
        String nombre1, apellido1;
        String nombre2, apellido2;
        String nombre3, nombreCompleto;
            
        System.out.println("\n***** Nombre de tu futuro hijo/a *****");
        System.out.print("> Por favor digite su nombre: ");
        nombre1 = scanner.next();
        System.out.print("> Por favor digite su primer apellido: ");
        apellido1 = scanner.next();
        System.out.print("> Por favor digite el nombre de su pareja: ");
        nombre2 = scanner.next();
        System.out.print("> Por favor digite el primer apellido de su pareja: ");
        apellido2 = scanner.next();

        System.out.print("> Digite el nombre de su futuro hijo/a: ");
        nombre3 = scanner.next();
        
        System.out.println("> Cual quiere que sea el primer apellido de su hijo/a ?");
        System.out.println("  a) El suyo");
        System.out.println("  b) El de su pareja");
        System.out.println("  Cualquier tecla) Nuevo");
        System.out.print("  > ");
        sel_apellido = scanner.next();
        
        if (sel_apellido.equals("a")) {
            nombreCompleto = nombre3 + " " + apellido1 + " " + apellido2;
        } else if (sel_apellido.equals("b")) {
            nombreCompleto = nombre3 + " " + apellido2 + " " + apellido1;
        } else {
            System.out.print("  > Digite el/los apellidos del niño/a: ");
            nombreCompleto = nombre3 + " " + scanner.next();
        }

        System.out.println("\n  Felicidades " + nombre1 + " " + apellido1 );
        System.out.println("  Su hijo/a con " + nombre2 + " " + apellido2 + " se llamara:");
        System.out.println("  " + nombreCompleto);

        scanner.close();
    }
}
