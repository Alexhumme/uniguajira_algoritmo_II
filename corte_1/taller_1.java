import java.util.Scanner; // importar scanner

/**
 *
 * @author AlexVB
 */
public class taller_1 {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        // ejercicios de manejo de datos
        System.out.println("----- Ejercicios -----");
        System.out.println("1. suma entero float");
        int ej1_n1;
        float ej1_n2;
        float ej1_sum;

        System.out.print("    > Digite un entero: ");
        ej1_n1 = scanner.nextInt();
        System.out.print("    > Digite un numero de punto flotante: ");
        ej1_n2 = scanner.nextFloat();

        ej1_sum = ej1_n2 + ej1_n1;

        System.out.println("    Suma : " + ej1_n1 + " + " + ej1_n2 + " = " + ej1_sum);
        System.out.println("    La suma de un entero y un flotante resulta en un flotante\n");

        System.out.println("2. suma entero byte");
        int ej2_n1;
        byte ej2_n2;
        float ej2_sum;

        System.out.print("    > Digite un entero: ");
        ej2_n1 = scanner.nextInt();
        System.out.print("    > Digite un byte: ");
        ej2_n2 = scanner.nextByte();

        ej2_sum = ej2_n2 + ej2_n1;

        System.out.println("    Suma : " + ej2_n1 + " + " + ej2_n2 + " = " + ej2_sum);
        System.out.println("    La suma de un entero y un byte puede ser un flotante\n");

        System.out.println("3. Cociente entero");
        int ej3_n1;
        int ej3_n2;
        int ej3_coc;

        System.out.print("    > Digite un entero: ");
        ej3_n1 = scanner.nextInt();
        System.out.print("    > Digite otro entero: ");
        ej3_n2 = scanner.nextInt();

        ej3_coc = ej3_n1 / ej3_n2;

        System.out.println("    Cociente entero: " + ej3_n1 + " / " + ej3_n2 + " = " + ej3_coc);
        System.out.println("    Guardar un cociente en un entero lo trunca\n");

        System.out.println("4. Concatenacion");
        Double ej4_n1;
        String ej4_s1;
        String ej4_con;

        System.out.print("    > Digite un numero: ");
        ej4_n1 = scanner.nextDouble();
        System.out.print("    > Digite otro numero (string): ");
        ej4_s1 = scanner.next();

        ej4_con = ej4_n1 + ej4_s1;

        System.out.println("    Suma de : " + ej4_n1 + " + \"" + ej4_s1 + "\" = \"" + ej4_con + "\"");
        System.out.println("    Sumar cualquier vaor con un string los concatena\n");

        System.out.println("---- rangos y ejemplos de datos ----\n");

        System.out.println("Rango del tipo byte:-128 a 127");
        System.out.print("Digite un dato tipo byte:");
        byte numeroByte = scanner.nextByte();
        System.out.println("Byte ingresado: " + numeroByte + "\n");

        System.out.println("Rango del tipo short:-32768 a 32767");
        System.out.print("Digite un dato tipo short:");
        short numeroShort = scanner.nextShort();
        System.out.println("Short ingresado: " + numeroShort + "\n");

        System.out.println("Rango del tipo int:-2147483648 a 2147483647");
        System.out.print("Digite un dato tipo int:");
        int numeroInt = scanner.nextInt();
        System.out.println("Entero ingresado: " + numeroInt + "\n");

        System.out.println("Rango del tipo float: aproximadamente - " +
                "3.40282347E+38 a 3.40282347E+38");
        System.out.print("Digite un dato tipo float: ");
        float numeroFloat = scanner.nextFloat();
        System.out.println("Float ingresado: " + numeroFloat + "\n");

        System.out.println("Rango del tipo double: aproximadamente -" +
                "1.79769313486231570E+308 a 1.79769313486231570E+308");
        System.out.print("Digite un dato tipo double: ");
        double numeroDouble = scanner.nextDouble();
        System.out.println("Double ingresado: " + numeroDouble + "\n");

        System.out.println("Los booleanos abarcan solo 2 valores");
        System.out.print("Digite un dato booleano (true/false): ");
        boolean verdadero = scanner.nextBoolean();
        System.out.println("Boolean ingresado: " + verdadero + "\n");

        System.out.println("Un caracter es un unico simbolo cualquiera");
        System.out.print("Digite un dato tipo carácter: ");
        char caracter = scanner.next().charAt(0);
        System.out.println("Char ingresado: " + caracter + "\n");

        System.out.println("Los Strings son text compuestos de varios caracteres");
        System.out.print("Digite una cadena: ");
        String cadena = scanner.next();
        System.out.println("String ingresado: " + cadena + "\n");

        // Constantes
        final double PI = 3.14159;
        final String SALUDO = "¡Hola!";

        System.out.println("Constante PI: " + PI);
        System.out.println("Constante SALUDO: " + SALUDO + "\n");

        System.out.println("----- ejemplo de uso de una Constante -----");

        double r;
        double perimetro;
        System.out.println("+ Perimetro de un circulo");
        System.out.print("    > Digite un valor numerico para el radio : ");
        r = scanner.nextDouble();

        perimetro = 2 * r * PI;

        System.out.println("    La formula del perimetro de una circunferencia es p = 2 * r * PI");
        System.out.println("    El perimetro del circulo de radio " + r + " es " + perimetro);
            
        scanner.close();
    }
}
