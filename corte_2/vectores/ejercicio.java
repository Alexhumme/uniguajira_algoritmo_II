package corte_2.vectores;

import java.util.Scanner;

/**
 * ejercicio
 */
public class ejercicio {
  public static void cleanConsole() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }

  public static int width = 27;

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

  public static int input(String msg) {
    System.out.print("| " + msg + "> | ");
    int value = scanner.nextInt();
    System.out.print("\033[0m");
    return value;
  }

  public static int input() {
    return input("");
  }

  public static int[] arreglo = new int[0];
  public static Scanner scanner = new Scanner(System.in);

  public static void llenar() {
    cleanConsole();
    topLine();
    int cantidad = input("\033[35mCuantos añadir? ");
    int[] ext = new int[cantidad];
    int[] reemplazo = new int[cantidad + arreglo.length];

    for (int i = 0; i < cantidad; i++) {
      rowLine();
      ext[i] = input();
    }

    rowLine();
    print("\033[1;32mElementos añadidos\033[0m");
    bottomLine();
    scanner.nextLine();
    scanner.nextLine();

    System.arraycopy(arreglo, 0, reemplazo, 0, arreglo.length);
    System.arraycopy(ext, 0, reemplazo, arreglo.length, cantidad);

    arreglo = reemplazo;
  }

  public static void ver() {
    cleanConsole();
    topLine();
    for (int i = 0; i < arreglo.length; i++) {
      print(arreglo[i] + " años", "\033[1mEdad " + i + "\033[0m");
    }
    bottomLine();
    scanner.nextLine();
    scanner.nextLine();
  }

  public static void suma_promedio() {
    cleanConsole();
    topLine();
    int suma = 0;
    double prom;
    for (int i = 0; i < arreglo.length; i++) {
      suma += arreglo[i];
    }
    if (arreglo.length > 0) {
      print(suma + "", "Sumatoria");
      rowLine();
      prom = suma / arreglo.length;
      print(prom + "", "Promedio");
    } else {
      print("\033[31mEl arreglo esta vacio\033[0m");
    }
    bottomLine();
    scanner.nextLine();
    scanner.nextLine();
  }

  public static void mayor_menor() {

    cleanConsole();
    topLine();

    int mayor = 0, menor = 0;
    if (arreglo.length > 0) {

      for (int i = 0; i < arreglo.length; i++) {
        if (i == 0) {
          menor = arreglo[0];
        }
        if (arreglo[i] > mayor) {
          mayor = arreglo[i];
        }
        if (arreglo[i] < menor) {
          menor = arreglo[i];
        }
      }

      print(""+mayor, "\033[34mMayor\033[0m");
      rowLine();
      print(""+menor, "\033[31mMenor\033[0m");

    } else {
      print("\033[31mEl arreglo esta vacio\033[0m");
    }

    bottomLine();
    scanner.nextLine();
    scanner.nextLine();

  }

  public static void reiniciar() {
    arreglo = new int[0];
    topLine();
    print("\033[31mArreglo reiniciado\033[0m");
    bottomLine();
    scanner.nextLine();
    scanner.nextLine();
  }

  public static void salir() {

  }

  public static String[] opciones = {
      "Llenar",
      "Ver",
      "Suma y promedio",
      "Mayor y menor",
      "Reiniciar",
      "Salir"
  };
  public static Runnable[] metodos = {
      () -> llenar(),
      () -> ver(),
      () -> suma_promedio(),
      () -> mayor_menor(),
      () -> reiniciar(),
      () -> salir()
  };

  public static void main(String[] args) {
    int opt;
    do {

      cleanConsole();

      topLine();
      System.out.println("| \033[1;34mUtilidades de un arreglo\033[0m |");
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
