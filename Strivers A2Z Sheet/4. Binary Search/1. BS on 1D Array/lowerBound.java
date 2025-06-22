import java.util.Scanner;

public class lowerBound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        int n = arr.length; // length of the array

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int x = sc.nextInt(); // element to find lower bound

        System.out.println(lowerBoundL(arr, n, x));
        System.out.println(lowerBoundO(arr, n, x));

        sc.close();
        
    }

    // Brute Force Approach
    private static int lowerBoundL(int[] arr, int n, int x) {
        for (int i = 0; i < n; i++) {
            if (arr[i] >= x) { 
                // Lower Bound Found
                return i;
            }
        }
        return n;
    }
    // Complexity Analysis: 
    // Time Complexity:- O(N)
    // Space Complexity:- O(1)

    
    // Optimal Approach
    private static int lowerBoundO(int[] arr, int n, int target){
        int low = 0, high = n - 1;
        int ans = arr.length;
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
