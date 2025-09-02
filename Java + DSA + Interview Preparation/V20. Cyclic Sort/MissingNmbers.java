import java.util.*;

public class MissingNmbers {
    public static void main(String[] args) {
        int[] nums = {4, 0, 2, 1};
        int ans = missingNumber(nums);
        System.out.println(ans);
        System.out.println(Arrays.toString(nums));
    }

    public static int missingNumber(int[] nums) {
        int i = 0;

        while (i < nums.length) {
            int correct = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[correct]) {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }
            else {
                i++;
            }
        }

        // search
        for (int j = 0; j < nums.length; j++) {
            if (j != nums[j]) {
                return j;
            }
        }

        return nums.length;
    }
}
