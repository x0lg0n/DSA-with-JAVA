import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
         Scanner sc =  new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findMin(arr));
        System.out.println(findMax(arr));
        System.out.println(findMaxInRange(arr, 2, 5));
        System.out.println(findMinInRange(arr, 4, 5));
        sc.close();
    }

    private static int findMin(int[] arr) {
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < ans) {
                ans = arr[i];
            }
        }
        return ans;
    }

    private static int findMax(int[] arr) {
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > ans) {
                ans = arr[i];
            }
        }
        return ans;
    }

    private static int findMaxInRange(int[] arr, int start, int end ) {
        int ans = arr[start];
        for (int i = start; i < end; i++) {
            if (arr[i] > ans) {
                ans = arr[i];
            }
        }
        return ans;
    }

    private static int findMinInRange(int[] arr, int start, int end ) {
        int ans = arr[start];
        for (int i = start; i < end; i++) {
            if (arr[i] < ans) {
                ans = arr[i];
            }
        }
        return ans;
    }


}
