package 4. Binary Search;

public class binarySearch {
    // Iterative Binary Search
    private int binarySearchI(int[] arr, int low, int high, int target){
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
    private int binarySearchR(int[] arr, int low, int high, int target){
        // Base Condition
        if (arr[mid] == target) return mid;
        // perform the steps
        else if (target > arr[mid]) {
            return binarySearchR(int[] arr, mid + 1, high, target)
        }
        else 
            return binarySearchR(int[] arr, low, mid - 1, target);
    }
    // Complexity Analysis: 
    // Time Complexity:- O(log N)
    // Space Complexity:- O(1)

    // Search Function
    private int search(int[] nums,  int target) {
        return binarySearchR(nums, 0, nums.length - 1, target);
    }
    
    public static void main(String[] args) {
        int[] a = {1, 3, 4, 5, 8, 9, 11, 12};
        int n = a.length;
        int idx = binarySearch(a, 0, n, 11);
        System.out.println(idx);
    }


}
