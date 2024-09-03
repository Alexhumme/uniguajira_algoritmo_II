package ciclos;

import java.util.Scanner;

/**
 * tabla_multiplicar
 */
public class tabla_multiplicar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("** Tablas de multiplicar **");
        System.out.print("  > Digite el numero al que ver la tabla : ");
        int numero = scanner.nextInt();
        System.out.println("  Tabla del "+numero);
        for (int i = 0; i <= 10; i++) {
            System.out.println("  "+numero+" * "+i+" = "+numero*i);
        }
    }
}
