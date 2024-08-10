import java.util.Scanner; // importar scanner
/**
 *
 * @author AlexVB
 */
public class taller_1 {
    
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Rango del tipo byte:-128 a 127");
        System.out.println("Digite un dato tipo byte:");
        byte numeroByte = scanner.nextByte();
        System.out.println("Byte ingresado: "+numeroByte);
        
        System.out.println("Rango del tipo short:-32768 a 32767");
        System.out.println("Digite un dato tipo short:");
        short numeroShort = scanner.nextShort();
        System.out.println("Short ingresado: "+numeroShort);
        
        System.out.println("Rango del tipo int:-2147483648 a 2147483647");
        System.out.println("Digite un dato tipo int:");
        int numeroInt = scanner.nextInt();
        System.out.println("Entero ingresado: "+numeroInt);
        
        System.out.println("Rango del tipo float: aproximadamente - "+
        "3.40282347E+38 a 3.40282347E+38");
        System.out.print("Digite un dato tipo float: ");
        float numeroFloat = scanner.nextFloat();
        System.out.println("Float ingresado: " + numeroFloat);
        
        System.out.println("Rango del tipo double: aproximadamente -"+
        "1.79769313486231570E+308 a 1.79769313486231570E+308");
        System.out.print("Digite un dato tipo double: ");
        double numeroDouble = scanner.nextDouble();
        System.out.println("Double ingresado: " + numeroDouble);

        System.out.println("Los booleanos abarcan solo 2 valores");
        System.out.print("Digite un dato booleano (true/false): ");
        boolean verdadero = scanner.nextBoolean();
        System.out.println("Boolean ingresado: " + verdadero);

        System.out.println("Un caracter es un unico simbolo cualquiera");
        System.out.print("Digite un dato tipo carácter: ");
        char caracter = scanner.next().charAt(0);
        System.out.println("Char ingresado: " + caracter);
        
        System.out.println("Los Strings son text compuestos de varios caracteres");
        System.out.print("Digite una cadena: ");
        String cadena = scanner.next();
        System.out.println("String ingresado: " + cadena);

        // Constantes
        final double PI = 3.14159;
        final String SALUDO = "¡Hola!";

        System.out.println("Constante PI: " + PI);
        System.out.println("Constante SALUDO: " + SALUDO);

        scanner.close();
    }
}
