package corte_2.funciones;

import java.util.Scanner;

public class ejemplo {

  public static void main(String[] args) {
    menu();    
  }

  public static void menu(){
    Scanner scanner = new Scanner(System.in);
    boolean salir = false;

    while (!salir) {
      // Mostrar el menú
      System.out.println("\n--- Calculadora Básica ---");
      System.out.println("1. Sumar");
      System.out.println("2. Restar");
      System.out.println("3. Multiplicar");
      System.out.println("4. Dividir");
      System.out.println("5. Salir");
      System.out.print("Elige una opción: ");
      
      int opcion = scanner.nextInt();

      switch (opcion) {
        case 1:
          realizarSuma();
          break;
        case 2:
          realizarResta();
          break;
        case 3:
          realizarMultiplicacion();
          break;
        case 4:
          realizarDivision();
          break;
        case 5:
          salir = true;
          System.out.println("Saliendo del programa...");
          break;
        default:
          System.out.println("Opción no válida. Por favor, elige una opción correcta.");
          break;
      }
    }

    scanner.close(); // Cerramos el scanner al final

  }

  // Función para realizar la suma
  public static void realizarSuma() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Introduce el primer número: ");
    double num1 = scanner.nextDouble();
    System.out.print("Introduce el segundo número: ");
    double num2 = scanner.nextDouble();
    double resultado = sumar(num1, num2);
    System.out.println("Resultado de la suma: " + resultado);
  }

  // Función para realizar la resta
  public static void realizarResta() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Introduce el primer número: ");
    double num1 = scanner.nextDouble();
    System.out.print("Introduce el segundo número: ");
    double num2 = scanner.nextDouble();
    double resultado = restar(num1, num2);
    System.out.println("Resultado de la resta: " + resultado);
  }

  // Función para realizar la multiplicación
  public static void realizarMultiplicacion() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Introduce el primer número: ");
    double num1 = scanner.nextDouble();
    System.out.print("Introduce el segundo número: ");
    double num2 = scanner.nextDouble();
    double resultado = multiplicar(num1, num2);
    System.out.println("Resultado de la multiplicación: " + resultado);
  }

  // Función para realizar la división
  public static void realizarDivision() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Introduce el primer número: ");
    double num1 = scanner.nextDouble();
    System.out.print("Introduce el segundo número: ");
    double num2 = scanner.nextDouble();
    if (num2 != 0) {
      double resultado = dividir(num1, num2);
      System.out.println("Resultado de la división: " + resultado);
    } else {
      System.out.println("Error: No se puede dividir por cero.");
    }
  }

  // Función para sumar dos números
  public static double sumar(double a, double b) {
    return a + b;
  }

  // Función para restar dos números
  public static double restar(double a, double b) {
    return a - b;
  }

  // Función para multiplicar dos números
  public static double multiplicar(double a, double b) {
    return a * b;
  }

  // Función para dividir dos números
  public static double dividir(double a, double b) {
    return a / b;
  }
}
