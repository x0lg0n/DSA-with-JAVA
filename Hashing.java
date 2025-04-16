import java.util.*;

public class Hashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // No. of elements in array
        int q = sc.nextInt();
        char c = sc.next().charAt(0); 
        String s = sc.next();

        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        hshc(s, arr, q, c);
        hsho(n, arr, q, 1);
        System.out.println(hsh(n, arr));
        sc.close();
    }

    // Brute Force Method
    private static int hsh(int n, int[] arr) {
        int cnt = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == n) {
                cnt += 1;
            }
        }
        return cnt;
    }
    //Time Complexity : O(Q*N)

    // Optimized Approach using Hashing
    static void hsho(int n, int[] arr, int q, int num) {
        // Precompute: 
        int hash[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]] += 1;
        }
        // Fetching: 
        while (q-- > 0) {
            System.out.println(hash[num]);
        }
    }

    // Character Hashing 
    static void hshc(String s, int[] arr, int q, char c) {
        // Precompute: 
        int hash[] = new int[256];
        for (int i = 0; i < arr.length; i++) {
            hash[s.charAt(i) - 'a']++;
        }
        // Fetching: 
        while (q-- > 0) {
            System.out.println(hash[c]);
        }
    }

    // Hashing using Hash Map
    static void hashing(){
         // Precompute: 4
        HashMap <Integer, Integer> hashMap = new HashMap<>();
        System.err.println(hashMap);
    }

    // Counting frequencies of array elements
    static void cntFreq(){

    }

    // Counting frequencies of array elements using Hash Map
    static void cntFrequency(){

    }

    //Find the highest/lowest frequency element : Brute Force Method
    static void cntFrequent(){

    }

    //Find the highest/lowest frequency element : Optimized Approach
    static void cntFrequent(int n){

    }

   
}
