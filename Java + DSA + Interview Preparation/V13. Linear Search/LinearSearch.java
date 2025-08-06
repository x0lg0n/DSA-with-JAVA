import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int res = sc.nextInt();
        System.out.println(linearSearch(arr, res));
        sc.close();
    }

    private static int linearSearch(int[] arr, int num) {
        if (arr.length == 0) {
            return -1;
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] ==  num) {
                return j;
            }
        }
        return -1;
    }
}
