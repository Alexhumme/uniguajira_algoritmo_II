package ciclos;

import java.util.Scanner;

/**
 * primos
 */
public class primos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int limit, exactas;

        System.out.println("***** Primos de 0 a n *****");
        System.out.print(" > Digite un entero positivo (n): ");
        limit = scanner.nextInt();

        if (limit < 0) {
            System.out.println("  x El numero debe ser positivo x");
        } else {
            for (int num = 0; num <= limit; num++) {
                exactas = 0;
                System.out.print("  " + num + " es divisible por : ");
                for (int i = 1; i <= (int) (num / 2) + 1; i++) {
                    if (num % i == 0) {
                        exactas++;
                        if (i != 1)
                            System.out.print(", ");
                        System.out.print(i);

                    }
                }
                System.out.print(". ");
                if (exactas <= 2) System.out.print("Es primo.");
            System.out.println("");
            }

        }
    }
}
