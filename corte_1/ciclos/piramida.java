package ciclos;

/**
 * piramida
 */
public class piramida {

    public static void main(String[] args) {
        System.out.println("***** Piramide ******");
        System.out.println("");
        for (int i = 1; i <= 5; i++) {
            System.out.print("     ");
            for (int j = 1; j<=5; j++) {
                if (j>=i) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
