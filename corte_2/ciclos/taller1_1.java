package corte_2.ciclos;

import java.util.Scanner;

/**
 * taller1_1
 */
public class taller1_1 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String user = "Alex", pasw = "1234";
    boolean error = false;
    String inputUser, inputPasw;

    System.out.println("----- INICIO DE SESION -----");

    do {
      if (error) System.out.println("\n x Usuario o contrasenña incorrectos x");
      System.out.print("\n> Digite su nombre de usuario : ");
      inputUser = scanner.next();

      System.out.print("> Digite su contrasenia : ");
      inputPasw = scanner.next();
      error = !(user.toUpperCase()
          .equals(inputUser.toUpperCase())
          ||
          !(pasw.equals(inputPasw)));

    } while (error);

    System.out.println("\n  Bienvenido " + user);

    scanner.close();
  }
}
