package corte_2.ciclos;

import java.util.Scanner;

/**
 * acumulador_while
 */
public class acumulador_while {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = 0, suma = 0;

    System.out.println("----- ACUMULADOR WHILE -----");
      
    while (num >= 0) {
      suma += num;

      System.out.print("> Digite un entero (negativo para terminar): ");
      num = scanner.nextInt();
    }

    System.out.println("  La suma total es : "+ suma);

    scanner.close();
  }
}
