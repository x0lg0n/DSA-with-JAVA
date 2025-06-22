import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Syntax -> 1D arrayList
        ArrayList <Integer> list = new ArrayList<>(5);
 
        // list.add(45);
        // list.add(7);
        // list.add(8);
        // list.add(89);
        // list.add(12);

        // System.out.println(list);

        // list.set(0, 6);

        // list.remove(1);

        // System.out.println(list);

        // input
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt()); 
        }

        // get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }

        System.out.println(list);
        sc.close();

    }
}
