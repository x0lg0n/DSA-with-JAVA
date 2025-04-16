public class Maths{

    public static void main(String[] args) {
        CheckForPrimeo(21);
    }
    // Brute Force Approach
    static void CountDigit(int n){
        int count = 0;
        while (n>0) {
            count++;
            n = n / 10;    
        }
        System.out.println("Number of digits in " + n + "are : " + count);
    }
    // Time Complexity  : O(log10N + 1)
    // Space Complexity : O(1)

    // Optimal Approach
    static void CountDigito(int N){
        int count = (int)Math.log10(N)+1;    
        System.out.println("Number of digits in " + N + "are : " + count);
    }
    // Time Complexity  : O(1)
    // Space Complexity : O(1)

    // Optimal Approach
    static void ReverseANumber(int n){
        int rev = 0;
        while (n>0) {
            int lst = n % 10;
            rev  = rev*10 + lst;
            n = n / 10;  
        }
        System.out.println("Reverse of " + n +  "is : " + rev);
    }
    // Time Complexity  : O(log10N + 1)
    // Space Complexity : O(1)

    // Optimal Approach
    static void CheckPalindrome(int n){
        int cmpr = n;
        int rev = 0;
        while (n>0) {
            int lst = n % 10;
            rev  = rev*10 + lst;
            n = n / 10;  
        }
        if (cmpr == rev){
            System.out.println(cmpr + " is a Palindrome.");
        }
        else{
            System.out.println(cmpr + " is not a Palindrome.");
        }
    }
    // Time Complexity  : O(log10N + 1)
    // Space Complexity : O(1)

    // Brute Force Approach
    static void GCD(int n1, int n2){
        int gcd = 1;
        for (int i = 1; i <= Math.min(n1, n2); i++) {
            if(n1 % i == 0 && n2 % i == 0){
                gcd = i;
            }
        }
        System.out.println(gcd);
    }
    // Time Complexity  : O(min(n1,n2))
    // Space Complexity : O(1)

    // Better  Approach
    static void GCDb(int n1, int n2){
        int gcd = Math.min(n1, n2);
        for (int i = Math.min(n1, n2); i >=1; i--) {
            if(n1 % i == 0 && n2 % i == 0){
                gcd = i;
            }
        }
        System.out.println(gcd);
    }
    // Time Complexity  : O(min(n1,n2))
    // Space Complexity : O(1)

    // Optimal Approach
    static int GCDo(int n1, int n2){
        while (n1 > 0 && n2 > 0){
            if (n1 > n2) {
               n1 = n1 % n2; 
            }
            else{
                n2 = n2 % n1;
            }
            if (n1 == 0){
                return n2;
            }
            
        }
        return n1;
    }
    // Time Complexity  : O(min(n1,n2))
    // Space Complexity : O(1)

    
    // Optimal Approach
    static boolean ArmstrongNumber(int num){
        int k = String.valueOf(num).length();
        int sum = 0;
        int n = num;
        while(n > 0){
            int ld = n % 10;
            sum += Math.pow(ld, k);
            n = n / 10;
        }
        return sum == num ? true : false;
    }
    // Time Complexity  : O(log10N + 1)
    // Space Complexity : O(1)

    // Brute Force Approach
    static void PrintAllDivisor(int n){
        System.out.println("All Divisors of n are : ");
        for (int i = 1; i <= n; i++) {
            if(n % i == 0){
                System.out.print(i + " ");
            }
        }
    }
    // Time Complexity  : O(N)
    // Space Complexity : O(1)

    // Optimal Approach
    static void PrintAllDivisoro(int n){
        System.out.println("All Divisors of n are : ");
        for (int i=1; i<=n; i++) {
            if(n % i == 0){
                System.out.print(i + " ");
            }
        }
    }
    // Time Complexity  : O(N)
    // Space Complexity : O(1)

    //Brute Force Approach
    static void CheckForPrime(int n){
        int cnt = 0;
        for(int i=1; i<=100; i++){
            if(n % i == 0)
                cnt++;
        }

        if(cnt == 2){
            System.out.println(n + " is a Prime Number.");
        }
        else{
            System.out.println(n + " is not a Prime Number.");
        }    
    }
    // Time Complexity  : O(N)
    // Space Complexity : O(1)

    //Optimal Approach
    static void CheckForPrimeo(int n){
        int cnt = 0;
        for(int i=1; i<=Math.sqrt(n); i++){
            if(n % i == 0)
                cnt++;
            if(n / i != i)
                cnt++;
        }

        if(cnt == 2){
            System.out.println(n + " is a Prime Number.");
        }
        else{
            System.out.println(n + " is not a Prime Number.");
        }    
    }
    // Time Complexity  : O(sqrt(N))
    // Space Complexity : O(1)
}
