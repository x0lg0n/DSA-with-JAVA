import java.util.Scanner;

public class searchInsert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];

        int n = arr.length; // length of the array

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();
        
        System.out.println(searchInsertB(arr, target));
        System.out.println(searchInsertO(arr, target));

        sc.close();
    }

    // Brute Force Approach 
    private static int searchInsertB(int[] arr, int target) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= target) {
                return i;
            }
        }
        return n;
    }
    // Complexity Analysis: 
    // Time Complexity:- O(N)
    // Space Complexity:- O(1)

    // Optimal Approach
    private static int searchInsertO(int[] arr, int target) {
        int n = arr.length;
        int low = 0, high = n - 1;
        int ans = n;
        // perform the steps
        while (low <= high) {
            int mid = low + (high - low) / 2;
           if (arr[mid] >= target) {
            // Maybe an answer
            ans = mid;
            // look for the smaller index on the left
            high = mid - 1;
           } 
           else {
            // look on the right
            low = mid + 1;
           }
        }
        return ans;
    }
    // Complexity Analysis: 
    // Time Complexity:- O(log N)
    // Space Complexity:- O(1)
}
