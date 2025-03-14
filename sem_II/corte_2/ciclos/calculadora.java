package corte_2.ciclos;

import java.util.Scanner;
import java.util.function.Function;

/**
 * calculadora
 */
public class calculadora {

  public static double leer_numero(Scanner entrada) {
    double num;
    System.out.print("> Digite un numero: ");
    num = entrada.nextInt();
    return num;
  }

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    boolean invalida = false;
    double num1, num2, resultado = 0;
    String signo;

    System.out.println("CALCULADORA");

    do {
      invalida = false;

      System.out.println("Digite signo de operacion");
      System.out.println("+) suma");
      System.out.println("-) resta");
      System.out.println("/) division ");
      System.out.println("*) multiplicacion");
      System.out.println("X) salir");
      System.out.print("> ");
      signo = entrada.next();
      switch (signo) {
        case "+":
          num1 = leer_numero(entrada);
          num2 = leer_numero(entrada);
          resultado = num1 + num2;
          break;
        case "-":
          num1 = leer_numero(entrada);
          num2 = leer_numero(entrada);
          resultado = num1 - num2;
          break;
        case "/":
          num1 = leer_numero(entrada);
          num2 = leer_numero(entrada);
          if (num2 == 0) {
            invalida = true;
            System.out.println("No se puede");
          } else {
            resultado = num1 / num2;
          }
          break;
        case "*":
          num1 = leer_numero(entrada);
          num2 = leer_numero(entrada);
          resultado = num1 * num2;
          break;
        case "X":
          System.out.println("Saliendo, Hasta la proxima¡Adios!");
          break;
        default:
          System.out.println("opcion no valida");
      }
      if (!signo.equals("X") && !invalida)
        System.out.println("El resultado de la operacion es:" + resultado);
    } while (!signo.equals("X"));
    entrada.close();

  }
}
