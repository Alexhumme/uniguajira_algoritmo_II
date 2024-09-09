package ciclos;

import java.util.Scanner;

/**
 * primos
 */
public class primos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int limit, exactas;

        System.out.println("***** Primos de 1 a n *****");
        System.out.print(" > Digite un entero positivo (n): ");
        limit = scanner.nextInt();

        if (limit < 0) {
            System.out.println("  x El numero debe ser positivo x");
        } else {
            System.out.print("  numeros :   ");
            for (int num = 1; num <= limit; num++) {
                exactas = 0;
                for (int i = 1; i <= (int) (num / 2) + 1; i++) {
                    if (num % i == 0) exactas++;
                }
                if (exactas <= 1) {
                    if (num != 1) System.out.print(", ");
                    System.out.print(num);
                }
            }
            System.out.println(". ");

        }
    }
}
