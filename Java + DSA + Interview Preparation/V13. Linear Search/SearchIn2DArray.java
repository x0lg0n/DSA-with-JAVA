import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {2, 3, 5, 1},
            {4, 5, 5, 9},
            {7, 8, 9, 10}
        };

        int target = 8;
        System.out.println(Arrays.toString(search(arr, target)));
        System.out.println(max(arr));
        System.out.println(min(arr));
    }

    private static int[] search(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[] {-1, -1};
    }

    private static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int element : ints) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }

     private static int min(int[][] arr) {
        int min = Integer.MAX_VALUE;
        for (int[] ints : arr) {
            for (int element : ints) {
                if (element < min) {
                    min = element;
                }
            }
        }
        return min;
    }
}
