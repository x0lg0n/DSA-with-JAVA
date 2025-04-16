package Arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Array {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 7, 8, 7, 6, 5, 4 };
        int n = arr.length;
        int[] a = {1, 1, 2, 2, 3, 3, 3, 3 };
        print(arr, n);
        leftRotateDO(arr, n, 4);
        print(arr, n);
    }

    
    static void print(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void Reverse(int[] arr, int start, int end) {
        while (start <= end) {
          int temp = arr[start];
          arr[start] = arr[end];
          arr[end] = temp;
          start++;
          end--;
        }
    }


    // Brute Force Approach
    static int findLargest(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }
    // Time Complexity : O(N*log(N))
    // Space Complexity : O(N)

    // Optimal Approach
    static int findLargestO(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    // Time Complexity : O(N)
    // Space Complexity : O(1)

    // Brute Force Approach
    static void findSecond(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Invalid Input");
            return;
        }
        Arrays.sort(arr);
        System.out.println("Second Largest: " + arr[arr.length - 2]);
        System.out.println("Second Smallest: " + arr[1]);
    }
    // Time Complexity : O(N*log(N))
    // Space Complexity : O(1)

    // Optimal Approach
    static void findSecondO(int[] arr) {
        

    }
    // Time Complexity : O(N)
    // Space Complexity : O(1)

    // Simple Approach
    static boolean sorted(int[] arr) {
        Arrays.sort(arr);
        return true;
    }
    // Time Complexity : O(N*log(N))
    // Space Complexity : O(N)

    // Brute Force Approach
    static boolean sortedB(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    return false;
                }
            }
        }
        return true;
    }
    // Time Complexity : O(N^2)
    // Space Complexity : O(1)

    // Optimal Approach
    static boolean sortedO(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
    // Time Complexity : O(N)
    // Space Complexity : O(1)

    static int removeDuplicateB(int[] arr){
        HashSet <Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        int k = set.size();
        int j = 0;
        for (int x : set) {
            arr[j++] = x; 
        }
        return k;
    }

    static int removeDuplicateO(int[] arr) {
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                arr[i + 1] = arr[j];
                i++;
            }
        }
        return i + 1;
    }

    // Brute Force Approach
    static void leftRotate(int[] arr, int n) {
        int[] temp = new int[n];
        for (int i = 1; i < n; i++) {
            temp[i - 1] = arr[i];
        }
        temp[n - 1] = arr[0];
        print(temp, n);
    }
    // Time Complexity : O(N)
    // Space Complexity : O(N)

    // Optimal Approach
    static void leftRotateO(int[] arr, int n) {
        int temp = arr[0];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[n - 1] = temp;
        print(arr, n);
    }
    // Time Complexity : O(N)
    // Space Complexity : O(1)

     // Brute Force Approach
     static void leftRotateD(int[] arr, int n, int d) {
        if(n == 0){
            return;
        }
        d = d % n;
        int[] temp = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }

        //Shifting of elements
        for (int i = d; i < n; i++) {
            temp[i - 1] = arr[i];
        }

        for (int i = n - d; i < n; i++) {
            arr[i] = temp[ i - (n - d)];
        }

        print(arr, n);
        
    }
    // Time Complexity : O(N)
    // Space Complexity : O(N)

    // Optimal Approach
    public static void leftRotateDO(int[] arr, int n, int d) {
        Reverse(arr, 0, n-d-1);
        Reverse(arr, n - d, n - 1);
        Reverse(arr, 0, n - 1);
    }
    // Time Complexity : O(N)
    // Space Complexity : O(1)
   

    static int[] moveZeroesToEnd(int[] arr, int n){
        int j = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
        
            }
        }

        return arr;
    }

    static int[] moveZeroesToEndB(int[] arr, int n){
        
        ArrayList<Integer> temp = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                temp.add(arr[i]);
            }
        }
        return arr;
    }
    // optimal Approach
    static int linearSearch(int[] arr, int target) {
        if (arr.length >= 1) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == target) {
                    return i;
                }
            }
        }
        return -1;
    }
    // Time Complexity : O(N)
    // Space Complexity : O(1)

}
