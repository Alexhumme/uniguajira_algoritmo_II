package corte_2.ciclos;

import java.util.Scanner;

/**
 * taller1_3
 */
public class taller1_3 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String opcion = "s";
    int conteo = 0;
    double costo, total = 0;
    System.out.println(" ---- Caja Registradora ----");

    while (opcion.equals("s")) {
      conteo++;
      do {
        System.out.print("> Digite el costo del producto "+(conteo)+" (valor positivo): $");
        costo = scanner.nextDouble();
      } while (costo <= 0);
      total += costo;
      System.out.print(" + Digite s para agregar otro producto : ");
      opcion = scanner.next();
    } 

    System.out.println("  Total del productos : "+conteo);
    System.out.println("  Valor total de la compra : $"+total);

    scanner.close();

  }
}
