package ciclos;

/**
 * tablas_muliplicar
 */
public class tablas_muliplicar {

    public static void main(String[] args) {
        System.out.println("** Tablas del multiplicar **");
        for (int i = 0; i <= 10; i++) {
            System.out.println("\n  -- Tabla del "+ i+" --");
            for (int j = 0; j <= 10; j++) {
               System.out.println("    "+i+" * "+j+" = "+i*j); 
            }
        }
    }
}
