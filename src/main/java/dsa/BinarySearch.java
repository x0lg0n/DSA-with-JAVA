package dsa;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-78, -12, -11, -2, 0, 1, 5, 7, 9, 12, 45};
        int target = 0;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    /**
     * Performs binary search on a sorted array to find the index of the target element.
     * 
     * @param arr The sorted array to search in
     * @param target The element to search for
     * @return The index of the target element if found, otherwise -1
     * 
     * Time Complexity: O(log n)
     * Space Complexity: O(1)
     */
    public static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

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
        return -1;
    }
}