package variables_trabajo;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 * e2_calcular_edad
 */
public class e2_calcular_edad {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        final Date fecha = new Date();
        Date fechaNacimiento;
        final SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd", Locale.ENGLISH);

        String nombre;
        String nacimiento;
        int dia, mes, anio, edad;

        System.out.println("\n***** Calcular edad *****");
        System.out.print("> Por favor digite su nombre: ");
        nombre = scanner.next();

        System.out.println("  Hola "+nombre);
        System.out.println("> Por favor digite la fecha en la que nacio : ");
        System.out.print("> Año: ");
        anio = scanner.nextInt();
        System.out.print("\033[F\033[K");
        System.out.print("> Mes: "+anio+"/");
        mes = scanner.nextInt();
        System.out.print("\033[F\033[K");
        System.out.print("> Dia: "+anio+"/"+mes+"/");
        dia = scanner.nextInt();
        
        nacimiento = anio+"-"+mes+"-"+dia;
        fechaNacimiento = formatter.parse("2000-11-11");
        edad = fecha.compareTo(fechaNacimiento);

        System.out.println("- Su edad es: "+edad);

        scanner.close();
    }
}
