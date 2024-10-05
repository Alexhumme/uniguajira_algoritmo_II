package corte_2.matrices;

import java.util.Random;
import java.util.Scanner;

/**
 * ejercicio
 */
public class ejercicio {
  public static void cleanConsole() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }

  public static int width = 61;

  public static void topLine() {
    System.out.print("╭");
    for (int i = 0; i < width - 1; i++) {

      System.out.print("─");
    }
    System.out.println("╮");
  }

  public static void rowLine() {
    System.out.print("├");
    for (int i = 0; i < width - 1; i++) {
      System.out.print("─");
    }
    System.out.println("┤");
  }

  public static void bottomLine() {
    System.out.print("╰");
    for (int i = 0; i < width - 1; i++) {
      System.out.print("─");
    }
    System.out.println("╯");
  }

  public static void centerPrint(String txt) {
    int txt_w = txt.replaceAll("\\u001B\\[[;\\d]*m", "").length();
    System.out.print("│");
    int padding = (int) ((width - txt_w) / 2);
    for (int i = 0; i < padding; i++) {
      System.out.print(" ");
    }
    System.out.print(txt);
    if (txt_w % 2 == width % 2) {
      padding--;
    }
    ;
    for (int i = 0; i < padding; i++) {
      System.out.print(" ");
    }
    System.out.println("│");

  }

  public static void sbetweenPrint(String value1, String value2) {
    String line;
    int spacebetween;

    int txt1_w = value1.replaceAll("\\u001B\\[[;\\d]*m", "").length();
    int txt2_w = value2.replaceAll("\\u001B\\[[;\\d]*m", "").length();

    line = "";
    line += ("\033[34m" + value1 + "\033[0m");

    spacebetween = width - txt1_w - txt2_w - 3;

    for (int j = 0; j < spacebetween; j++) {
      line += " ";
    }

    line += ("\033[31m" + value2 + "\033[0m");

    print(line);
  }

  public static void print(String txt, String label) {
    String cadena = label + " │ " + txt;
    print(cadena);
  }

  public static void print(String txt) {
    int txt_w = txt.replaceAll("\\u001B\\[[;\\d]*m", "").length();
    System.out.print("│ " + txt);
    for (int i = txt_w + 3; i <= width; i++) {
      System.out.print(" ");
    }
    System.out.println("│");
  }

  public static void print(int value) {
    print("" + value);
  }

  public static int input(String msg) {
    System.out.print("│ " + msg + "> │ ");
    int value = scanner.nextInt();

    System.out.print("\033[F"); // Mover el cursor una línea arriba
    System.out.print("\033[K"); // Borrar la línea desde la posición actual hasta el final

    print("> │ "+value);
    System.out.print("\033[0m");
    return value;
  }

  public static int input(double msg) {
    return input("" + msg);
  }

  public static int input(int msg) {
    return input("" + msg);
  }

  public static int input() {
    return input("");
  }

  public static int[][] matriz = new int[5][5];

  public static Scanner scanner = new Scanner(System.in);

  public static void llenar() {
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[0].length; j++) {
        matriz[i][j] = (int) (new Random().nextInt(10000));
      }
    }

    bottomLine();
    topLine();
    centerPrint("\033[32mELementos añadidos\033[0m");
    bottomLine();
    scanner.nextLine();
    scanner.nextLine();
  }

  public static void llenarManualmente() {
    bottomLine();
    topLine();

    for (int i = 0; i < matriz.length; i++) {
      print("\033[35mLlenar fila " + (i + 1) + "\033[0m");
      rowLine();
      for (int j = 0; j < matriz[i].length; j++) {
        matriz[i][j] = input((j + 1) + " ");
      }
      rowLine();
    }

    centerPrint("\033[32mELementos añadidos\033[0m");
    bottomLine();
    scanner.nextLine();
    scanner.nextLine();
  }

  public static void ver() {
    bottomLine();
    topLine();

    String line;
    int value_padding;

    for (int i = 0; i < matriz.length; i++) {
      if (i != 0)
        rowLine();
      line = "";
      for (int j = 0; j < matriz[i].length; j++) {

        value_padding = (int) (((width / 5) - ("" + matriz[i][j]).length() - 3) / 2);

        if (j > 0)
          line += " │ ";

        for (int k = 0; k < value_padding; k++) {
          line += " ";
        }

        line += "" + matriz[i][j];

        if ((""+matriz[i][j]).length() % 2 != 0) {
          value_padding--;
        }

        for (int k = 0; k < value_padding; k++) {
          line += " ";
        }
      }
      centerPrint(line);
    }

    bottomLine();
    scanner.nextLine();
    scanner.nextLine();
  }

  public static void estadisticas() {
    bottomLine();
    topLine();
    int suma = 0, mayor, menor;
    double promedio;

    mayor = matriz[0][0];
    menor = matriz[0][0];

    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz.length; j++) {
        suma += matriz[i][j];

        if (matriz[i][j] > mayor) {
          mayor = matriz[i][j];
        }
        ;
        if (matriz[i][j] < menor) {
          menor = matriz[i][j];
        }
        ;
      }
    }

    promedio = suma / (matriz.length * matriz[0].length);

    print("\033[32mSuma │ " + suma + "\033[0m");
    rowLine();
    print("\033[33mPromedio │ " + promedio + "\033[0m");
    rowLine();
    print("\033[34mMayor │ " + mayor + "\033[0m");
    rowLine();
    print("\033[31mMenor │ " + menor + "\033[0m");
    bottomLine();

    scanner.nextLine();
    scanner.nextLine();
  }

  public static void diagonales() {
    bottomLine();
    topLine();
    centerPrint("\033[35mDiagonales\033[0m");
    rowLine();
    sbetweenPrint("\033[34mPrincipal\033[0m", "\033[31mSecundaria\033[0m");
    rowLine();
    String line;
    int value_padding;

    for (int i = 0; i < matriz.length; i++) {
      if (i != 0)
        rowLine();
      line = "";
      for (int j = 0; j < matriz[i].length; j++) {

        value_padding = (int) (((width / 5) - ("" + matriz[i][j]).length() - 3) / 2);

        if (j > 0)
          line += " │ ";

        for (int k = 0; k < value_padding; k++) {
          line += " ";
        }

        if (i == j && i + j + 1 == matriz[i].length) {
          line += "\033[35m" + matriz[i][j] + "\033[0m";
        } else {
          if (i == j) {
            line += "\033[34m" + matriz[i][j] + "\033[0m";
          }
          if (i + j + 1 == matriz[i].length) {
            line += "\033[31m" + matriz[i][j] + "\033[0m";
          }
        }
        for (int k = 0; k < value_padding; k++) {
          line += " ";
        }
      }
      centerPrint(line);
    }

    bottomLine();
    scanner.nextLine();
    scanner.nextLine();
  }

  public static void fila_columna() {
    bottomLine();
    topLine();
    
    int row = input("Seleccine una fila (0-"+(matriz.length - 1)+")");
    rowLine();
    int col = input("Seleccine una columna (0-"+(matriz.length - 1)+")");

    String line;
    int value_padding;

    rowLine();
    for (int i = 0; i < matriz.length; i++) {
      if (i != 0)
        rowLine();
      line = "";
      for (int j = 0; j < matriz[i].length; j++) {

        value_padding = (int) (((width / 5) - ("" + matriz[i][j]).length() - 3) / 2);
        if (i != row && j != col) { 
          value_padding = 4;
        }

        if (j > 0)
          
          line += " │ ";

        for (int k = 0; k < value_padding; k++) {
          line += " ";
        }
        
        if (i == row && j == col) {
           line += "\033[35m" + matriz[i][j] + "\033[0m";
        } else {
          if (i == row) {
            line += "\033[34m" + matriz[i][j] + "\033[0m";
          }
          if (j == col) {
            line += "\033[31m" + matriz[i][j] + "\033[0m";
          }
        }
        if ((i == row || j == col) && (""+matriz[i][j]).length()%2 != 0) { 
          value_padding -= 1;
        }

        for (int k = 0; k < value_padding; k++) {
          line += " ";
        }
      }
      centerPrint(line);
    }

    bottomLine();
    scanner.nextLine();
    scanner.nextLine();
  }

  public static void inversa() {
    bottomLine();
    topLine();

    String line;
    int value_padding;

    for (int i = 0; i < matriz.length; i++) {
      if (i != 0)
        rowLine();
      line = "";
      for (int j = 0; j < matriz[i].length; j++) {

        value_padding = (int) (((width / 5) - ("" + matriz[j][i]).length() - 3) / 2);

        if (j > 0)
          line += " │ ";

        for (int k = 0; k < value_padding; k++) {
          line += " ";
        }

        line += "" + matriz[j][i];

        if ((""+matriz[j][i]).length() % 2 != 0) {
          value_padding--;
        }

        for (int k = 0; k < value_padding; k++) {
          line += " ";
        }
      }
      centerPrint(line);
    }

    bottomLine();
    scanner.nextLine();
    scanner.nextLine();
  }


  public static void reiniciar() {
    matriz = new int[5][5];
    bottomLine();
    topLine();
    centerPrint("\033[31mMatriz reiniciada\033[0m");
    bottomLine();
    scanner.nextLine();
    scanner.nextLine();
  }

  public static void salir() {

  }

  public static void intro() {
   
    String line1 = "", line2 = "", line3 = "";

    for (int i = 0; i <= width; i++) {
      cleanConsole(); 
      
      System.out.println("");

      line1 = "";
      line2 = "";
      line3 = "";
      for (int j = 0; j <= i; j++) {

        if (j >= i - 1) {
          line1 += ("│");
          line3 += ("│");         
        } else if (j >= i - 2) {
          line1 += ("/");
          line3 += ("/");
        } else {
          line1 += ("-");
          line3 += ("-");
        }
        if (j == 0 || j == i) {
          line2 += ("│");
        } else {   
          line2 += (" ");
        }       
      }

      System.out.println(line1);
      System.out.println(line2);
      System.out.println(line3);
      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      }
    }

    System.out.println();
  }

  public static String[] opciones = {
      "Llenar aleatoriamente",
      "Llenar manualmente",
      "Ver",
      "Estadisticas",
      "Diagonales",
      "Seleccionar fila y columna",
      "Inversa",
      "Reiniciar",
      "Salir"
  };
  public static Runnable[] metodos = {
      () -> llenar(),
      () -> llenarManualmente(),
      () -> ver(),
      () -> estadisticas(),
      () -> diagonales(),
      () -> fila_columna(),
      () -> inversa(),
      () -> reiniciar(),
      () -> salir()
  };

  public static void main(String[] args) {
    int opt;
    do {

      cleanConsole();
      
      intro();

      topLine();
      centerPrint("\033[1;34mUtilidades de una matriz\033[0m");
      for (int i = 0; i < opciones.length; i++) {
        rowLine();
        print(opciones[i], "" + (i + 1));
      }
      rowLine();
      opt = input();

      if (opt >= 1 && opt <= metodos.length) {
        metodos[opt - 1].run();
      }

    } while (opt != opciones.length);

    bottomLine();

  }
}
