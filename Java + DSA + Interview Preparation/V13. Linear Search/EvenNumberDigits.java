// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
public class EvenNumberDigits {
    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7896};
        System.out.println(findNumbers(arr));
        System.out.println(count(45151525));
        System.out.println(digits(45132145));
    }

    private static int findNumbers(int[] arr) {
        int count = 0;

        for (int i : arr) {
            if (even(i)) {
                count++;
            }
        }
        return count;
    }

    // function to check whether a number contains even digit or not
    private static boolean even(int num) {
        int digits = count(num);

        // if (digits % 2 == 0) {
        //     return true;
        // }

        return digits % 2 == 0;
    }

    private static int digits(int n) {
        if (n < 0) {
            n = n * -1;
        }
        return (int) (Math.log10(n)) + 1;
    }

    private static int count(int num) {
        int count = 0;

        if (num < 0) {
            num = num * -1;
        }

        if (num == 0) {
            count = 1;
        }

        while (num > 0) {
            count++;
            num = num / 10;
        }

        return count;
    }
}
