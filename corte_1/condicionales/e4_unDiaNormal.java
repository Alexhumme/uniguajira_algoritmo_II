package condicionales;

import java.util.Scanner;

/**
 * e4_unDiaNormal
 */
public class e4_unDiaNormal {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String nombre, opt;

        System.out.println("\n***** Un día normal *****");
        System.out.print("> Por favor digite su nombre: ");
        nombre = scanner.next();

        System.out.println("  Hola " + nombre);
        System.out.println("> Te levantas una mañana y decides... ");
        System.out.println("  a) Ir a trotar");
        System.out.println("  b) Desayunar");
        System.out.println("  Cualquier tecla) Volver a dormir");
        System.out.print("  >  ");
        opt = scanner.next();

        if (opt.equals("a")) {
            System.out.println("  Decides ir a trotar.");
            System.out.println("  a) Corres por 30 minutos");
            System.out.println("  b) Corres por 1 hora");
            System.out.print("  >  ");
            opt = scanner.next();

            if (opt.equals("a")) {
                System.out.println("  Te sientes con energía después de trotar.");
                System.out.println("  a) Desayunas después de trotar");
                System.out.println("  b) Te das una ducha");
                System.out.print("  >  ");
                opt = scanner.next();

                if (opt.equals("a")) {
                    System.out.println("  Disfrutas un buen desayuno.");
                } else if (opt.equals("b")) {
                    System.out.println("  Te das una ducha y te sientes renovado.");
                }
            } else if (opt.equals("b")) {
                System.out.println("  Corres por una hora y te sientes exhausto.");
                System.out.println("  a) Te das una ducha");
                System.out.println("  b) Te tomas una siesta");
                System.out.print("  >  ");
                opt = scanner.next();

                if (opt.equals("a")) {
                    System.out.println("  Te das una ducha y luego decides descansar.");
                } else if (opt.equals("b")) {
                    System.out.println("  Te tomas una siesta.");
                }
            }
        } else if (opt.equals("b")) {
            System.out.println("  Decides desayunar.");
            System.out.println("  a) Desayunas algo ligero");
            System.out.println("  b) Desayunas un gran banquete");
            System.out.print("  >  ");
            opt = scanner.next();

            if (opt.equals("a")) {
                System.out.println("  Después del desayuno ligero, decides descansar.");
            } else if (opt.equals("b")) {
                System.out.println("  El gran banquete te deja somnoliento y decides descansar.");
            }
        } 

        System.out.println("  Te fuiste a dormir.");
        scanner.close();
    }
}

