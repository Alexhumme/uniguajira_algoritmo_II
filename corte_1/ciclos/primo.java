package ciclos;

import java.util.Scanner;

/**
 * primo
 */
public class primo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, i, exactas = 0;
        System.out.println("***** Determinar si es primo *****");
        System.out.print("> Digite u numero entero positivo : ");
        num = scanner.nextInt();
        
        if (num < 0) {
            System.out.println("  x El numero debe ser positivo x");
        }
        System.out.print("  "+num+" es divisible por : ");
        for (i = 1; i <= (int)(num/2) + 1 ; i++) {
            if (num%i == 0) {
                exactas ++;
                 if (i != 1) System.out.print(", ");
                System.out.print(i);
               
            }
        }
        System.out.print(".");
        if (exactas <= 2){
            System.out.println("  Es primo");
        }else{
            System.out.println("  No es primo");
            System.out.println("  Tiene "+exactas+" divisores");
        }


        scanner.close();
    }
}
