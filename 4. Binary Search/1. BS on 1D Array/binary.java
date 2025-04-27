import java.util.Scanner;

public class binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[8];
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        linearSearch(arr, 2);
        int ans = binarySearch(arr, 9);
        if(ans == -1){
            System.out.println("Element not found in array");
        }
        else{
            System.out.println("Element found at index: " + ans);
        }
        print(arr);
        sc.close();
    }

    private static int binarySearch(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;
        while(s <= e){
            int mid = s + (e - s) / 2;
            if(target == arr[mid]){
                System.out.println("Element found at index " + mid);
            }
            if (target > arr[mid]) {
                s = mid + 1;
            }
           else{
                e = mid - 1;
           }
        }
        return 0;
    }
    // Complexity Analysis: 
    // Time complexity:- O(Log N)
    // Space complexity:- O(1)

    private static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("");
        }
    }
    // Complexity Analysis: 
    // Time complexity:- O(N)
    // Space complexity:- O(1)

    private static void linearSearch(int[] arr, int target) {          
        for (int i = 0; i < arr.length; i++) {                         
            if (arr[i] == target) {
                System.out.println("Element found at index: " + i);
            }  
        }
    }
    // Complexity Analysis: 
    // Time complexity:- O(N)
    // Space complexity:- O(1)
}
