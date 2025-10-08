import java.util.Arrays;
import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr =  new int[10];

        for (int i = 0; i < arr.length; i++) {
           arr[i] = sc.nextInt(); 
        }

        bubble(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));
        System.out.println();
        triangle1(4, 0);
        sc.close();
    }

    /* Pattern 1: 
    * * * * * 
    * * * 
    * * 
    * 
    */
    static void triangle1(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            System.out.print("* ");
            triangle1(r, c + 1);
        }
        else {
            System.out.println();
            triangle1(r - 1, 0);
        }
    }

    /* Pattern 2: 
    * 
    * * 
    * * * 
    * * * *  
    */
    static void triangle2(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            triangle2(r, c + 1);
            System.out.print("* ");
        }
        else {
            triangle2(r - 1, 0);
            System.out.println();
        }
    }

    static void bubble(int[] arr, int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            if (arr[c] > arr[c + 1]) {
                // swap
                int temp = arr[c];
                arr[c] = arr[c + 1];
                arr[c + 1] = temp;
            }
            bubble(arr, r, c + 1);    
        }
        else {
            bubble(arr, r - 1, 0);     
        }
    }

    static void selection(int[] arr, int r, int c, int max){
        if (r == 0) {
            return;
        }
        if (c < r) {
            if (arr[c] > arr[max]) {
                selection(arr, r, c + 1, c);
            }
            else {
                selection(arr, r, c + 1, max);
            }    
        }
        else {
            int temp = arr[max];
            arr[max] = arr[r - 1];
            arr[r - 1] = temp;
            selection(arr, r - 1 , 0, 0);    
        }
    }
    
}
