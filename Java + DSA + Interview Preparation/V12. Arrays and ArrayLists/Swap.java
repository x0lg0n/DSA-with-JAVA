import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = { 4, 8, 9, 2, 1, 45, 5 };
        System.out.println("Array before Swapping: " + Arrays.toString(arr));
        swap(arr, 1, 3);
        System.out.println("Array after Swapping: " + Arrays.toString(arr));

        System.out.println(max(arr));
        System.out.println(maxRange(arr, 0, 3));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    private static int max(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    private static int maxRange(int[] arr, int start, int end) {
        int max = arr[start];

        for (int i = start; i <= end; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    private static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
