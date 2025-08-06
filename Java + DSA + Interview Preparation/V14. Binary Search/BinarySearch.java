public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-78, -12, -11, -2, 0, 1, 5, 7, 9, 12, 45};
        int target = 0;
        int ans = binarySearch(arr, target);
        System.out.println(ans);

    }

    private static int binarySearch(int[] arr, int target) {
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
