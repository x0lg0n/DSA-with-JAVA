import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float tempC = sc.nextFloat();

        float tempF = (tempC * 9/5) + 32;

        System.out.println("Temperature in F is : " + tempF);

        sc.close();
    }
}
