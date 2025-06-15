import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        // Input and output in java 

        // Input
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        // Output
        System.out.println("Your entered number is " + a);

        sc.close();

        int x = 45_000_000;
        System.out.println(x);
        
    }       
}