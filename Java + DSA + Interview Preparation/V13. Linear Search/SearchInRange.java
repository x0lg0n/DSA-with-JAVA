import java.util.Scanner;

public class SearchInRange {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int start = sc.nextInt();
        int end = sc.nextInt();
        int target = sc.nextInt();
        System.out.println(SearchInRanges(arr, start, end, target));
        sc.close();
    }

    private static int SearchInRanges(int[] arr, int start, int end, int target) {
         if (arr.length == 0) {
            return -1;
        }
        for (int j = start; j < end; j++) {
            if (arr[j] ==  target) {
                return j;
            }
        }
        return -1;
    }
}
