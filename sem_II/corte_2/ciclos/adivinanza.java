package corte_2.ciclos;

import java.util.Scanner;

/**
 * adivinanza
 */
public class adivinanza {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numeroSecreto = 7;
    int intento;

    System.out.println("----- JUEGO DE ADIVINANZAS -----");
    System.out.print("> Adivina un entero del 1 al 10 : ");
    intento = scanner.nextInt();

    while (intento != numeroSecreto){
      System.out.print("> Numero incorrecto, intente de nuevo : ");
      intento = scanner.nextInt();
    }

    System.out.println("  Correcto!");
  }
}
