package variables_trabajo;

import java.util.Scanner;

public class e1_areaCirculo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        String nombre;
        double radio;
        double area;

        System.out.println("***** Calcular area de un circulo *****");
        System.out.println("> Por favor digite su nombre: ");
        nombre = scanner.next();

        System.out.println("  Hola "+nombre);

        System.out.print("> Digite radio del circulo a Calcular: ");
        radio = scanner.nextDouble();

        area = Math.PI * radio * radio;
    
        System.out.println("\n-- El ara del cirulo con radio "+radio+" es : "+area);
       
        scanner.close();

    }
}
