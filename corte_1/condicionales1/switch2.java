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
        System.out.println("  f) Calculadora de Descuentos");
        System.out.println("  g) Menú de Restaurante");
        System.out.println("  h) Juego de Adivinanzas");
        System.out.println("  i) Conversión de Notas a Palabras");
        System.out.println("  j) Pelea RPG");
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
                System.out.print("    Estacion : ");
                switch ((int) (mesEstacion / 3)) {
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
                    case 4: 
                        System.out.println("Invierno");
                    default:
                        System.out.println("Mes invalido");
                }
                break;
            case "f":
                double descuento = 0;
                System.out.println("  ** Calculadora de Descuentos **");
                System.out.print("  > Digite el valor de su compra: $");
                double compra = scanner.nextDouble();
                System.out.println("    Seleccione su tipo de cliente: ");
                System.out.println("    1. Estudiante");
                System.out.println("    2. Jubilado");
                System.out.println("    3. Trabajador");
                System.out.println("    4. Normal");
                System.out.print("    > ");
                int clientType = scanner.nextInt();
                if (clientType >= 1 && clientType <= 4) {
                    switch (clientType) {
                        case 1:
                            descuento = 35;
                            break;
                        case 2:
                            descuento = 50;
                            break;
                        case 3:
                            descuento = 65;
                            break;
                    }
                    System.out.println("\n    Recibes un descuento del " + descuento + "%");
                    System.out.println("     El valor total de tu compra es $" + (compra - (compra * descuento / 100)));
                } else {
                    System.out.println("    x tipo no valido x");
                }
                break;
            case "g":
                double pastaCost = 0;
                String pastaName = "";
                System.out.println("  ** Menú de Restaurante **");
                System.out.println("  Pastas (Seleccione): ");
                System.out.println("  1. Macarrones");
                System.out.println("  2. Risotto");
                System.out.println("  3. Penne");
                System.out.println("  4. Linguine");
                System.out.println("  5. Tortiglioni");
                System.out.print("  > ");
                int pastaNum = scanner.nextInt();
                if (pastaNum >= 1 && pastaNum <= 5) {
                    switch (pastaNum) {
                        case 1:
                            pastaName = "Macarrones";
                            pastaCost = 20000;
                            break;
                        case 2:
                            pastaName = "Rissoto";
                            pastaCost = 24000;
                            break;
                        case 3:
                            pastaName = "Penne";
                            pastaCost = 17000;
                            break;
                        case 4:
                            pastaName = "Linguine";
                            pastaCost = 30000;
                            break;
                        case 5:
                            pastaName = "Tortiglioni";
                            pastaCost = 23000;
                            break;
                        default:
                            System.out.println("    x Opcion no valida x");
                    }
                    System.out.println("    " + pastaName + " : $" + pastaCost);
                } else {
                    System.out.println("    x opcion no valida x");
                }

                break;
            case "h":
                String preg = "";
                String resp = "";
                String userResp;
                System.out.println("  ** Juego de Adivinanzas **");
                System.out.print("  > Seleccione un numero del 1 al 3: ");
                int adiv = scanner.nextInt();
                if (adiv >= 1 && adiv <= 3) {
                    switch (adiv) {
                        case 1:
                            preg = "Tengo raices que no tocan el suelo, aveces me cubren y aveces nievo, soy el...";
                            resp = "cabello";
                            break;
                        case 2:
                            preg = "El tiempo si ti es...";
                            resp = "empo";
                            break;
                        case 3:
                            preg = "Estoy desde el inicio del tiempo, dentro de cada tesoro, en medio de la cortina y en la cola del toro, soy la...";
                            resp = "t";
                            break;
                        default:
                            System.out.println("    x opcion no valida x");
                    }
                    System.out.println("\n    " + preg);
                    System.out.print("    > ");
                    userResp = scanner.next();
                    if (resp.equals(userResp)) {
                        System.out.println("\n    ¡Respuesta correcta!");
                    } else {
                        System.out.println("\n    Respuesta incorrecta :(");
                    }
                } else {
                    System.out.println("  x opcion no valida x");
                }
                break;
            case "i":
                System.out.println("  ** Conversión de Notas a Palabras **");
                System.out.print("  > Digite su nota (del 1 al 5): ");
                double nota1 = scanner.nextDouble();
                String calificacion = "";
                if (nota1 >= 0 || nota1 <= 5) {
                    switch ((int) (nota1)) {
                        case 0:
                            calificacion = "Muy mal";
                            break;
                        case 1:
                            calificacion = "Mal";
                            break;
                        case 2:
                            calificacion = "Regular";
                            break;
                        case 3:
                            calificacion = "Bien";
                            break;
                        case 4:
                            calificacion = "Muy bien";
                            break;
                        case 5:
                            calificacion = "Excelente";
                            break;
                    }
                    System.out.println("    Calificacion de tu nota : " + calificacion);
                } else {
                    System.out.println("    Nota no valida");
                }
                break;
            case "j":
                Boolean end = false;

                String arma = "puños";
                int atk = 2, hp = 20, ehp = 30, eatk = 10;

                String item1 = "espada", item2 = "lanza", item3 = "hacha";

                System.out.println("  ** Pelea en un RPG **");
                System.out.println("  Te encuentras con un troll agresivo");
                System.out.println("  Selecciona tu arma");
                System.out.println("  1. " + item1);
                System.out.println("  2. " + item2);
                System.out.println("  3. " + item3);
                System.out.print("  > ");
                opt = scanner.next();
                switch (opt) {
                    case "1":
                        arma = item1;
                        atk = 10;
                        break;
                    case "2":
                        arma = item2;
                        atk = 5;
                        break;
                    case "3":
                        arma = item3;
                        atk = 15;
                        break;
                    default:
                        break;
                }
                System.out.println("\n    ¡pelearas con " + arma + "!");
                while (!end) {

                    end = hp <= 0 || ehp <= 0;

                    if (!end) {
                        System.out.println("\n    Que deseas hacer? (" + hp + "/20)hp vs (" + ehp + "/30)ehp");
                        System.out.println("    1. Atacar");
                        System.out.println("    2. Hablar");
                        System.out.println("    3. Huir");
                        System.out.print("    > ");
                        opt = scanner.next();
                        System.out.println("");

                        switch (opt) {
                            case "1":
                                System.out.println("    - Atacas al troll");
                                System.out.println("      + El troll pierde " + atk + " de hp");
                                ehp = ehp - atk;
                                if (ehp > 0) {
                                    System.out.println("    - El troll contraataca");
                                    System.out.println("      + Pierdes " + eatk + " de hp");
                                    hp = hp - eatk;
                                }
                                break;
                            case "2":
                                System.out.println("    - Intentas hablar con el troll");
                                if (Math.random() > 0.65) {
                                    System.out.println("      + El troll y tu se hicieron amigos!");
                                    end = true;
                                } else {
                                    System.out.println("      + El troll te ignora");
                                    System.out.println("    - El troll te ataca");
                                    System.out.println("      + Pierdes " + eatk + " de hp");
                                    hp = hp - eatk;
                                }
                                break;
                            case "3":
                                System.out.println("    - Huyes !");
                                end = true;
                                break;
                            default:
                                System.out.println("    - No haces nada");
                                System.out.println("    - El troll te ataca");
                                System.out.println("      + Pierdes " + eatk + " de hp");
                                hp = hp - eatk;
                        }

                    }
                }
                if (hp <= 0) {
                    System.out.println("      + Has muerto.");
                } else {
                    if (ehp <= 0) {
                        System.out.println("      + Has vencido");
                    }
                    System.out.println("      + Puedes continuar con tu aventura...");
                }
                break;
            default:
                System.out.println("  x Opcion no valida x");
        }

        System.out.println("\n~~Adios~~");
        scanner.close();
    }
}
