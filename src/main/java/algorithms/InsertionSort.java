package algorithms;

public class InsertionSort {
    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;

            // Переставляємо елементи, що більші за ключ, вправо
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 2, 8, 12, 1, 6, 3, 9};

        System.out.println("Масив до сортування:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        insertionSort(array);

        System.out.println("\nМасив після сортування:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
