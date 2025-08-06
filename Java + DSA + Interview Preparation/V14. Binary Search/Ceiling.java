public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = -455;
        int ans = ceiling(arr, target);
        System.out.println(ans);
    }   
    
    private static int ceiling(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        if (target > arr[high]) {
            return -1;
        }

        if (target < arr[low]) {
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
        return low;
    }
}
