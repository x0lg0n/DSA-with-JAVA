import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
         * int[][] arr = {
         *  {1, 2, 3}, // 0th Index
         *  {4, 5}, //1st Index
         *  {6, 7, 8, 9} // 2nd Index -> arr[2] = {6, 7, 8, 9}
         * };
         * 
         */

        int[][] arr = new int[3][3];
        System.out.println(arr.length); // no of rows

        // input
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }

        // output
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }

        sc.close();
    }

}
