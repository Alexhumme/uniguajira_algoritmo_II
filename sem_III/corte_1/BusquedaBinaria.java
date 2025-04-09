import java.util.Random;
import java.util.Scanner;

public class BusquedaBinaria {
    public static void bubbleSort(int[] array, int tope) {
        for (int i = 0; i < tope - 1; i++) {
            for (int j = 0; j < tope - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void llenarArreglo(int[] array, int tope) {
        Random rand = new Random();
        for (int i = 0; i < tope; i++) {
            int num;
            boolean repetido;
            do {
                num = rand.nextInt(200);
                repetido = false;
                for (int j = 0; j < i; j++) {
                    if (array[j] == num) {
                        repetido = true;
                        break;
                    }
                }
            } while (repetido);
            array[i] = num;
        }
    }

    public static int busquedaBinaria(int[] array, int consulta, int tope) {
        int bajo = 0, alto = tope - 1;
        while (bajo <= alto) {
            int central = (bajo + alto) / 2;
            if (array[central] == consulta) {
                return central;
            } else if (consulta < array[central]) {
                alto = central - 1;
            } else {
                bajo = central + 1;
            }
        }
        return -1;
    }

    public static void mostrarArreglo(int[] array, int tope) {
        System.out.print("[");
        for (int i = 0; i < tope; i++) {
            System.out.print(array[i]);
            if (i < tope - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tope = 50;
        int[] nums = new int[tope];

        System.out.println("[ ALGORITMO DE ORDENAMIENTO Y BUSQUEDA ]");
        System.out.println("- Generando arreglo...");

        llenarArreglo(nums, tope);

        System.out.println("+ Arreglo completado: ");
        mostrarArreglo(nums, tope);

        System.out.println("- Organizando arreglo...");
        bubbleSort(nums, tope);

        System.out.println("+ Arreglo organizado: ");
        mostrarArreglo(nums, tope);

        System.out.print("- Digite el valor que desea consultar: ");
        int num = scanner.nextInt();

        int posicion = busquedaBinaria(nums, num, tope);
        if (posicion >= 0) {
            System.out.println("+ El valor buscado está en la posición: " + posicion);
        } else {
            System.out.println("+ No se encontró el valor");
        }

        scanner.close();
    }
}
