public class Leetcode2 {
    public static void main(String[] args) {
        int[] arr = { -78, -12, -11, -2, 0, 1, 5, 7, 9, 12, 45 };
        int target = 45;

        int[] ans = position(arr, target);

        for (int i : ans) {
            System.out.println(arr[i]);
        }

    }

    private static int[] position(int[] arr, int target) {
        int[] ans = { -1, -1 };

        int start = search(arr, target, true);
        int end = search(arr, target, false);

        ans[0] = start;
        ans[1] = end;
        return ans;
    }

    private static int search(int[] arr, int target, boolean isFindFirstIndex) {
        int ans = -1;
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
                ans = mid;
                if (isFindFirstIndex) {
                    high = mid - 1;
                } else {
                     low = mid + 1;
                }
            }
        }
        return ans;
    }

}
