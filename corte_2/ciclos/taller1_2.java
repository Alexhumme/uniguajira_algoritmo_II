package corte_2.ciclos;

import java.util.Scanner;
  
/**
 * taller1_2
 */
public class taller1_2 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = 0;
    System.out.println(" ----- Contar del 0 a n -----");

    do {
      if (num != 0) {
        System.out.print("  Numeros : ");
        for (int i = 0; i <= num; i++) {
          System.out.print(i);
          if (i < num) System.out.print(", ");
          else System.out.print(".");
        }
        System.out.println();
      };
      System.out.print("> Digite un entero positivo n : ");
      num = scanner.nextInt();
    } while (num >= 0);

    scanner.close();
  }
}
