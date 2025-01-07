package EX7_6;


import java.util.Arrays;

public class Pibot {

    public static int array[] = {5, 2, 4, 3, 1, 7, 9, 8};

    public static void main(String[] args) {
        System.out.println("Lista desordenada");
        System.out.println(Arrays.toString(array));
        quicksort(array, 0, array.length - 1);
        System.out.println("Lista ordenada");
        System.out.println(Arrays.toString(array));
    }
    private static int particio(int[] array, int esquerra, int dreta) {
        int pivot = array[dreta];
        int i = esquerra - 1;
        for (int j = esquerra; j < dreta; j++) {
            if (array[j] <= pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[dreta];
        array[dreta] = temp;
        return i + 1;
    }
    public static void quicksort(int[] array, int esquerra, int dreta) {
        if (esquerra < dreta) {
            int pivotIndex = particio(array, esquerra, dreta);
            quicksort(array, esquerra, pivotIndex - 1);
            quicksort(array, pivotIndex + 1, dreta);
        }
    }
}