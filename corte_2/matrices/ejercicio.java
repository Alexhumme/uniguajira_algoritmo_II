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
    System.out.print("┌");
    for (int i = 0; i < width - 1; i++) {
      System.out.print("-");
    }
    System.out.println("┐");
  }

  public static void rowLine() {
    System.out.print("├");
    for (int i = 0; i < width - 1; i++) {
      System.out.print("-");
    }
    System.out.println("┤");
  }

  public static void bottomLine() {
    System.out.print("└");
    for (int i = 0; i < width - 1; i++) {
      System.out.print("-");
    }
    System.out.println("┘");
  }

  public static void centerPrint(String txt) {
    int txt_w = txt.replaceAll("\\u001B\\[[;\\d]*m", "").length();
    System.out.print("|");
    int padding = (int)((width-txt_w)/2);
    for (int i = 0; i < padding; i++) {
      System.out.print(" ");
    }
    System.out.print(txt);
    if (txt_w % 2 == width % 2) { padding--; };
    for (int i = 0; i < padding; i++) {
      System.out.print(" ");
    }
    System.out.println("|");

  }

  public static void print(String txt, String label) {
    String cadena = label + " | " + txt;
    print(cadena);
  }

  public static void print(String txt) {
    int txt_w = txt.replaceAll("\\u001B\\[[;\\d]*m", "").length();
    System.out.print("| " + txt);
    for (int i = txt_w + 3; i <= width; i++) {
      System.out.print(" ");
    }
    System.out.println("|");
  }

  public static void print(int value) {
    print(""+value);
  }

  public static int input(String msg) {
    System.out.print("| " + msg + "> | ");
    int value = scanner.nextInt();
    System.out.print("\033[0m");
    return value;
  }
  public static int input(double msg) {
    return input(""+msg);
  }
  public static int input(int msg) {
    return input(""+msg);
  }
  public static int input() {
    return input("");
  }

  public static int[][] matriz = new int[5][5];

  public static Scanner scanner = new Scanner(System.in);

  public static void llenar() {
    for (int i = 0; i < matriz.length; i++) {
     for (int j = 0; j < matriz[0].length; j++) {
       matriz[i][j] = (int)(new Random().nextInt(10000));
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
      print("\033[35mLlenar fila " +(i+1)+"\033[0m");
      rowLine();
      for (int j = 0; j < matriz[i].length; j++) {
          matriz[i][j] = input((j+1)+" ");
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
      if (i != 0) rowLine();
      line = "";
      for (int j = 0; j < matriz[i].length; j++) {

        value_padding = (int)(((width/5) - (""+matriz[i][j]).length() - 3)/2);

        if (j > 0) line += " | ";
        
        for (int k = 0; k < value_padding; k++) {
            line += " ";
        }
        
        line += ""+matriz[i][j];
        
        for (int k = 0; k < value_padding; k++) {
          line += " ";
        }
      }
      print(line);
    }

    bottomLine();
    scanner.nextLine();
    scanner.nextLine();
  }

  public static void estadisticas () {
    bottomLine();
    topLine();
    int suma = 0, mayor, menor;
    double promedio;
  
    mayor = matriz[0][0];
    menor = matriz[0][0];
      
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz.length; j++) {
        suma += matriz[i][j];

        
        if (matriz[i][j] > mayor) { mayor = matriz[i][j]; };
        if (matriz[i][j] < menor) { menor = matriz[i][j]; };
      } 
    }
      
    promedio = suma / (matriz.length*matriz[0].length);

    print("\033[32mSuma | "+suma+"\033[0m");
    rowLine();
    print("\033[33mPromedio | "+promedio+"\033[0m");
    rowLine();
    print("\033[34mMayor | "+mayor+"\033[0m");
    rowLine();
    print("\033[31mMenor | "+menor+"\033[0m");
    bottomLine();
  
    scanner.nextLine();
    scanner.nextLine();
  }

  public static void diagonales() {
    bottomLine();
    topLine();
    centerPrint("\033[35mDiagonales\033[0m");
    String line;
    int spacebetween;
    for (int i = 0; i < matriz.length; i++) {
      line = " ";
      line += ("\033[34m"+matriz[i][i]+"\033[0m");

      spacebetween = 
        width 
        - (""+matriz[i][i]).length() 
        - (""+matriz[i][matriz[i].length - 1 - i]).length() - 4;

      for (int j = 0; j < spacebetween; j++) {
        line += " "; 
      }

      line += ("\033[31m"+matriz[i][matriz[i].length - 1 - i]+"\033[0m ");

      print(line);
    }

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

  public static String[] opciones = {
      "Llenar aleatoriamente",
      "Llenar manualmente",
      "Ver",
      "Estadisticas",
      "Diagonales",
      "Reiniciar",
      "Salir"
  };
  public static Runnable[] metodos = {
      () -> llenar(),
      () -> llenarManualmente(),
      () -> ver(),
      () -> estadisticas(),
      () -> diagonales(),
      () -> reiniciar(),
      () -> salir()
  };

  public static void main(String[] args) {
    int opt;
    do {

      cleanConsole();

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
