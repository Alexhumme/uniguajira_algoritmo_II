package ciclos;

/**
 * ciclo_for
 */
public class ciclo_for {

    public static void main(String[] args) {
        System.out.println("** conteo simple **");
        for (int i = 5*100; i >=1; i-=5) {
            System.out.println("Numero : "+i);
        }

        System.out.println("\n** Suma y promedio de los pares del 1 al 15 **");
        int suma = 0;
        for (int i = 0; i <= 15; i+=2) {
            suma += i;
        }
        System.out.println("  La suma de los pares es : "+suma);
        System.out.println("  El promedio de los pares es : "+suma/7);
        
    }
}
