public class Patterns {
    public static void main(String[] args) {
        int n = 5;
        pattern22(n);    
    }
    
    /*
    * * * * *
    * * * * *
    * * * * *
    * * * * *
    */
    static void pattern1(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }

    /*
    * 
    * * 
    * * * 
    * * * * *
    */
    static void pattern2(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
    1 
    1 2 
    1 2 3 
    1 2 3 4 
    1 2 3 4 5 
    */
    static void pattern3(int n) {
        for(int i=1; i<=n; i++){
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    
    /*
    1 
    2 2 
    3 3 3 
    4 4 4 4 
    5 5 5 5 5 
    */
    static void pattern4(int n) {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    /*
    * * * * * * 
    * * * * * 
    * * * * 
    * * * 
    * * 
    *
    */ 
    static void pattern5(int n) {
        for(int i=n; i>=0; i--){
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
    1 2 3 4 5 
    1 2 3 4 
    1 2 3 
    1 2 
    1 
    */ 
    static void pattern6(int n) {
        for(int i=n; i>=0; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    /*
        *
       ***
      *****
     *******
    *********
    */
    static void pattern7(int n) {
        for(int i=0; i<n; i++){
            // Space
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            // Star
            for(int j=0; j<(2*i+1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    /*
    *********
     *******
      *****
       ***
        *
    */
    static void pattern8(int n) {
        for(int i=0; i<n; i++){
            // Space
            for(int j=0; j<=i; j++){
                System.out.print(" ");
            }
            // Star
            for(int j=0; j<2*n - (2*i+1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /* 
        *
       ***
      *****
     *******
    *********
    *********
     *******
      *****
       ***
        *  
    */

    static void pattern9(int n) {
        for(int i=0; i<n; i++){
            // Space
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            // Star
            for(int j=0; j<(2*i+1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0; i<n; i++){
            // Space
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            // Star
            for(int j=0; j<2*n - (2*i+1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
    * 
    * * 
    * * * 
    * * * * 
    * * * * * 
    * * * * * * 
    * * * * * 
    * * * * 
    * * * 
    * * 
    * 
    */
    static void pattern10(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n; i>=0; i--){
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    /* 
    1    
    0 1 
    1 0 1 
    0 1 0 1 
    1 0 1 0 1 
    */
    static void pattern11(int n) {
        int start = 1;
        for(int i=1; i<=n; i++){
            if (i % 2 == 0) start=0;
            else start = 1;
            for(int j=1; j<=i; j++){
                System.out.print(start + " ");
                start = 1 - start;
            }
            System.out.println();
        }
    }

    /*
    1                 1 
    1 2             2 1 
    1 2 3         3 2 1 
    1 2 3 4     4 3 2 1 
    1 2 3 4 5 5 4 3 2 1 
    */
    static void pattern12(int n) {
        int spaces = 2*(n-1);
        for(int i=1; i<=n; i++){ 
            // number
            for(int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            //spaces
            for(int j=1; j<=spaces; j++){
                System.out.print("  ");
            }
            // number
            for(int j=i; j>=1; j--){
                System.out.print(j + " ");
            }
            System.out.println();
            spaces-=2;
        }
    }

    /* 
    1
    2 3 
    4 5 6 
    7 8 9 10 
    11 12 13 14 15 
    */
    static void pattern13(int n) {
        int count = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(count + " ");
                count = count + 1;
            }
            System.out.println();
        }
    }
     
    /*
    A
    A B
    A B C 
    A B C D 
    A B C D E
    */ 
     static void patter14(int n) {
        for(int i=0; i<=n; i++){
            for(char j='A'; j<='A'+i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    /*
    A B C D E 
    A B C D 
    A B C 
    A B 
    A 
    */ 
    static void pattern15(int n) {
        for(int i=n; i>=0; i--){
            for(char j='A'; j<='A'+i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }    

    /*
    A 
    B B 
    C C C 
    D D D D 
    E E E E E 
    F F F F F F 
    */ 
    static void pattern16(int n) {
        for(int i=0; i<=n; i++){
            for(int j=0; j<=i; j++){
                System.out.print((char)((int) 'A' + i) + " ");
            }
            System.out.println();
        }
    }

    /*
        A
       ABA
      ABCBA
     ABCDCBA
    ABCDEDCBA
    */
    static void pattern17(int n) {
        for(int i=0; i<n; i++){
            // Space
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            // Star
            for(int j=0; j<(2*i+1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

   
    /*
    E 
    D E 
    C D E 
    B C D E 
    A B C D E 
    */ 
    static void pattern18(int n) {
        for(int i=0; i<n; i++){
            for(char j = (char)((int) 'A'+ n - 1 - i); j <= (char)((int) 'A'+ n - 1); j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    /*
    * * * * * * * * * *
    * * * *     * * * * 
    * * *         * * * 
    * *             * * 
    *                 * 
    *                 * 
    * *             * * 
    * * *         * * * 
    * * * *     * * * * 
    * * * * * * * * * * 
     */
    static void pattern19(int n){
        int spaces = 0;
        for(int i=1; i<=n; i++){ 
            // star
            for(int j=n; j>=i; j--){
                System.out.print( "* ");
            }
            //spaces
            for(int j=1; j<=spaces; j++){
                System.out.print("  ");
            }
            // star
            for(int j=n; j>=i; j--){
                System.out.print("* ");
            }
            System.out.println();
            spaces+=2;
        }
        int space = 2*(n-1);
        for(int i=1; i<=n; i++){ 
            // number
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            //spaces
            for(int j=1; j<=space; j++){
                System.out.print("  ");
            }
            // number
            for(int j=i; j>=1; j--){
                System.out.print("* ");
            }
            System.out.println();
            space-=2;
        }
    }
    /*
    *                 * 
    * *             * * 
    * * *         * * * 
    * * * *     * * * * 
    * * * * * * * * * * 
    * * * *     * * * * 
    * * *         * * * 
    * *             * * 
    *                 *     
    */
    static void pattern20(int n){
        int space = 2*(n-1);
        for(int i=1; i<n; i++){ 
            // number
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            //spaces
            for(int j=1; j<=space; j++){
                System.out.print("  ");
            }
            // number
            for(int j=i; j>=1; j--){
                System.out.print("* ");
            }
            System.out.println();
            space-=2;
        }
        int spaces = 0;
        for(int i=1; i<=n; i++){ 
            // star
            for(int j=n; j>=i; j--){
                System.out.print( "* ");
            }
            //spaces
            for(int j=1; j<=spaces; j++){
                System.out.print("  ");
            }
            // star
            for(int j=n; j>=i; j--){
                System.out.print("* ");
            }
            System.out.println();
            spaces+=2;
        }
    }
    /*
    *****
    *   *
    *   *
    *   *
    *****
    */
    static void pattern21(int n){
        for(int i=0; i<n; i++){ 
            for(int j=0; j<n; j++){
                if(i==0 || j==0 || i== n-1 || j==n-1 )
                    System.out.print( "*");
                else
                    System.out.print( " ");
            }
            System.out.println();
            
        }
    }

    /*
    5 5 5 5 5 5 5 5 5 
    5 4 4 4 4 4 4 4 5 
    5 4 3 3 3 3 3 4 5 
    5 4 3 2 2 2 3 4 5 
    5 4 3 2 1 2 3 4 5 
    5 4 3 2 2 2 3 4 5 
    5 4 3 3 3 3 3 4 5 
    5 4 4 4 4 4 4 4 5 
    5 5 5 5 5 5 5 5 5 
    */
     static void pattern22(int n){
        for(int i=0;i<2*n-1;i++){
            for(int j=0;j<2*n-1;j++){
                int top = i;
                int bottom = j;
                int right = (2*n - 2) - j;
                int left = (2*n - 2) - i;
                System.out.print(n- Math.min(Math.min(top,bottom), Math.min(left,right)) + " ");
            }
            System.out.println();
        }
    }
    
}
