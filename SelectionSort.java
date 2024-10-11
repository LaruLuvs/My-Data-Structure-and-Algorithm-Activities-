import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the elements of the array: ");
            array[i] = scanner.nextInt();
        }

        selectionSort(array);
        System.out.println("Sorted by Selection Sort: " + Arrays.toString(array));

        scanner.close();
    }
}
