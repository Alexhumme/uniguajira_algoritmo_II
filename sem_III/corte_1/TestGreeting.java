package sem_III.corte_1;
import java.util.Scanner;

/**
 * TestGreeting
 */
public class TestGreeting {
  public static void main(String args[]) {
    Greeting g = new Greeting();
    Scanner read = new Scanner(System.in);
    String p = "matrix";
    System.out.println(0.1+0.2);
    g.greet();
    g.greet("Alex");
    System.out.println("g = "+g);
    System.out.print("Digite un entero: ");
    int x = read.nextInt();
    System.out.println("Su doble es :"+g.doubleNumber(x));
  }
}

