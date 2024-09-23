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
 * */
public class trabajo1 {

  public static void secuenciales(){
    int cursor;
    Scanner scanner = new Scanner(System.in);

    do {
      menuMain(1);
      cursor = scanner.nextInt();
      String line;

      switch (cursor) {
        case 1: 
          loadingBar();
          cleanConsole();
          header("Suma de 2 digitos");
          double num1, num2;
          System.out.print("| > | Digite el primer valor: ");
          num1 = scanner.nextDouble();
          System.out.print("| > | Digite el segundo valor: ");
          num2 = scanner.nextDouble();

          System.out.println("|   | "+num1+" + "+num2+" = "+(num1+num2));
          System.out.println("---------------------------");
          System.out.print("| > | Digite cualquier valor para continuar: ");
          line = scanner.next();
          break;
        case 2:
          loadingBar();
          cleanConsole();
          header("Hola ");
          String nombre;
          System.out.print("| > | Digite su nombre : ");
          nombre = scanner.next();
          System.out.println("|   | Hola "+nombre+"!");
          System.out.println("---------------------------");
          System.out.print("| > | Digite cualquier valor para continuar: ");
          line = scanner.next();
          break;
        case 3: 
          loadingBar();
          cleanConsole();
          header("Descuento");
          double compra, total;
          System.out.print("| > | Digite el total de la compra : $");
          compra = scanner.nextDouble();
          total = compra - (compra * 0.25);
          System.out.println("|   | El total con un 25% de descuento es : $" +total);
          System.out.println("---------------------------");
          System.out.print("| > | Digite cualquier valor para continuar: ");
          line = scanner.next();
          break;
        case 4:
          loadingBar();
          cleanConsole();
          header("Año de nacimiento");
          int edad, agno;
          System.out.print("| > | Digite su edad actual : ");
          edad = scanner.nextInt();
          agno = 2024 - edad;
          System.out.println("|   | Naciste cerca del " +agno);
          System.out.println("---------------------------");
          System.out.print("| > | Digite cualquier valor para continuar: ");
          line = scanner.next();
          break;
        case 5:
          loadingBar();
          cleanConsole();
          header("Porcentaje que representa");
          System.out.print("| > | Digite un valor: ");
          double valor = scanner.nextDouble();
          System.out.print("| > | Digite otro: ");
          double valor2 = scanner.nextDouble();
          System.out.println("|   | "+valor2+" es el "+((valor2*100)/valor)+"% de "+valor);
          System.out.println("---------------------------");
          System.out.print("| > | Digite cualquier valor para continuar: ");
          line = scanner.next();
          break;
      }
    } while (cursor != 6);
  }
   public static void condicionales_simples(){
    int cursor;
    Scanner scanner = new Scanner(System.in);

    do {
      menuMain(2);
      cursor = scanner.nextInt();
      String line;

      switch (cursor) {
        case 1: 
          loadingBar();
          cleanConsole();
          header("Mayor de edad");
          double num1, num2;
          System.out.print("| > | Digite el primer valor: ");
          num1 = scanner.nextDouble();
          System.out.print("| > | Digite el segundo valor: ");
          num2 = scanner.nextDouble();

          System.out.println("|   | "+num1+" + "+num2+" = "+(num1+num2));
          System.out.println("---------------------------");
          System.out.print("| > | Digite cualquier valor para continuar: ");
          line = scanner.next();
          break;
        case 2:
          loadingBar();
          cleanConsole();
          header("Hola ");
          String nombre;
          System.out.print("| > | Digite su nombre : ");
          nombre = scanner.next();
          System.out.println("|   | Hola "+nombre+"!");
          System.out.println("---------------------------");
          System.out.print("| > | Digite cualquier valor para continuar: ");
          line = scanner.next();
          break;
        case 3: 
          loadingBar();
          cleanConsole();
          header("Descuento");
          double compra, total;
          System.out.print("| > | Digite el total de la compra : $");
          compra = scanner.nextDouble();
          total = compra - (compra * 0.25);
          System.out.println("|   | El total con un 25% de descuento es : $" +total);
          System.out.println("---------------------------");
          System.out.print("| > | Digite cualquier valor para continuar: ");
          line = scanner.next();
          break;
        case 4:
          loadingBar();
          cleanConsole();
          header("Año de nacimiento");
          int edad, agno;
          System.out.print("| > | Digite su edad actual : ");
          edad = scanner.nextInt();
          agno = 2024 - edad;
          System.out.println("|   | Naciste cerca del " +agno);
          System.out.println("---------------------------");
          System.out.print("| > | Digite cualquier valor para continuar: ");
          line = scanner.next();
          break;
        case 5:
          loadingBar();
          cleanConsole();
          header("Porcentaje que representa");
          System.out.print("| > | Digite un valor: ");
          double valor = scanner.nextDouble();
          System.out.print("| > | Digite otro: ");
          double valor2 = scanner.nextDouble();
          System.out.println("|   | "+valor2+" es el "+((valor2*100)/valor)+"% de "+valor);
          System.out.println("---------------------------");
          System.out.print("| > | Digite cualquier valor para continuar: ");
          line = scanner.next();
          break;
      }
    } while (cursor != 6);
  }
 
  public static void cleanConsole() {
    System.out.print("\033[H\033[2J");  
    System.out.flush();
  }
  
  public static void header(String title){
    System.out.println("---------------------------");
    System.out.println("| "+title);
    System.out.println("---------------------------");
  }

  public static void loadingBar(){
    String spinner = "|";

    for (int i = 0; i < 20; i++) {
      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      }
      cleanConsole();
      switch (i%4) {
        case 0: spinner = "|"; break;
        case 1: spinner = "/"; break;
        case 2: spinner = "-"; break;
        case 3: spinner = "\\"; break;
      }
      System.out.println("---------------------------");
      System.out.print("| "+spinner+" | ");
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
      int counter = 0;
      System.out.println("| * | secuenciales        |");
       
      System.out.println("---------------------------");
      if (droping >= 1) System.out.println("  + | 1 | Suma de 2 digitos");
      if (droping >= 2) System.out.println("  + | 2 | Hola");
      if (droping >= 3) System.out.println("  + | 3 | Descuento");
      if (droping >= 4) System.out.println("  + | 4 | Año de nacimiento");
      if (droping >= 5) System.out.println("  + | 5 | Porcentaje que representa");
      if (droping == 6) System.out.println("  + | 6 | Volver"); 
      
      System.out.println("---------------------------");
    }
  }

  public static void menu2(boolean selected, int droping) {
    
    if (!selected) {
      System.out.println("| 2 | condicional simple  |");
    } else {
      int counter = 0;
      System.out.println("| * | condicional simple  |");
       
      System.out.println("---------------------------");
      if (droping >= 1) System.out.println("  + | 1 | Mayor de edad");
      if (droping >= 2) System.out.println("  + | 2 | par o impar");
      if (droping >= 3) System.out.println("  + | 3 | Rifa");
      if (droping >= 4) System.out.println("  + | 4 | ");
      if (droping >= 5) System.out.println("  + | 5 | Porcentaje que representa");
      if (droping == 6) System.out.println("  + | 6 | Volver"); 
      
      System.out.println("---------------------------");
    }
  }

  public static void menuMain(int selected) {
    for (int i = 1; i <= 6; i++) {
      
      cleanConsole();
      System.out.println("---------------------------");
      System.out.println("| CATALOGO DE EJERCICIOS  |");
      System.out.println("---------------------------");
      if (selected == 0) 
      { System.out.println("| * | Seleccione categoria|"); }
      else  
      { System.out.println("|   | Seleccione categoria|"); }
      menu1(selected == 1, i);
      menu2(selected == 2, i);
      System.out.println("| 3 | condicional doble   |");
      System.out.println("| 4 | condicional anidado |");
      System.out.println("| 5 | ciclo for           |");
      System.out.println("| 6 | ciclo while         |");
      System.out.println("| 7 | salir               |");
      System.out.print("| > | ");
       try {
        Thread.sleep(50);
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      }

    }

  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int cursor = 0;

    loadingBar();
    do {
      menuMain(0); 
      cursor = scanner.nextInt();
     
      switch (cursor) {
        case 1: secuenciales(); break;
        case 2: condicionales_simples(); break;
        case 7:           
          System.out.println("---------------------------");
          System.out.println("|   | Adios               |");    
          System.out.println("---------------------------");
          break;
        default: 
          System.out.println(" x Opcion no valida x");
          scanner.nextLine();
      }

    } while (cursor!=7);

    scanner.close();
  }
}
