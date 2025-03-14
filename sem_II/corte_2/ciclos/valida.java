package corte_2.ciclos;

import java.util.Scanner;

/**
 * valida
 */
public class valida {

  public static void main(String[] args) {
    String pasw = "1234";
    String intento;

    Scanner scanner = new Scanner(System.in);

    do{
      System.out.println("Ingresa la contrasena ");
      intento = scanner.next();

    }while (!intento.equals(pasw));
    System.out.println("Contrasena correcta, acceso concedido.");
  }
}
