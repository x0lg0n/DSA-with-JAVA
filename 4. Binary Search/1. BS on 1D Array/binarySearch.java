import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[8];
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(binarySearchR(arr, 0, n - 1, 5));
        System.out.println(binarySearchI(arr, 0, n - 1, 8));
        System.out.println(search(arr, 7));
        sc.close();
    }

    // Iterative Binary Search
    private static int binarySearchI(int[] arr, int low, int high, int target){
        // perform the steps
        while (low <= high) {
            int mid = low + (high - low) / 2;
           if (arr[mid] == target) {
            return mid;
           } 
           else if (target > arr[mid]) {
            low = mid + 1;
           }
           else {
            high = mid - 1;
           }
        }
        return -1;
    }
    // Complexity Analysis: 
    // Time Complexity:- O(log N)
    // Space Complexity:- O(1)

    // Recursive binary Search 
    private static int binarySearchR(int[] arr, int low, int high, int target){
        int mid = low + (high - low) / 2;
        // Base Condition
        if (arr[mid] == target) return mid;
        // perform the steps
        else if (target > arr[mid]) {
            return binarySearchR(arr, mid + 1, high, target);
        }
        else 
            return binarySearchR(arr, low, mid - 1, target);
    }
    // Complexity Analysis: 
    // Time Complexity:- O(log N)
    // Space Complexity:- O(1)

    // Search Function
    private static int search(int[] nums,  int target) {
        return binarySearchR(nums, 0, nums.length - 1, target);
    }
    // Complexity Analysis: 
    // Time Complexity:- O(log N)
    // Space Complexity:- O(1)
    


}
