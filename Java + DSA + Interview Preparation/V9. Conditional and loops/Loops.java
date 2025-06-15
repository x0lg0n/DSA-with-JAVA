import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // For loop
        for (int i = 0; i <= n; i++) {
            System.out.println(i);
        }

        System.out.println("-----------------------------");
        // // While loop
        while (n > 0) {
            System.out.println(n * 10);
            n--;
        }

        System.out.println("-----------------------------");
        // do while loop
        int i = 1;
        do {
            System.out.println(i * 2);
            i++;
        }while (i <= 5);

        sc.close();
    }
}
