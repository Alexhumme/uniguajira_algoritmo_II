package corte_2.ciclos;

import java.util.Scanner;

/**
 * trabajo1
 */

/*
 * hacer un menu con los tipos de ejercicio:
 * 1. secuanciales
 * 2. condicional simple
 * 3. condicional double
 * 4. ciclo for
 * 5. ciclo while
 * 6. salir
 *
 * cada opcion debe llevar a un submenú con 5 ejercicios de cada tipo
 *
 */
public class trabajo1 {

  public static Scanner scanner = new Scanner(System.in);

  public static void secuanciales_1() {
    loadingBar();
    cleanConsole();
    header("Suma de 2 digitos");
    double num1, num2;
    System.out.print("| > | Digite el primer valor: ");
    num1 = scanner.nextDouble();
    System.out.print("| > | Digite el segundo valor: ");
    num2 = scanner.nextDouble();

    System.out.println("|   | " + num1 + " + " + num2 + " = " + (num1 + num2));
    System.out.println("---------------------------");
    scanner.nextLine();
    scanner.nextLine();
  }

  public static void secuenciales() {
    int cursor;

    do {
      menuMain(1);
      cursor = scanner.nextInt();

      switch (cursor) {
        case 1:
          secuanciales_1();
          break;
        case 2:
          loadingBar();
          cleanConsole();
          header("Hola ");
          String nombre;
          System.out.print("| > | Digite su nombre : ");
          nombre = scanner.next();
          System.out.println("|   | Hola " + nombre + "!");
          System.out.println("---------------------------");
          scanner.nextLine();
          scanner.nextLine();
          break;
        case 3:
          loadingBar();
          cleanConsole();
          header("Descuento");
          double compra, total;
          System.out.print("| > | Digite el total de la compra : $");
          compra = scanner.nextDouble();
          total = compra - (compra * 0.25);
          System.out.println("|   | El total con un 25% de descuento es : $" + total);
          System.out.println("---------------------------");

          scanner.nextLine();
          scanner.nextLine();
          break;
        case 4:
          loadingBar();
          cleanConsole();
          header("Año de nacimiento");
          int edad, agno;
          System.out.print("| > | Digite su edad actual : ");
          edad = scanner.nextInt();
          agno = 2024 - edad;
          System.out.println("|   | Naciste cerca del " + agno);
          System.out.println("---------------------------");

          scanner.nextLine();
          scanner.nextLine();
          break;
        case 5:
          loadingBar();
          cleanConsole();
          header("Porcentaje que representa");
          System.out.print("| > | Digite un valor: ");
          double valor = scanner.nextDouble();
          System.out.print("| > | Digite otro: ");
          double valor2 = scanner.nextDouble();
          System.out.println("|   | " + valor2 + " es el " + ((valor2 * 100) / valor) + "% de " + valor);
          System.out.println("---------------------------");

          scanner.nextLine();
          scanner.nextLine();
          break;
      }
    } while (cursor != 6);
  }

  public static void condicionales_simples() {
    int cursor;
    do {
      menuMain(2);
      cursor = scanner.nextInt();

      switch (cursor) {
        case 1:
          loadingBar();
          cleanConsole();
          header("Mayor de edad");
          int edad;
          System.out.print("| > | Digite su edad: ");
          edad = scanner.nextInt();
          if (edad >= 18) {
            System.out.println("|   | Es mayor de edad");
          } else {
            System.out.println("|   | Es menor de edad");
          }
          System.out.println("---------------------------");

          scanner.nextLine();
          scanner.nextLine();
          break;
        case 2:
          loadingBar();
          cleanConsole();
          header("Par o impar");
          int n;
          System.out.print("| > | Digite un numero : ");
          n = scanner.nextInt();
          if ((n % 2) == 0) {
            System.out.println("|   | Este numero es par");
          } else {
            System.out.println("|   | Este numero es impar");
          }
          System.out.println("---------------------------");

          scanner.nextLine();
          scanner.nextLine();
          break;

        case 3:
          loadingBar();
          cleanConsole();
          header("Rifa ");
          int correcto = 5, num;
          System.out.print("| > | Digite un numero del 1 al 10 : ");
          num = scanner.nextInt();
          if (num == correcto) {
            System.out.println("|   | Numero correcto, ganaste!");
          } else {
            System.out.println("|   | Numero equivocado!");
          }
          System.out.println("---------------------------");

          scanner.nextLine();
          scanner.nextLine();
          break;
        case 4:
          loadingBar();
          cleanConsole();
          header("Salir a pasear");
          int temp;
          System.out.print("| > | La temperatura actual : ");
          temp = scanner.nextInt();
          if (temp >= 30) {
            System.out.println("|   | Vamos a la playa.");
          } else {
            System.out.println("|   | Quedemonos en casa.");
          }
          System.out.println("---------------------------");

          scanner.nextLine();
          scanner.nextLine();
          break;
        case 5:
          loadingBar();
          cleanConsole();
          header("Positivo o negativo");
          System.out.print("| > | Digite un valor: ");
          int valor = scanner.nextInt();
          if (valor > 0) {
            System.out.println("|   | Numero positivo");
          } else if (valor < 0) {
            System.out.println("|   | Numero negativo");
          } else {
            System.out.println("|   | Cero");
          }

          System.out.println("---------------------------");

          scanner.nextLine();
          scanner.nextLine();
          break;
      }
    } while (cursor != 6);
  }

  public static void condicionales_anidados() {
    int cursor;
    Scanner scanner = new Scanner(System.in);

    do {
      menuMain(3);
      cursor = scanner.nextInt();

      switch (cursor) {
        case 1:
          loadingBar();
          cleanConsole();
          header("Verificar si un numero es positivo, negativo o cero");
          System.out.print("| > | Digite un numero: ");
          int num = scanner.nextInt();
          if (num > 0) {
            System.out.println("|   | El numero es positivo.");
          } else {
            if (num < 0) {
              System.out.println("|   | El numero es negativo.");
            } else {
              System.out.println("|   | El numero es cero.");
            }
          }
          System.out.println("---------------------------");

          scanner.nextLine();
          scanner.nextLine();
          break;

        case 2:
          loadingBar();
          cleanConsole();
          header("Verificar si un numero esta dentro del rango 10-50");
          System.out.print("| > | Digite un numero: ");
          int nums = scanner.nextInt();
          if (nums >= 10) {
            if (nums <= 50) {
              System.out.println("|   | El numero esta dentro del rango 10-50.");
            } else {
              System.out.println("|   | El numero es mayor que 50.");
            }
          } else {
            System.out.println("|   | El numero es menor que 10.");
          }
          System.out.println("---------------------------");

          scanner.nextLine();
          scanner.nextLine();
          break;

        case 3:
          loadingBar();
          cleanConsole();
          header("Determinar el mayor de tres numeros");
          System.out.print("| > | Digite el primer numero: ");
          int num1 = scanner.nextInt();
          System.out.print("| > | Digite el segundo numero: ");
          int num2 = scanner.nextInt();
          System.out.print("| > | Digite el tercer numero: ");
          int num3 = scanner.nextInt();

          if (num1 >= num2) {
            if (num1 >= num3) {
              System.out.println("|   | El mayor es: " + num1);
            } else {
              System.out.println("|   | El mayor es: " + num3);
            }
          } else {
            if (num2 >= num3) {
              System.out.println("|   | El mayor es: " + num2);
            } else {
              System.out.println("|   | El mayor es: " + num3);
            }
          }
          System.out.println("---------------------------");

          scanner.nextLine();
          scanner.nextLine();
          break;

        case 4:
          loadingBar();
          cleanConsole();
          header("Determinar si un año es bisiesto");
          System.out.print("| > | Digite un año: ");
          int year = scanner.nextInt();
          if (year % 4 == 0) {
            if (year % 100 != 0 || year % 400 == 0) {
              System.out.println("|   | El año es bisiesto.");
            } else {
              System.out.println("|   | El año no es bisiesto.");
            }
          } else {
            System.out.println("|   | El año no es bisiesto.");
          }
          System.out.println("---------------------------");

          scanner.nextLine();
          scanner.nextLine();
          break;

        case 5:
          loadingBar();
          cleanConsole();
          header("Clasificar una nota");
          System.out.print("| > | Digite la nota: ");
          int nota = scanner.nextInt();

          if (nota >= 90) {
            System.out.println("|   | Calificacion: A");
          } else {
            if (nota >= 80) {
              System.out.println("|   | Calificacion: B");
            } else {
              if (nota >= 70) {
                System.out.println("|   | Calificacion: C");
              } else {
                if (nota >= 60) {
                  System.out.println("|   | Calificacion: D");
                } else {
                  System.out.println("|   | Calificacion: F");
                }
              }
            }
          }
          System.out.println("---------------------------");

          scanner.nextLine();
          scanner.nextLine();
          break;

      }
    } while (cursor != 6);
  }

  public static void ciclo_for() {
    int cursor;
    Scanner scanner = new Scanner(System.in);

    do {
      menuMain(4);
      cursor = scanner.nextInt();

      switch (cursor) {
        case 1:
          loadingBar();
          cleanConsole();
          header("Numeros del 1 al 10");
          for (int i = 1; i <= 10; i++) {
            System.out.println("|   | " + i);
          }
          System.out.println("---------------------------");

          scanner.nextLine();
          scanner.nextLine();
          break;
        case 2:
          loadingBar();
          cleanConsole();
          header("Numeros del 10 al 1");
          for (int i = 10; i >= 1; i--) {
            System.out.println("|   | " + i);
          }
          System.out.println("---------------------------");

          scanner.nextLine();
          scanner.nextLine();
          break;

        case 3:
          loadingBar();
          cleanConsole();
          header("De 2 en 2 de n al 100");
          System.out.print("| > | Digite un numero : ");
          int n = scanner.nextInt();
          for (int i = n; i <= 100; i += 2) {
            System.out.println("|   | " + i);
          }
          System.out.println("---------------------------");

          scanner.nextLine();
          scanner.nextLine();
          break;
        case 4:
          loadingBar();
          cleanConsole();
          header("Piramide");
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
          System.out.println("---------------------------");

          scanner.nextLine();
          scanner.nextLine();
          break;
        case 5:
          loadingBar();
          cleanConsole();
          header("Promedio de notas");
          double total = 0, nota;
          System.out.print("| > | Digite cantidad de notas : ");
          int cantidad = scanner.nextInt();
          for (int i = 1; i <= cantidad; i++) {
            System.out.print("| " + i + " | Digite nota : ");
            nota = scanner.nextInt();
            total += nota;
          }
          System.out.println("|   | promedio de las notas : " + (total / cantidad));
          System.out.println("---------------------------");

          scanner.nextLine();
          scanner.nextLine();
          break;
      }
    } while (cursor != 6);
  }

  public static void ciclo_while() {
    int cursor;
    Scanner scanner = new Scanner(System.in);

    do {
      menuMain(5);
      cursor = scanner.nextInt();

      switch (cursor) {
        case 1:
          loadingBar();
          cleanConsole();
          header("Suma de los primeros N numeros enteros");
          System.out.print("| > | Digite un numero N: ");
          int N = scanner.nextInt();
          int suma = 0;
          int i = 1;
          while (i <= N) {
            suma += i;
            i++;
          }
          System.out.println("|   | La suma de los primeros " + N + " numeros es: " + suma);
          System.out.println("---------------------------");

          scanner.nextLine();
          scanner.nextLine();
          break;
        case 2:
          loadingBar();
          cleanConsole();
          header("Factorial de un numero");
          System.out.print("| > | Digite un numero: ");
          int num = scanner.nextInt();
          int factorial = 1;
          int i2 = 1;
          while (i2 <= num) {
            factorial *= i2;
            i2++;
          }
          System.out.println("|   | El factorial de " + num + " es: " + factorial);
          System.out.println("---------------------------");

          scanner.nextLine();
          scanner.nextLine();
          break;
        case 3:
          loadingBar();
          cleanConsole();
          header("Contar los digitos de un numero");
          System.out.print("| > | Digite un numero: ");
          int numero = scanner.nextInt();
          int digitos = 0;
          while (numero != 0) {
            numero /= 10;
            digitos++;
          }
          System.out.println("|   | El numero tiene " + digitos + " digitos.");
          System.out.println("---------------------------");

          scanner.nextLine();
          scanner.nextLine();
          break;
        case 4:
          loadingBar();
          cleanConsole();
          header("Suma de los digitos de un numero");
          System.out.print("| > | Digite un numero: ");
          int numero2 = scanner.nextInt();
          int sumaDigitos = 0;
          while (numero2 != 0) {
            sumaDigitos += numero2 % 10;
            numero2 /= 10;
          }
          System.out.println("|   | La suma de los digitos es: " + sumaDigitos);
          System.out.println("---------------------------");

          scanner.nextLine();
          scanner.nextLine();
          break;
        case 5:
          loadingBar();
          cleanConsole();
          header("Contar numeros pares entre dos valores");
          System.out.print("| > | Digite el primer valor: ");
          int valor1 = scanner.nextInt();
          System.out.print("| > | Digite el segundo valor: ");
          int valor2 = scanner.nextInt();
          int pares = 0;
          int i5 = valor1;
          while (i5 <= valor2) {
            if (i5 % 2 == 0) {
              pares++;
            }
            i5++;
          }
          System.out.println("|   | Hay " + pares + " numeros pares entre " + valor1 + " y " + valor2);
          System.out.println("---------------------------");
          scanner.nextLine();
          scanner.nextLine();
          break;

      }
    } while (cursor != 6);
  }

  public static void cleanConsole() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }

  public static void header(String title) {
    System.out.println("---------------------------");
    System.out.print("|");
    for (int i = 0; i < (int)((25 - title.length())/2); i++) {
      System.out.print(" ");
    }
    System.out.print(title);
    for (int i = 0; i < (int)((25 - title.length())/2); i++) {
      System.out.print(" ");
    }
    System.out.println("|");
    System.out.println("---------------------------");
  }

  public static void loadingBar() {
    String spinner = "|";

    for (int i = 0; i < 20; i++) {
      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      }
      cleanConsole();
      switch (i % 4) {
        case 0:
          spinner = "|";
          break;
        case 1:
          spinner = "/";
          break;
        case 2:
          spinner = "-";
          break;
        case 3:
          spinner = "\\";
          break;
      }
      System.out.println("---------------------------");
      System.out.print("| " + spinner + " | ");
      for (int j = 0; j < 20; j++) {
        if (j < i) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println("|");
      System.out.println("---------------------------");
    }
  }

  public static void menu1(boolean selected, int droping) {

    if (!selected) {
      System.out.println("| 1 | secuenciales        |");
    } else {
      System.out.println("| * | secuenciales        |");

      System.out.println("---------------------------");
      if (droping >= 1)
        System.out.println("  + | 1 | Suma de 2 digitos");
      if (droping >= 2)
        System.out.println("  + | 2 | Hola");
      if (droping >= 3)
        System.out.println("  + | 3 | Descuento");
      if (droping >= 4)
        System.out.println("  + | 4 | Año de nacimiento");
      if (droping >= 5)
        System.out.println("  + | 5 | Porcentaje que representa");
      if (droping == 6)
        System.out.println("  + | 6 | Volver");

      System.out.println("---------------------------");
    }
  }

  public static void menu2(boolean selected, int droping) {
    if (!selected) {
      System.out.println("| 2 | condicional simple  |");
    } else {
      System.out.println("| * | condicional simple  |");

      System.out.println("---------------------------");
      if (droping >= 1)
        System.out.println("  + | 1 | Mayor de edad");
      if (droping >= 2)
        System.out.println("  + | 2 | par o impar");
      if (droping >= 3)
        System.out.println("  + | 3 | Rifa");
      if (droping >= 4)
        System.out.println("  + | 4 | Salir a pasear");
      if (droping >= 5)
        System.out.println("  + | 5 | Positivo o negativo");
      if (droping == 6)
        System.out.println("  + | 6 | Volver");

      System.out.println("---------------------------");
    }
  }

  public static void menu3(boolean selected, int droping) {
    if (!selected) {
      System.out.println("| 3 | condicional anidado |");
    } else {
      System.out.println("| * | condicional anidado |");

      System.out.println("---------------------------");
      if (droping >= 1)
        System.out.println("  + | 1 | Verificar si un numero es positivo, negativo o cero");
      if (droping >= 2)
        System.out.println("  + | 2 | Verificar si un numero esta dentro del rango 10-50");
      if (droping >= 3)
        System.out.println("  + | 3 | Determinar el mayor de tres numeros");
      if (droping >= 4)
        System.out.println("  + | 4 | Determinar si un año es bisiesto");
      if (droping >= 5)
        System.out.println("  + | 5 | Clasificar una nota");
      if (droping == 6)
        System.out.println("  + | 6 | Volver");

      System.out.println("---------------------------");
    }

  }

  public static void menu4(boolean selected, int droping) {
    if (!selected) {
      System.out.println("| 4 | ciclo for           |");
    } else {
      System.out.println("| * | ciclo for           |");

      System.out.println("---------------------------");
      if (droping >= 1)
        System.out.println("  + | 1 | Del 1 al 10");
      if (droping >= 2)
        System.out.println("  + | 2 | del 10 al 1");
      if (droping >= 3)
        System.out.println("  + | 3 | De 2 en 2 de n a 100");
      if (droping >= 4)
        System.out.println("  + | 4 | Dibujar piramide");
      if (droping >= 5)
        System.out.println("  + | 5 | Promedio de notas");
      if (droping == 6)
        System.out.println("  + | 6 | Volver");

      System.out.println("---------------------------");
    }
  }

  public static void menu5(boolean selected, int droping) {
    if (!selected) {
      System.out.println("| 5 | ciclo while         |");
    } else {
      System.out.println("| * | ciclo while         |");

      System.out.println("---------------------------");
      if (droping >= 1)
        System.out.println("  + | 1 | Suma de los primeros N numeros enteros");
      if (droping >= 2)
        System.out.println("  + | 2 | Factorial de un numero");
      if (droping >= 3)
        System.out.println("  + | 3 | Contar los digitos de un numero");
      if (droping >= 4)
        System.out.println("  + | 4 | Suma de los digitos de un numero");
      if (droping >= 5)
        System.out.println("  + | 5 | Contar numeros pares entre dos valores");
      if (droping == 6)
        System.out.println("  + | 6 | Volver");

      System.out.println("---------------------------");
    }
  }

  public static void menuMain(int selected) {
    for (int i = 1; i <= 6; i++) {

      cleanConsole();
      header(" CATALOGO DE EJERCICIOS");
      if (selected == 0) {
        System.out.println("| * | Seleccione categoria|");
      } else {
        System.out.println("|   | Seleccione categoria|");
      }
      menu1(selected == 1, i);
      menu2(selected == 2, i);
      menu3(selected == 3, i);
      menu4(selected == 4, i);
      menu5(selected == 5, i);
      System.out.println("| 6 | salir               |");
      System.out.print("| > | ");
      try {
        Thread.sleep(50);
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      }

    }

  }

  public static void application() {
    Scanner scanner = new Scanner(System.in);
    int cursor = 0;

    loadingBar();
    do {
      menuMain(0);
      cursor = scanner.nextInt();

      switch (cursor) {
        case 1:
          secuenciales();
          break;
        case 2:
          condicionales_simples();
          break;
        case 3:
          condicionales_anidados();
          break;
        case 4:
          ciclo_for();
          break;
        case 5:
          ciclo_while();
          break;
        case 6:
          System.out.println("---------------------------");
          System.out.println("|          Adios          |");
          System.out.println("---------------------------");
          break;
        default:
          System.out.println(" x Opcion no valida x");
      }

    } while (cursor != 6);

    scanner.close();

  }

  public static void main(String[] args) {
    application();
  }
}
