import java.util.*;

public class Hashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // No. of elements in array
        int q = sc.nextInt(); // No. of queries
        int num = sc.nextInt(); // Number to be searched in the array
        char c = sc.next().charAt(0); // Character to be searched in the string
        String s = sc.next(); // String to be searched

        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(hashingInt(num, arr));
        hashingIntO(n, arr, q, num);
        hashingChar(s, arr, q, c);
        sc.close();

       
    }

    // Brute Force Method
    private static int hashingInt(int n, int[] arr) {
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
    static void hashingIntO(int n, int[] arr, int q, int num) {
        // Precompute: 
        int hash[] = new int[n + 1];  
        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]] += 1;
        }
        // Fetching: 
        while (q-- != 0) {
            System.out.println(hash[num]);
        }
    }

    // Character Hashing 
    static void hashingChar(String s, int[] arr, int q, char c) {
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
    static void hashingHashMap(int[] arr, int  q, int n, int num){
        // Precompute: 
        HashMap <Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int key = arr[i];
            int freq = 0;
            if (hashMap.containsKey(key)) {
                freq = hashMap.get(key); // fetching from the map
                freq++;
                hashMap.put(key, freq);
            }

            while (q++ != 0) {
                if (hashMap.containsKey(num)) {
                    System.out.println(hashMap.get(key));
                }
                else{
                    System.out.println(0);
                }
            }

        }
    }

    

    
   
}
