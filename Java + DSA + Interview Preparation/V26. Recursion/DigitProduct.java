import java.util.Scanner;

public class DigitProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(digitProduct(n));
        sc.close();
    }

     static int digitProduct(int n) {
        if (n % 10 == n) {
            return n;
        }
        return (n % 10) * digitProduct(n / 10);
    }
}
