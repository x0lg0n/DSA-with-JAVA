import java.util.Scanner;

public class CountZeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(count(n));
        sc.close();
    }

    static int count(int n) {
        return helper(n, 0);
    }

    private static int helper(int n, int count) {
        if (n == 0) {
            return count;
        }

        int rem = n % 10;
        if (rem == 0) {
            return helper(n / 10, count+1);
        }
        return helper(n / 10, count);
    }
}
