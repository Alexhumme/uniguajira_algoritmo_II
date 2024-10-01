package corte_2.vectores;

import java.util.Scanner;

/**
 * ejemplo
 */
public class ejemplo {
  public static void cleanConsole() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }

  public static int width = 18;

  public static void print(String txt, String label){
    int txt_w = txt.length();
    int lab_w = label.length();

    System.out.print("| "+label+" | "+txt);
    for (int i = txt_w+lab_w+7; i <= width ; i++) {
      System.out.print(" ");
    }
    System.out.println("|");
  }
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int[] edades = new int[5];
    int suma = 0;
    int mayor = 0, menor = 0;
    double prom;

    for (int i = 0; i < edades.length + 1; i++) {
      
      cleanConsole();
      System.out.println("┌----------------┐");
      System.out.println("| Ejemplo edades |");
      System.out.println("├---┬------------┤");

      for (int j = 0; j < i; j++) {
        print(edades[j] + " Años",""+j);
      }
      

      if (i < edades.length) {

        System.out.print("| > | ");
        edades[i] = scanner.nextInt();
        suma += edades[i];
        
        if (i==0) {
          menor = edades[i];
          mayor = edades[i];
        } else {
          if (edades[i] < menor) menor = edades[i];
          if (edades[i] > mayor) mayor = edades[i];
        }
      }
    }

    prom = suma / edades.length;

    System.out.println("├---┼------------┤");
    print(""+suma, "Σ");
    System.out.println("├---┼------------┤");
    print(""+prom, "x̅");
    System.out.println("├---┴-┬----------┤");
    print(""+menor,"min");
    System.out.println("├-----┼----------┤");
    print(""+mayor,"may");
    System.out.println("└-----┴----------┘");
  }
}
