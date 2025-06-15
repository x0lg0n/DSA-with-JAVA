
import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array Syntax
        // data_type[] variable_name = new data_type[size];

        // Array of primitives
        int[] arr; // Declaration of array
        arr = new int[4];
        
        // Size of array
        int n = arr.length;
        System.out.println(n);

        // input for array 
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Printing Array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        
        System.out.println();

        // toString() Method
        System.out.println(Arrays.toString(arr));


        // Array of Objects
        String[] str = new String[5];

        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();
        }

        System.out.println(Arrays.toString(str));
        print(arr, n);

        // Passing Array in Function 
        
        sc.close();
    }

    public static void print(int[] nums, int n) {
        System.out.println(Arrays.toString(nums));
    }
}
