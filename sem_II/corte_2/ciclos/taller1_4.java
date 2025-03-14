package corte_2.ciclos;

import java.util.Scanner;

/**
 * taller1_4
 */
public class taller1_4 {

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int intentos = 3;
    String cable, correcto = "r";
    System.out.println(" ----- Desactivar a bomba -----");
    do {
      System.out.println("\nCual de los cables desactiva la bomba? "+intentos+" intentos");
      System.out.println("  v. Verde");
      System.out.println("  r. Rojo");
      System.out.println("  a. Azul");
      System.out.println("  m. Morado");
      System.out.print("  > ");
      cable = scanner.next();
      intentos--;
    } while (intentos > 0 && !cable.equals(correcto));

    if (cable.equals(correcto)) System.out.println(" ... Bomba desactivada ...");
    else System.out.println(" 💥 BOOM💥  ");
  }
}
