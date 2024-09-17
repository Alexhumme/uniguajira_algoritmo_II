package corte_2.ciclos;

import java.util.Scanner;

/**
 * contador_while
 */
public class contador_while {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("---- Contador con bucle While ----");
    int contador = 2;
    while (contador <= 20) {
      System.out.println("> "+ contador);
      contador+=2;
    }

    scanner.close();
  }
}
