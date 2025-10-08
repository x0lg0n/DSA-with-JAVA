import java.util.Scanner;

public class Sorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr =  new int[10];

        for (int i = 0; i < arr.length; i++) {
           arr[i] = sc.nextInt(); 
        }

        System.out.println(sorted(arr, 0));
        sc.close();
    }

    public static boolean sorted(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }
        return arr[index] < arr[index + 1] && sorted(arr, index + 1);
    }
}
