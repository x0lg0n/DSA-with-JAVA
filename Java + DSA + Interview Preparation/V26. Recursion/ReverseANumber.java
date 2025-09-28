import java.util.Scanner;

public class ReverseANumber {
    static int sum = 0;
    static void revesre(int n) {
        if (n == 0) {
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        revesre(n / 10);
    }

    static int reverseHelper(int n, int sum) {
        if (n == 0) {
            return sum;
        }
        return reverseHelper(n / 10, sum * 10 + (n % 10));
    }

    static int reverse(int n) {
        return reverseHelper(n, 0);
    }

    static boolean palindrome(int n) {
        return (n == reverse(n));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        revesre(n);
        System.out.println(sum);
        sc.close();
    }

    
}
