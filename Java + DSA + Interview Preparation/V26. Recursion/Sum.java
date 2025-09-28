import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sum(n);
        sc.close();
    }

    static int sum(int n){
        if (n <= 1) {
            return 1;
        }
        return (n + sum(n - 1));
    }

}
