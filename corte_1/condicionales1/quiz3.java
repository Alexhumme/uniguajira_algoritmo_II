// usando el switch y el case hacer una calculadora:
// suma, resta, prodcuto, division
// input : numero, opt operacion (+,-, *, /)
// input : numero2

package condicionales1;

import java.util.Scanner;

/**
 * quiz3
 */
public class quiz3 {

    public static void main(String[] args) {
        double n1, n2;
        String resultado;
        String opt, op = "";
        Scanner scanner = new Scanner(System.in);

        System.out.println("***** Calculadora breve *****");
        System.out.println("\n ______________");
        System.out.println("| 0");
        System.out.println("+==============+");
        System.out.print("| numero > ");
        n1 = scanner.nextDouble();
        op = op + n1;
        System.out.println("\n ______________");
        System.out.println("| "+op);
        System.out.println("+==============+");
        System.out.print("| (+, -, *, /) > ");
        opt = scanner.next();
        op = op+" "+opt+" ";
        System.out.println("\n ______________");
        System.out.println("| "+op);
        System.out.println("+==============+");
        System.out.print("| numero > ");
        n2 = scanner.nextDouble();
        op = op + n2;

        switch (opt) {
            case "+": resultado = "" + (n1 + n2); break;
            case "-": resultado = "" + (n1 - n2); break;
            case "*": resultado = "" + (n1 * n2); break;
            case "/": resultado = "" + (n1 / n2); break;
            default: resultado = "ERROR";
        }
        System.out.println("\n ______________");
        System.out.println("| "+op);
        System.out.println("+==============+");
        System.out.println("| resultado = "+ resultado);

        scanner.close();
    }
}
