package corte_2.ciclos;

import java.util.Scanner;

/**
 * taller1_1
 */
public class taller1_1 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String user = "Alex", pasw = "1234";
    String inputUser, inputPasw;

    System.out.println("----- INICIO DE SESION -----" );
    
          System.out.print("> Digite su nombre de usuario : "   );
      inputUser = scanner.next();

      System.out.print("> Digite su contrasenia : " );
      inputPasw = scanner.next();
    do {
      System.out.println("\n x usuario o contrasenia incorrectos x" );
      System.out.print("\n> Digite su nombre de usuario : "   );
      inputUser = scanner.next();

      System.out.print("> Digite su contrasenia : " );
      inputPasw = scanner.next();
    } while (
        !(user.toUpperCase()
        .equals(inputUser.toUpperCase())
        &&
        !(pasw.equals(inputPasw)))
    );


    scanner.close();
  }
}
