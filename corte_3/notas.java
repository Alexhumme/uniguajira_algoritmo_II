package corte_3;

import java.util.Scanner;

/**
 * notas
 */
public class notas {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("----- Nota para salvar -----");
    System.out.print("> Digite la primera nota : ");
    double nota1 = scanner.nextDouble();
    double nota1_p = nota1 * 0.3;
    System.out.println("n1p: "+nota1_p);
    System.out.print("> ingrese la segunda nota : ");
    double nota2= scanner.nextDouble();
    double nota2_p = nota2 * 0.35;
    System.out.println("n2p: "+nota2_p);

    System.out.println("nota que llevas: "+(nota1_p+nota2_p)+"/5");

    double nota3_p = 3 - (nota1_p+nota2_p);
    double nota3 = nota3_p / 0.35; 

    System.out.println("Te falta "+nota3+" para sacar 3.");

  }
}
