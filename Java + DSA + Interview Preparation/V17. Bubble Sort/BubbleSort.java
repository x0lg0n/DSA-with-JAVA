import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 5, 8, 2, 0, 1, 6, 9, 3 };
        bubble(arr);
        System.out.println(Arrays.toString(arr));
        ;
    }

    public static void bubble(int[] arr) {
        boolean swapped;
        // outer loop for passes
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            // inner loop for comparisons
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
                swapped = true;
            }

            // If no elements were swapped, array is sorted
            if (!swapped) {
                break;
            }
        }

    }

}
