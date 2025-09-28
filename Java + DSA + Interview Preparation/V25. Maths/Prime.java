import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        boolean[] prime = new boolean[n + 1];
        steve(n, prime);

        System.out.println(checkPrimeOrNot(n));

        sc.close();
    }

    public static boolean checkPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean checkPrimeOrNot(int n) {
        int c  = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }

        return true;
    }

    public static void steve(int n, boolean[] prime) {
        for (int i = 2; i * i <= n ; i++) {
            if (!prime[i]) {
                for (int j = i * 2; j <= n; j += i) {
                    prime[j] = true;
                }
            }
        }

        // print all prime numbers
        for (int i = 2; i <= n; i++) {
            if (!prime[i]) {
                System.out.print(i + " ");
            }
        }

        // Time and Space Complexity Analysis : 
        // Space Complexity : O(N)
        // Time Complexity : O(N * log(log(N)))
    }


}
