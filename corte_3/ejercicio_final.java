package corte_3;

import java.util.Random;
import java.util.Scanner;

/**
 * ejercicio
 */
public class ejercicio_final {
  public static void cleanConsole() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }

  public static int width = 154;

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

    print("> │ " + value);
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

  public static String inputString(String msg) {
    System.out.print("│ " + msg + "> │ ");
    String value = scanner.next(); // Capturar la entrada como cadena

    System.out.print("\033[F"); // Mover el cursor una línea arriba
    System.out.print("\033[K"); // Borrar la línea desde la posición actual hasta el final

    print("> │ " + value);
    System.out.print("\033[0m");
    return value;
  }

  public static String inputString() {
    return inputString(""); // Sobrecarga para usar sin mensaje
  }

  // ejercios
  // -----------------------------------------------------------------_-

  // secuenciales
  public static void secuenciales_1() {
    cleanConsole();
    topLine();
    centerPrint("Suma de 2 digitos");
    rowLine();
    double num1, num2;
    num1 = input(" Digite el primer valor: ");
    num2 = input(" Digite el segundo valor: ");

    print(" " + num1 + " + " + num2 + " = " + (num1 + num2));
    bottomLine();
    scanner.nextLine();
    scanner.nextLine();
  }

  public static void secuenciales_2() {
    cleanConsole();
    topLine();
    centerPrint("Hola ");
    rowLine();

    String nombre;
    print(" Digite su nombre : ");
    nombre = scanner.next();
    print(" Hola " + nombre + "!");
    bottomLine();
    scanner.nextLine();
    scanner.nextLine();
  }

  public static void secuenciales_3() {
    cleanConsole();
    topLine();
    centerPrint("Descuento");
    rowLine();

    double compra, total;
    compra = input(" Digite el total de la compra : $");
    total = compra - (compra * 0.25);
    print(" El total con un 25% de descuento es : $" + total);
    bottomLine();

    scanner.nextLine();
    scanner.nextLine();
  }

  public static void secuenciales_4() {
    cleanConsole();
    topLine();
    centerPrint("Año de nacimiento");
    rowLine();

    int edad, agno;
    edad = input(" Digite su edad actual : ");
    agno = 2024 - edad;
    print(" Naciste cerca del " + agno);
    bottomLine();

    scanner.nextLine();
    scanner.nextLine();
  }

  public static void secuenciales_5() {
    cleanConsole();
    topLine();
    centerPrint("Porcentaje que representa");

    rowLine();
    double valor = input("Digite un valor");
    double valor2 = input("Digite otro");
    rowLine();
    print("" + valor2 + " es el " + ((valor2 * 100) / valor) + "% de " + valor);
    bottomLine();

    scanner.nextLine();
    scanner.nextLine();
  }

  // condicionales simples
  // -----------------------------------------------------------------

  public static void condicionales_simples_1() {

    cleanConsole();
    topLine();
    centerPrint("Mayor de edad");
    rowLine();

    int edad;
    edad = input(" Digite su edad: ");
    if (edad >= 18) {
      print(" Es mayor de edad");
    } else {
      print(" Es menor de edad");
    }
    bottomLine();

    scanner.nextLine();
    scanner.nextLine();
  }

  public static void condicionales_simples_2() {

    cleanConsole();
    topLine();
    centerPrint("Par o impar");
    rowLine();

    int n = input(" Digite un numero : ");
    if ((n % 2) == 0) {
      print(" Este numero es par");
    } else {
      print(" Este numero es impar");
    }
    bottomLine();

    scanner.nextLine();
    scanner.nextLine();
  }

  public static void condicionales_simples_3() {

    cleanConsole();
    topLine();
    centerPrint("Rifa ");
    rowLine();

    int correcto = 5, num;
    num = input(" Digite un numero del 1 al 10 : ");
    if (num == correcto) {
      print(" Numero correcto, ganaste!");
    } else {
      print(" Numero equivocado!");
    }
    bottomLine();

    scanner.nextLine();
    scanner.nextLine();
  }

  public static void condicionales_simples_4() {

    cleanConsole();
    topLine();
    centerPrint("Salir a pasear");
    rowLine();

    int temp;
    temp = input(" La temperatura actual : ");
    if (temp >= 30) {
      print(" Vamos a la playa.");
    } else {
      print(" Quedemonos en casa.");
    }
    bottomLine();

    scanner.nextLine();
    scanner.nextLine();
  }

  public static void condicionales_simples_5() {

    cleanConsole();
    topLine();
    centerPrint("Positivo o negativo");
    rowLine();

    int valor = input(" Digite un valor: ");
    if (valor > 0) {
      print(" Numero positivo");
    } else if (valor < 0) {
      print(" Numero negativo");
    } else {
      print(" Cero");
    }

    bottomLine();

    scanner.nextLine();
    scanner.nextLine();
  }

  // condicionales anidados
  // -----------------------------------------------------------------

  public static void condicionales_anidados_1() {

    cleanConsole();
    topLine();
    centerPrint("Verificar si un numero es positivo, negativo o cero");
    rowLine();

    int num = input(" Digite un numero: ");
    if (num > 0) {
      print(" El numero es positivo.");
    } else {
      if (num < 0) {
        print(" El numero es negativo.");
      } else {
        print(" El numero es cero.");
      }
    }
    bottomLine();

    scanner.nextLine();
    scanner.nextLine();
  }

  public static void condicionales_anidados_2() {

    cleanConsole();
    topLine();
    centerPrint("Verificar si un numero esta dentro del rango 10-50");
    rowLine();

    int nums = input(" Digite un numero: ");
    if (nums >= 10) {
      if (nums <= 50) {
        print(" El numero esta dentro del rango 10-50.");
      } else {
        print(" El numero es mayor que 50.");
      }
    } else {
      print(" El numero es menor que 10.");
    }
    bottomLine();

    scanner.nextLine();
    scanner.nextLine();
  }

  public static void condicionales_anidados_3() {

    cleanConsole();
    topLine();
    centerPrint("Determinar el mayor de tres numeros");
    rowLine();

    int num1 = input(" Digite el primer numero: ");
    int num2 = input(" Digite el segundo numero: ");
    int num3 = input(" Digite el tercer numero: ");

    if (num1 >= num2) {
      if (num1 >= num3) {
        print(" El mayor es: " + num1);
      } else {
        print(" El mayor es: " + num3);
      }
    } else {
      if (num2 >= num3) {
        print(" El mayor es: " + num2);
      } else {
        print(" El mayor es: " + num3);
      }
    }
    bottomLine();

    scanner.nextLine();
    scanner.nextLine();
  }

  public static void condicionales_anidados_4() {

    cleanConsole();
    topLine();
    centerPrint("Determinar si un año es bisiesto");
    rowLine();

    int year = input(" Digite un año: ");
    if (year % 4 == 0) {
      if (year % 100 != 0 || year % 400 == 0) {
        print(" El año es bisiesto.");
      } else {
        print(" El año no es bisiesto.");
      }
    } else {
      print(" El año no es bisiesto.");
    }
    bottomLine();

    scanner.nextLine();
    scanner.nextLine();
  }

  public static void condicionales_anidados_5() {

    cleanConsole();
    topLine();
    centerPrint("Clasificar una nota");
    rowLine();

    int nota = input(" Digite la nota: ");

    if (nota >= 90) {
      print(" Calificacion: A");
    } else {
      if (nota >= 80) {
        print(" Calificacion: B");
      } else {
        if (nota >= 70) {
          print(" Calificacion: C");
        } else {
          if (nota >= 60) {
            print(" Calificacion: D");
          } else {
            print(" Calificacion: F");
          }
        }
      }
    }
    bottomLine();

    scanner.nextLine();
    scanner.nextLine();
  }

  // ciclo for
  // -----------------------------------------------------------------

  public static void ciclo_for_1() {

    cleanConsole();
    topLine();
    centerPrint("Numeros del 1 al 10");
    rowLine();

    for (int i = 1; i <= 10; i++) {
      print(" " + i);
    }
    bottomLine();

    scanner.nextLine();
    scanner.nextLine();
  }

  public static void ciclo_for_2() {

    cleanConsole();
    topLine();
    centerPrint("Numeros del 10 al 1");
    rowLine();

    for (int i = 10; i >= 1; i--) {
      print(" " + i);
    }
    bottomLine();

    scanner.nextLine();
    scanner.nextLine();
  }

  public static void ciclo_for_3() {

    cleanConsole();
    topLine();
    centerPrint("De 2 en 2 de n al 100");
    rowLine();

    int n = input(" Digite un numero : ");
    for (int i = n; i <= 100; i += 2) {
      print(" " + i);
    }
    bottomLine();

    scanner.nextLine();
    scanner.nextLine();
  }

  public static void ciclo_for_4() {

    cleanConsole();
    topLine();
    centerPrint("Piramide");
    rowLine();

    for (int i = 1; i <= 5; i++) {
      System.out.print("     ");
      for (int j = 1; j <= 5; j++) {
        if (j >= i) {
          System.out.print("* ");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println("");
    }
    bottomLine();

    scanner.nextLine();
    scanner.nextLine();
  }

  public static void ciclo_for_5() {

    cleanConsole();
    topLine();
    centerPrint("Promedio de notas");
    rowLine();

    double total = 0, nota;
    int cantidad = input(" Digite cantidad de notas : ");
    for (int i = 1; i <= cantidad; i++) {
      nota = input(i + " | Digite nota : ");
      total += nota;
    }
    print(" promedio de las notas : " + (total / cantidad));
    bottomLine();

    scanner.nextLine();
    scanner.nextLine();
  }

  // ciclo while
  // -----------------------------------------------------------------

  public static void ciclo_while_1() {

    cleanConsole();
    topLine();
    centerPrint("Suma de los primeros N numeros enteros");
    rowLine();

    int N = input(" Digite un numero N: ");
    int suma = 0;
    int i = 1;
    while (i <= N) {
      suma += i;
      i++;
    }
    print(" La suma de los primeros " + N + " numeros es: " + suma);
    bottomLine();

    scanner.nextLine();
    scanner.nextLine();
  }

  public static void ciclo_while_2() {

    cleanConsole();
    topLine();
    centerPrint("Factorial de un numero");
    rowLine();

    int num = input(" Digite un numero: ");
    int factorial = 1;
    int i2 = 1;
    while (i2 <= num) {
      factorial *= i2;
      i2++;
    }
    print(" El factorial de " + num + " es: " + factorial);
    bottomLine();

    scanner.nextLine();
    scanner.nextLine();
  }

  public static void ciclo_while_3() {

    cleanConsole();
    topLine();
    centerPrint("Contar los digitos de un numero");
    rowLine();

    int numero = input(" Digite un numero: ");
    int digitos = 0;
    while (numero != 0) {
      numero /= 10;
      digitos++;
    }
    print(" El numero tiene " + digitos + " digitos.");
    bottomLine();

    scanner.nextLine();
    scanner.nextLine();
  }

  public static void ciclo_while_4() {

    cleanConsole();
    topLine();
    centerPrint("Suma de los digitos de un numero");
    rowLine();

    int numero2 = input(" Digite un numero: ");
    int sumaDigitos = 0;
    while (numero2 != 0) {
      sumaDigitos += numero2 % 10;
      numero2 /= 10;
    }
    print(" La suma de los digitos es: " + sumaDigitos);
    bottomLine();

    scanner.nextLine();
    scanner.nextLine();
  }

  public static void ciclo_while_5() {

    cleanConsole();
    topLine();
    centerPrint("Contar numeros pares entre dos valores");
    rowLine();

    int valor1 = input(" Digite el primer valor: ");
    int valor2 = input(" Digite el segundo valor: ");
    int pares = 0;
    int i5 = valor1;
    while (i5 <= valor2) {
      if (i5 % 2 == 0) {
        pares++;
      }
      i5++;
    }
    print(" Hay " + pares + " numeros pares entre " + valor1 + " y " + valor2);
    bottomLine();
    scanner.nextLine();
    scanner.nextLine();
  }

  // matrices
  // -----------------------------------------------------------------

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

        value_padding = (int) (((width / matriz.length) - ("" + matriz[i][j]).length() - 3) / 2);

        if (j > 0)
          line += " │ ";

        for (int k = 0; k < value_padding; k++) {
          line += " ";
        }

        line += "" + matriz[i][j];

        if (("" + matriz[i][j]).length() % 2 != 0) {
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

        value_padding = (int) (((width / matriz.length) - ("" + matriz[i][j]).length() - 3) / 2);

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

    int row = input("Seleccine una fila (0-" + (matriz.length - 1) + ")");
    rowLine();
    int col = input("Seleccine una columna (0-" + (matriz.length - 1) + ")");

    String line;
    int value_padding;

    rowLine();
    for (int i = 0; i < matriz.length; i++) {
      if (i != 0)
        rowLine();
      line = "";
      for (int j = 0; j < matriz[i].length; j++) {

        value_padding = (int) (((width / matriz.length) - ("" + matriz[i][j]).length() - 3) / 2);
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
        if ((i == row || j == col) && ("" + matriz[i][j]).length() % 2 != 0) {
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

        value_padding = (int) (((width / matriz.length) - ("" + matriz[j][i]).length() - 3) / 2);

        if (j > 0)
          line += " │ ";

        for (int k = 0; k < value_padding; k++) {
          line += " ";
        }

        line += "" + matriz[j][i];

        if (("" + matriz[j][i]).length() % 2 != 0) {
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

  // Recursividad
  // -----------------------------------------------------------------

  public static void recursividad_1() {
    cleanConsole();
    topLine();
    centerPrint("Calcular el factorial de un numero usando recursividad");
    rowLine();

    int num = input(" Digite un numero: ");
    int result = factorial(num);
    print(" El factorial de " + num + " es " + result + ".");
    bottomLine();

    scanner.nextLine();
    scanner.nextLine();
  }

  private static int factorial(int n) {
    if (n == 0 || n == 1) {
      return 1;
    } else {
      return n * factorial(n - 1);
    }
  }

  public static void recursividad_2() {
    cleanConsole();
    topLine();
    centerPrint("Encontrar el n-esimo numero de Fibonacci usando recursividad");
    rowLine();

    int n = input(" Digite la posicion (n): ");
    int result = fibonacci(n);
    print(" El numero de Fibonacci en la posicion " + n + " es " + result + ".");
    bottomLine();

    scanner.nextLine();
    scanner.nextLine();
  }

  private static int fibonacci(int n) {
    if (n <= 1) {
      return n;
    } else {
      return fibonacci(n - 1) + fibonacci(n - 2);
    }
  }

  public static void recursividad_3() {
    cleanConsole();
    topLine();
    centerPrint("Calcular la potencia de un numero usando recursividad");
    rowLine();

    int base = input(" Digite la base: ");
    int exp = input(" Digite el exponente: ");
    int result = potencia(base, exp);
    print(" El resultado de " + base + " elevado a la " + exp + " es " + result + ".");
    bottomLine();

    scanner.nextLine();
    scanner.nextLine();
  }

  private static int potencia(int base, int exp) {
    if (exp == 0) {
      return 1;
    } else {
      return base * potencia(base, exp - 1);
    }
  }

  public static void recursividad_4() {
    cleanConsole();
    topLine();
    centerPrint("Invertir una cadena de texto usando recursividad");
    rowLine();

    String texto = inputString(" Digite una cadena: ");
    String resultado = invertirCadena(texto);
    print(" La cadena invertida es: " + resultado + ".");
    bottomLine();

    scanner.nextLine();
    scanner.nextLine();
  }

  private static String invertirCadena(String texto) {
    if (texto.isEmpty()) {
      return texto;
    } else {
      return invertirCadena(texto.substring(1)) + texto.charAt(0);
    }
  }

  public static void recursividad_5() {
    cleanConsole();
    topLine();
    centerPrint("Sumar los digitos de un numero usando recursividad");
    rowLine();

    int numero = input(" Digite un numero: ");
    int suma = sumaDigitos(numero);
    print(" La suma de los digitos de " + numero + " es " + suma + ".");
    bottomLine();

    scanner.nextLine();
    scanner.nextLine();
  }

  private static int sumaDigitos(int numero) {
    if (numero == 0) {
      return 0;
    } else {
      return (numero % 10) + sumaDigitos(numero / 10);
    }
  }

  // Opciones
  // ------------------------------------------------------------------

  public static void cambiar_width() {
    bottomLine();
    topLine();
    print("Ancho actual : " + width);
    rowLine();
    width = input("Digite el nuevo ancho ");
    rowLine();
    print("Ancho modificado");
    bottomLine();
    scanner.nextLine();
    scanner.nextLine();
  }

  public static void redimensionar() {
    bottomLine();
    topLine();
    print("Dimension actual : " + matriz.length + "x" + matriz[0].length);
    int l = input("Digite lado de la matriz ");
    rowLine();
    print("\033[33mEsta accion limipiara la matriz\033[0m");
    rowLine();
    int confirm = input("\033[33mSeguro de continuar? (1) \033[0m");
    rowLine();
    if (confirm == 1) {
      matriz = new int[l][l];
      rowLine();
      centerPrint("\033[32mMatriz modificada\033[0m");
    } else {
      centerPrint("\033[31mAccion cancelada\033[0m");
    }
    bottomLine();
    scanner.nextLine();
    scanner.nextLine();
  }

  // menu principal y pestañas
  // ----------------------------------------------------------------

  public static void show_cats() {
    rowLine();
    String line = "";
    for (int i = 0; i < cats.length; i++) {
      if (i != 0) {
        line += " │ ";
      }
      if (i == cat) {
        line += "\033[36m";
      }
      line += (-(i + 1)) + ". ";
      line += "" + cats[i] + "\033[0m";
    }
    centerPrint(line);
  }

  public static int cat = 0;

  public static String[] cats = {
      "Secuenciales",
      "Condicionales",
      "Condicionales anidados",
      "Ciclo for",
      "Ciclo while",
      "Matrices",
      "Recursividad",
      "Opciones"
  };

  public static String[][] cats_titulos = {
      {
          "Suma de 2 digitos",
          "Hola",
          "Descuento",
          "Año de nacimiento",
          "Porcentaje que representa",
          "Salir"
      },
      {
          "Mayor de edad",
          "Par o impar",
          "Rifa",
          "Salir a Pasear",
          "Positivo o negativo",
          "Salir"
      },
      {
          "Psotovo negativo o cero",
          "Rango 10 - 50",
          "Mayor de 3 numeros",
          "Año bisiesto",
          "Calificar nota",
          "Salir"
      },
      {
          "Del 1 al 10",
          "Del 10 a 1",
          "De 2 en 2 de n al 100",
          "Piramide",
          "Promedio de notas",
          "Salir"
      },
      {
          "Sumatoria n",
          "Factorial",
          "Contar Digitos",
          "Sumar digitos",
          "Contar pares",
          "Salir"
      },
      {
          "Llenar aleatoriamente",
          "Llenar manualmente",
          "Ver",
          "Estadisticas",
          "Diagonales",
          "Seleccionar fila y columna",
          "Inversa",
          "Reiniciar",
          "Salir"
      },
      {
          "Factorial",
          "Fibonacci",
          "Potencia",
          "Invertir cadena",
          "Sumar digitos",
          "Salir"
      },
      {
          "Cambiar ancho del programa",
          "Cambiar dimension de la matriz",
          "Salir"
      }
  };

  public static Runnable[][] cats_metodos = {
      {
          () -> secuenciales_1(),
          () -> secuenciales_2(),
          () -> secuenciales_3(),
          () -> secuenciales_4(),
          () -> secuenciales_5(),
      },
      {
          () -> condicionales_simples_1(),
          () -> condicionales_simples_2(),
          () -> condicionales_simples_3(),
          () -> condicionales_simples_4(),
          () -> condicionales_simples_5(),
      },
      {
          () -> condicionales_anidados_1(),
          () -> condicionales_anidados_2(),
          () -> condicionales_anidados_3(),
          () -> condicionales_anidados_4(),
          () -> condicionales_anidados_5(),
      },
      {
          () -> ciclo_for_1(),
          () -> ciclo_for_2(),
          () -> ciclo_for_3(),
          () -> ciclo_for_4(),
          () -> ciclo_for_5(),
      },
      {
          () -> ciclo_while_1(),
          () -> ciclo_while_2(),
          () -> ciclo_while_3(),
          () -> ciclo_while_4(),
          () -> ciclo_while_5(),
      },
      {
          () -> llenar(),
          () -> llenarManualmente(),
          () -> ver(),
          () -> estadisticas(),
          () -> diagonales(),
          () -> fila_columna(),
          () -> inversa(),
          () -> reiniciar(),
          () -> salir()
      },
      {
          () -> recursividad_1(),
          () -> recursividad_2(),
          () -> recursividad_3(),
          () -> recursividad_4(),
          () -> recursividad_5(),
      },
      {
          () -> cambiar_width(),
          () -> redimensionar(),
          () -> salir()
      }
  };

  public static void main(String[] args) {
    int opt;
    int opts;
    do {

      opts = cats_metodos[cat].length;
      cleanConsole();

      topLine();
      centerPrint("\033[1;34mUtilidades de una matriz\033[0m");

      show_cats();

      for (int i = 0; i < cats_titulos[cat].length; i++) {
        rowLine();
        print(cats_titulos[cat][i], "" + (i + 1));
      }
      rowLine();
      opt = input();

      if (opt >= 1 && opt <= opts) {
        cats_metodos[cat][(opt - 1)].run();
      }
      if (opt < 0 && -opt <= cats.length) {
        cat = (-opt) - 1;
      }

    } while (opt != cats_titulos[cat].length);

    bottomLine();

  }
}
