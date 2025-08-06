public class OrderAgnoisticBS {
    public static void main(String[] args) {
        int[] arr = {-78, -12, -11, -2, 0, 1, 5, 7, 9, 12, 45};
        int target = 1;
        int ans = OrderAgonistic(arr, target);
        System.out.println(ans);
    }

    private static int OrderAgonistic(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        boolean isAsc = arr[low] < arr[high];

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    high = mid - 1;
                }

                else {
                    low = mid + 1;
                }
            } else {
                if (target < arr[mid]) {
                    high = mid - 1;
                }

                else {
                    low = mid + 1;
                }
            }
        }
        return -1;
    }
}
