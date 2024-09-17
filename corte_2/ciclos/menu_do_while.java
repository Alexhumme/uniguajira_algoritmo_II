package corte_2.ciclos;

import java.util.Scanner;

/**
 * menu_do_while
 */
public class menu_do_while {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int opcion;

    System.out.println("----- Menu de opciones -----");    
    do {
      System.out.println("  Menu");
      System.out.println("1. Opcion 1");
      System.out.println("2. Opcion 2");
      System.out.println("3. Salir");
      System.out.print("> ");
      opcion = scanner.nextInt();
      if (opcion < 1 || opcion > 3) System.out.println("x Opcion no valida x");
    } while (opcion != 3);
    System.out.println("  Adios!");
  }
}
