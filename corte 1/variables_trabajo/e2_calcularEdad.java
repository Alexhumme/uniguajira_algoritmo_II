package variables_trabajo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.Calendar;

/**
 * e2_calcularEdad
 */
public class e2_calcularEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final Date fecha = new Date();
        Date fechaNacimiento = null;
        final SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);

        String nombre;
        String nacimiento;
        int dia, mes, anio, edad;

        System.out.println("\n***** Calcular edad *****");
        System.out.print("> Por favor digite su nombre: ");
        nombre = scanner.next();

        System.out.println("  Hola " + nombre);
        System.out.println("> Por favor digite la fecha en la que nació: ");
        System.out.print("> Año: ");
        anio = scanner.nextInt();
        System.out.print("\033[F\033[K");
        System.out.print("> Mes: " + anio + "/");
        mes = scanner.nextInt();
        System.out.print("\033[F\033[K");
        System.out.print("> Día: " + anio + "/" + mes + "/");
        dia = scanner.nextInt();

        nacimiento = anio + "-" + String.format("%02d", mes) + "-" + String.format("%02d", dia);
        try {
            fechaNacimiento = formatter.parse(nacimiento);
        } catch (Exception e) {
            System.out.println("Error al parsear la fecha de nacimiento.");
            scanner.close();
            return;
        }

        Calendar birthCalendar = Calendar.getInstance();
        birthCalendar.setTime(fechaNacimiento);
        Calendar currentCalendar = Calendar.getInstance();
        currentCalendar.setTime(fecha);

        edad = currentCalendar.get(Calendar.YEAR) - birthCalendar.get(Calendar.YEAR);

        if (currentCalendar.get(Calendar.MONTH) < birthCalendar.get(Calendar.MONTH) ||
            (currentCalendar.get(Calendar.MONTH) == birthCalendar.get(Calendar.MONTH) && 
             currentCalendar.get(Calendar.DAY_OF_MONTH) < birthCalendar.get(Calendar.DAY_OF_MONTH))) {
            edad--;
        }

        System.out.println("- Su edad es: " + edad);

        scanner.close();
    }
}
