import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDisapperedNum {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };

        System.out.println(findDisappearedNumbers(arr));
        System.out.println(Arrays.toString(arr));
    }

    public static List<Integer> findDisappearedNumbers(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            // check whether element at i ias at there correct index or not
            if (arr[i] != arr[correct]) {
                // Swap
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++;
            }
        }

        List<Integer> list = new ArrayList<>();

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                list.add(j + 1);
            }
        }

        return list;
    }
}
