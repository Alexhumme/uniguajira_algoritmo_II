package sem_III.corte_2;

public class MedianaDosArregos {
    public static int[] concatArrays(int a[], int b[]) {
        int[] array = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            array[i] = a[i];
        }
        for (int i = a.length; i < array.length; i++) {
            array[i] = b[i - a.length];
        }
        return array;
    }

    public static int[] sortArray(int[] array) {
        int n = array.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // Intercambiar
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    swapped = true;
                }
            }

            // Si no hubo intercambios, el arreglo ya está ordenado
            if (!swapped)
                break;
        }
        return array;
    }

    public static double medianOf2(int a[], int b[]) {
        // Your Code Here
        int[] array = concatArrays(a, b);
        int[] sortedArray = sortArray(array);
        if (sortedArray.length % 2 != 0) {
            return sortedArray[((int) (sortedArray.length / 2))];
        } else {
            return ((double) (sortedArray[(sortedArray.length / 2) - 1] + (double) sortedArray[sortedArray.length / 2])
                    / 2);
        }
    }

    public static void main(String[] args) {
        int[] a = new int[] { 6, 4, 1 };
        int[] b = new int[] { 3, 2, 5 };

        System.out.println(medianOf2(a, b));
    }
}
