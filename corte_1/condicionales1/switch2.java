package condicionales1;

import java.util.Scanner;

/**
 * switch2
 */
public class switch2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String opt;
        System.out.println("  ***** CONDICIONALES 2.0 *****");
        System.out.println("Seleccione el ejercicio que quiere ejecutar\n");
        System.out.println("  a) Dias de la semana");
        System.out.println("  b) Meses del año");
        System.out.println("  c) Calculadora basica");
        System.out.println("  d) Clasificacion de calificacion");
        System.out.println("  e) Estaciones del año");
        System.out.print("  > ");
        opt = scanner.next();

        switch (opt.toLowerCase()) {
            case "a":
                System.out.println("  ** Dias de la semana **");
                System.out.print("  > Digite un numero del 1 al 7: ");
                int dia = scanner.nextInt();
                System.out.print("    Dia : ");
                switch (dia) {
                    case 1:
                        System.out.println("Lunes");
                        break;
                    case 2:
                        System.out.println("Martes");
                        break;
                    case 3:
                        System.out.println("Miercoles");
                        break;
                    case 4:
                        System.out.println("Jueves");
                        break;
                    case 5:
                        System.out.println("Viernes");
                        break;
                    case 6:
                        System.out.println("Sabado");
                        break;
                    case 7:
                        System.out.println("Domingo");
                        break;
                    default:
                        System.out.println("x Dia no valido x");
                }
                break;

            case "b":
                System.out.println("  ** Meses del año **");
                System.out.print("  > Digite un numero del 1 al 12: ");
                int mes = scanner.nextInt();
                System.out.print("    Mes : ");
                switch (mes) {
                    case 1:
                        System.out.println("Enero");
                        break;
                    case 2:
                        System.out.println("Febrero");
                        break;
                    case 3:
                        System.out.println("Marzo");
                        break;
                    case 4:
                        System.out.println("Abril");
                        break;
                    case 5:
                        System.out.println("Mayo");
                        break;
                    case 6:
                        System.out.println("Junio");
                        break;
                    case 7:
                        System.out.println("Julio");
                        break;
                    case 8:
                        System.out.println("Agosto");
                        break;
                    case 9:
                        System.out.println("Septiembre");
                        break;
                    case 10:
                        System.out.println("Octubre");
                        break;
                    case 11:
                        System.out.println("Noviembre");
                        break;
                    case 12:
                        System.out.println("Diciembre");
                        break;
                    default:
                        System.out.println("x Mes no valido x");
                }
                break;

            case "c":
                System.out.println("  ** Calculadora basica **");

                double n1, n2 = 0;
                String resultado;
                String operator, op = "";

                System.out.println("\n ______________");
                System.out.println("| 0");
                System.out.println("+==============+");
                System.out.print("| numero > ");
                n1 = scanner.nextDouble();
                op = op + n1;

                System.out.println("\n ______________");
                System.out.println("| " + op);
                System.out.println("+==============+");
                System.out.print("| (+, -, *, /) > ");
                operator = scanner.next();

                if (operator.equals("+") ||
                        operator.equals("-") ||
                        operator.equals("*") ||
                        operator.equals("/")) {
                    op = op + " " + operator + " ";
                    System.out.println("\n ______________");
                    System.out.println("| " + op);
                    System.out.println("+==============+");
                    System.out.print("| numero > ");
                    n2 = scanner.nextDouble();
                    op = op + n2;
                }

                switch (operator) {
                    case "+":
                        resultado = "" + (n1 + n2);
                        break;
                    case "-":
                        resultado = "" + (n1 - n2);
                        break;
                    case "*":
                        resultado = "" + (n1 * n2);
                        break;
                    case "/":
                        if (n2 != 0) {
                            resultado = "" + (n1 / n2);
                        } else {
                            op = " operacion no valida";
                            resultado = "ERROR";
                        }
                        break;
                    default:
                        op = " operacion no valida";
                        resultado = "ERROR";
                }
                System.out.println("\n ______________");
                System.out.println("| " + op + " = " + resultado);
                System.out.println("+==============+");

                break;
            case "d":
                System.out.println("  ** Clasificacion de clasificaciones **");
                System.out.print("    > Digite la calificacion (del 0 al 5): ");
                double nota = scanner.nextDouble();
                System.out.print("    Calificacion: ");
                if (nota <= 5) {
                    switch (((int) Math.floor(nota))) {
                        case 0:
                            System.out.println("F");
                            break;
                        case 1:
                            System.out.println("E");
                            break;
                        case 2:
                            System.out.println("D");
                            break;
                        case 3:
                            System.out.println("C");
                            break;
                        case 4:
                            System.out.println("B");
                            break;
                        case 5:
                            System.out.println("A");
                            break;
                        default:
                            System.out.println("Invalida");
                    }
                } else {
                    System.out.println("Invalida");
                }

                break;
            case "e":
                System.out.println("  ** Estaciones del año **");
                System.out.print("    > Digite un numero de mes (del 1 al 12): ");
                int mesEstacion = scanner.nextInt();
                System.out.print("    Mes : ");
                switch ((int) (mesEstacion / 4)) {
                    case 0:
                        System.out.println("Primavera");
                        break;
                    case 1:
                        System.out.println("Verano");
                        break;
                    case 2:
                        System.out.println("Otoño");
                        break;
                    case 3: 
                        System.out.println("Invierno");
                        break;
                    default: System.out.println("Mes invalido");
                }
                break;
            default:
                System.out.println("  x Opcion no valida x");
        }

        System.out.println("\n~~Adios~~");
        scanner.close();
    }
}
