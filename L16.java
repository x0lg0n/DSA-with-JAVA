import java.util.Scanner;

public class L16 {
    public static void main(String[] args) {
        int Array[][] = new int[2][2];
        // int arr[] = new int[5];
        int rollNo[] = {1,2,3,4,5,6};

        Scanner sc = new Scanner(System.in);
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println("Enter " + i + " element: ");
        //     int element = sc.nextInt();
        //     arr[i] = element;
        // }
        // print(rollNo);
        // print(arr);
        // insert(rollNo, 1, 23);
        // delete(rollNo, 2);
        // print(rollNo);
        update(rollNo, 0, 4);

        
        for (int i = 0; i < Array.length; i++) {
            for (int j = 0; j < Array[i].length; j++) {
                
                int element = sc.nextInt();
                Array[i][j] = element;
            }
        }
        print2DArray(Array);
        insert2dArray(Array,0,0,4);
        print2DArray(Array);
        delete2dArray(Array, 0, 0);
        print2DArray(Array);
        update2dArray(Array, 0, 0, 5);
        print2DArray(Array);
        sc.close();
    }

    private static void update2dArray(int[][] arr, int pos1, int pos2, int element) {
        int size1 = arr.length;
        if(pos1<0 || pos1 >= size1-1){
            System.out.println("Wrong Index");
            return;
        }
        int size2 = arr[pos1].length;
        if(pos2<0 || pos2 >= size2-1){
            System.out.println("Wrong Index");
            return;
        }
        arr[pos1][pos2] = element;
    }

    private static void update(int[] arr, int pos, int element) {
        int size = arr.length;
        if(pos<0 || pos >= size-1){
            System.out.println("Wrong Index");
            return;
        }
        arr[pos] = element;
    }

    private static void delete2dArray(int[][] arr, int pos1, int pos2) {
        delete(arr[pos1], pos2);
    }

    private static void insert2dArray(int arr[][], int pos1, int pos2, int element) {
        insert(arr[pos1], pos2, element);
    }

    private static void print2DArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
           System.out.println("For " + i + " index: ");
           print(array[i]);
        }
    }

    private static void delete(int[] arr, int pos) {
       for (int i = pos; i < arr.length - 2; i++) {
            arr[i] = arr[i+1];
       }
       arr[arr.length - 1]=0;
    }

    private static void insert(int[] arr, int pos, int element) {
        int size = arr.length;
        if(pos<0 || pos >= size-1){
            System.out.println("Wrong Index");
            return;
        }
        for (int i = size-2; i >= pos; i--) {
            arr[i+1] = arr[i];
        }
        arr[pos] = element;
    }

    private static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    
    
}