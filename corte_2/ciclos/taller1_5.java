package corte_2.ciclos;

import java.util.Scanner;

/**
 * taller1_5
 */
public class taller1_5 {

  public static void main(String[] args) {
    int manzanas = 3;
    int m1x = 2, m1y = 4,
        m2x = 26, m2y = 2,
        m3x = 15, m3y = 8,
        px = 0, py = 0;
    int movx = 0, movy = 0;
    int alto = 10, ancho = 30;
    long delay = 100;
    int conteo = 0;
    Scanner scanner = new Scanner(System.in);

    System.out.println(" ----- Atrapa manzanas ----- ");
    scanner.nextLine();
    do {

      System.out.println("");
      for (int i = 0; i < ancho + 2; i++) System.out.print("-");
      for (int y = 0; y < alto; y++) {
        System.out.print("\n|");
        for (int x = 0; x < ancho; x++) {
          if (px == x && py == y) {
            System.out.print("p");
          } else if (
              (x == m1x && y == m1y) ||
              (x == m2x && y == m2y) ||
              (x == m3x && y == m3y)
          ) {
            System.out.print("*");
          } else {
            System.out.print(" ");
          }
        }
        System.out.print("|");
      }
      System.out.println("");
      for (int i = 0; i < ancho + 2; i++) System.out.print("-");
      
      if (px == m1x && py == m1y){
        m1x = -1; m1y = -1; manzanas--;
      }
      if (px == m2x && py == m2y){
        m2x = -1; m2y = -1; manzanas--;
      }
     if (px == m3x && py == m3y){
        m3x = -1; m3y = -1; manzanas--;
      }

      conteo++;
      System.out.println("\n\nconteo : "+conteo);
      if (manzanas > 0 && movx == 0 && movy == 0) {
        System.out.print("> Pasos en x : ");
        movx = scanner.nextInt();
        System.out.print("> Pasos en y : ");
        movy = scanner.nextInt();
      }

      if (movx > 0) { movx --; px++; }
      if (movx < 0) { movx ++; px--; }
      if (movy > 0) { movy --; py++; }
      if (movy < 0) { movy ++; py--; }

      try {
        Thread.sleep(delay);
      } catch (InterruptedException e){
        Thread.currentThread().interrupt();
      }

      System.out.print("\033[H\033[2J");  
      System.out.flush();

    } while (manzanas > 0);
    System.out.println("--- Juego completado !");
    scanner.close();
  }
}
