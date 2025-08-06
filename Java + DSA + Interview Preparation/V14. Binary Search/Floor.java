public class Floor {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 5;
        int ans = floor(arr, target);
        System.out.println(ans);
    }   
    
    private static int floor(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        if (target > arr[high]) {
            return -1;
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (target < arr[mid]) {
                high = mid - 1;
            }

            else if (target > arr[mid]) {
                low = mid + 1;
            }

            else {
                return mid;
            }
        }
        return high;
    }
}
