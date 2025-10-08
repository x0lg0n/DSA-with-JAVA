import java.util.Scanner;

public class RotatedBinarSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr =  new int[10];

        for (int i = 0; i < arr.length; i++) {
           arr[i] = sc.nextInt(); 
        }

        System.out.println(binarySearch(arr, 0, arr.length, 7));
        sc.close();
    }

    static int binarySearch(int[] arr, int s, int e, int t) {
        if (s > e) {
            return -1;
        }

        int m = s + (e - s) / 2;

        if (arr[m] == t) {
            return m;
        }

        if (arr[s] <= arr[m]) {
            if (t >= arr[s] && t <= arr[m]) {
                return binarySearch(arr, s, m - 1, t);
            } else {
                return binarySearch(arr, m + 1, e, t);
            }
        }

        if (t >= arr[m] && t <= arr[e]) {
            return binarySearch(arr, m + 1, e, t);
        } else {
            return binarySearch(arr, s, m - 1, t);
        }
    }
}
