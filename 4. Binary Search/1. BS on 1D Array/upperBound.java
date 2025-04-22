public class upperBound {
    public static void main(String[] args) {
        
    }

    // Brute Force Approach
     private int upperBound(int[] arr, int n, int x) {
        for (int i = 0; i < n; i++) {
            if (arr[i] > x) { 
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
    private int upperBound(int[] arr, int low, int high, int target){
        int ans = arr.length;
        while (low <= high) {
            int mid = low + (high - low) / 2;
           if (arr[mid] > target) {
            // Maybe an answer
            ans = mid;
            // look for smaller index on left
            high = mid - 1;
           } 
           else {
            //look on the right 
            low = mid + 1;
           }
        }
        return ans;
    }
    // Complexity Analysis: 
    // Time Complexity:- O(log N)
    // Space Complexity:- O(1)

}
