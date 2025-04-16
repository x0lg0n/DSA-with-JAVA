import java.util.*;

public class Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int n = sc.nextInt();
        System.out.println(n);
        int i = arr.length;
        System.out.println(reverse(arr, 0, i-1));

        sc.close();

    }

    // Printing name using recursion
    static void recursion(int i, int n) {
        if (i > n)
            return;
        System.out.println("DAMN!");
        recursion(i + 1, n);
    }
    // Time Complexity: O(N)
    // Space Complexity: O(1)

    // Printing 1 to N using recursion
    static void print(int i, int n) {
        if (i > n)
            return;
        System.out.println(i);
        print(i + 1, n);

    }
    // Time Complexity: O(N)
    // Space Complexity: O(N)

    // Printing N to 1 using recursion
    static int reverse(int n) {
        if (n == 0)
            return 0;
        System.out.println(n);
        return reverse(n - 1);
    }
    // Time Complexity: O(N)
    // Space Complexity: O(N)

    // Sum of N numbers using recursion
    static int sum(int n) {
        if (n == 0)
            return 0;
        return n + (sum(n - 1));
    }// Time Complexity: O(N)
     // Space Complexity: O(N)

    // Factoria of N numbers
    static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    // Time Complexity: O(N)
    // Space Complexity: O(N)

    // Reverse an array
    static int reverse(int arr[], int start, int end) {
        if (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        return reverse(arr, start + 1, end - 1);
    }
    // Time Complexity: O(N)
    // Space Complexity: O(1)

    // Paindrome or not
    static boolean palindrome(int i, String s) {
        if (i >= s.length() / 2)
            return true;
        if (s.charAt(i) != s.charAt(s.length() - i - 1))
            return false;
        return palindrome(i + 1, s);

    }
    // Time Complexity: O(N) , O(N/2)
    // Space Complexity: O(N)

    // Fibonacci series using recursion
    static int fibonacci(int N) {
        if (N <= 1) {
            return N;
        }
        int last = fibonacci(N - 1);
        int slast = fibonacci(N - 2);
        return last + slast;
    }
    // Time Complexity: O(2^N)
    // Space Complexity: O(N)
}
