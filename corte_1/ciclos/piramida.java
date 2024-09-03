package ciclos;

/**
 * piramida
 */
public class piramida {

    public static void main(String[] args) {
        System.out.println("***** Piramide ******");
        for (int i = 5; i >= 1; i--) {
            for (int j = 5; j <=i; j++) {
                
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
