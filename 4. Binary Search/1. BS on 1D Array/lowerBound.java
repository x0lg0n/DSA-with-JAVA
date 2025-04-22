public class lowerBound {
    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 9, 15, 19};
        int n = 6, x = 9;
        int ind = LowerBound(arr, n, x);
        System.out.println("The lower bound is the index: " + ind);
    }

    // Brute Force Approach
    private int lowerBoundL(int[] arr, int n, int x) {
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
    private int lowerBoundO(int[] arr, int n, int target){
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
