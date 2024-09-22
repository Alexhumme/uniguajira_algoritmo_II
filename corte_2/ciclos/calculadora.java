package corte_2.ciclos;

import java.util.Scanner;

/**
 * calculadora
 */
public class calculadora {

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    boolean invalida = false;
    double num1, num2, resultado = 0;
    String signo;

    System.out.println("CALCULADORA");

    do {
      invalida = false;
      System.out.print("> Digite un numero: ");
      num1 = entrada.nextInt();
      System.out.print("> Digite un numero:");
      num2 = entrada.nextInt();
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
          resultado = num1 + num2;
          break;
        case "-":
          resultado = num1 - num2;
          break;
        case "/":
          if (num2==0){
            invalida = true;
            System.out.println("No se puede");
          }else{
            resultado = num1 / num2;
          }
          break;
        case "*":
          resultado = num1 * num2;
          break;
        case "X":
          System.out.println("Saliendo, Hasta la proxima¡Adios!");
          break;
        default:
          System.out.println("opcion no valida");
      }
      if (!signo.equals("X") && !invalida) System.out.println("El resultado de la operacion es:" + resultado);
    } while (!signo.equals("X"));
    entrada.close();

  }
}
