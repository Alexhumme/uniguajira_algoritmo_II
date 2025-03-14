package corte_2.funciones;

import java.util.Scanner;

/**
 * calculadora
 */
public class calculadora {

  public static String read(String title) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("| Digite " + title + " > ");
    return scanner.next();
  }

  public static void menu(String operacion) {
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println("-------------------------");
    System.out.println("|      CALCULADORA      |");
    System.out.println("|-----------------------|");
    System.out.println("| + | - | / | x = salir |");
    System.out.println("-------------------------");
    System.out.print("|"+operacion);
    for (int i = 0; i < 23 - operacion.length(); i++) {
    System.out.print(" ");
    }
    System.out.println("|");

  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double num1, num2, r=0;
    String input, signo, operacion;

    do {
      operacion = " ";
      menu(operacion);
      input = read("numero");
      if (input.equals("x")) break;
      num1 = Double.parseDouble(input);
      operacion += ""+num1;

      menu(operacion);
      input = read("signo");
      if (input.equals("x")) break;
      signo = input;
      if (
          signo.equals("+") || 
          signo.equals("-") ||
          signo.equals("/") ||
          signo.equals("*")
         ){
      operacion += " "+signo+" ";
      
      menu(operacion);
      input = read("otro numero");
      if (input.equals("x")) break;
      operacion += input;
      num2 = Double.parseDouble(input);
      if (signo.equals("/") && num2 == 0){
        operacion = "Error: division entre 0";
      }else{
        switch (signo) {
          case "+": r = num1 + num2; break;
          case "-": r = num1 - num2; break;
          case "*": r = num1 * num2; break;
          case "/": r = num1 / num2; break; 
        }
        operacion += " = "+r; 
      }

      }else{ operacion = "Operador no valido" ;}

      menu(operacion);
      System.out.println("-------------------------");
      scanner.nextLine();

    } while (!input.equals("x"));
    System.out.println("-------------------------");
    System.out.println("|         Adios         |");
    System.out.println("-------------------------");
  }
}
