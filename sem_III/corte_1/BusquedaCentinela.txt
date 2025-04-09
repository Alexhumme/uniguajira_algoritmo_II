import java.util.Random;
import java.util.Scanner;

// clase principal
public class BusquedaCentinela {

    // vector del ejercicio
    private static int[] vector = new int[50];

    public static void main(String[] args) {

        // inicializar objetos y variables
        VectorMethods methods = new VectorMethods();
        int query;
        Scanner scanner = new Scanner(System.in);

        // llenar el vector
        methods.fillVector(vector);

        // pedir valor a buscar
        System.out.println("\n-- Sistema de busqueda por centinela --");
        System.out.println("\n Vector actual:");
        methods.showVector(vector);
        System.out.print("\n> Digite el valor que desea encontrar en el vector: ");
        query = scanner.nextInt();

        // encontrar valor
        methods.findInVector(vector, query);

        scanner.close();

    }
}

class VectorMethods {
    public void fillVector(int[] vector) {

        Random rand = new Random();
        int randint;
        boolean containsInt;

        for (int i = 0; i < vector.length; i++) {
            do {
                containsInt = false;

                randint = rand.nextInt(1000);
                for (int j = 0; j < i; j++) {

                    if (vector[j] == randint) {
                        containsInt = true;
                        break;
                    }

                }
            } while (containsInt);

            vector[i] = randint;
        }

    }

    public void showVector(int[] vector) {
        System.out.print("[");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i]);
            if (i < vector.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    // algoritmo de busqueda centinela adaptado a java
    public void findInVector(int[] vector, int query) {
        int i = 0; // empieza a contar desde el 0
        int n = vector.length;

        // en java es imposible asignar un valor en vector[n + 1]
        // por lo que resulta necesario poner la condicion i < n
        while (i < n && vector[i] != query) {
            i++;
        }
        if (i == n) {
            System.out.println("  Ese valor no se encuentra en el vector\n");
        } else {
            System.out.println("  El valor " + query + " se encuentra en la posicion " + i + "\n");
        }
    }
}