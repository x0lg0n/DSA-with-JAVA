import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Type casting
        int d = (int)(66.25f);
        float x = sc.nextFloat();
        System.out.println(x);
        System.out.println(d);

        byte a = 40;
        byte b = 50;
        byte c = 100;
        int s = (a * b) / c;

        // ASCII Value of A
        int number = 'A';
        System.out.println(number);

        System.out.println(s);
        sc.close();
    }
}
