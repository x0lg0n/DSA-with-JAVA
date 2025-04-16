public class L12 {
    public static void main(String[] args) {

        L12.countDigits(0);
        L12.countDigitViaLog(4547);
        L12.armstrongNumer(153);
        L12.palindromeNumer(121);
        L12.printAllDivisor(24);
    }
    
    // Count Digits of a Number
    public static void countDigits(int num){
        if (num == 0){
            System.out.println("Digits are: 1");
            return;
        }
        int counter = 0;
        while(num>0){
            num/=10;
            counter++;
        }
        System.out.println("Digits are: " + counter);
    }

    // Count Digits of a Number Via log
    public static void countDigitViaLog(int num){
        if (num == 0){
            System.out.println("Digits are: 1");
            return;
        }
        int count = (int)((int)Math.log(num)/Math.log(10)) + 1;
        System.out.println("Digits are: " + count);
    }

    // Armstrong Number
    public static void armstrongNumer(int num){
        int res = 0;
        int copy = num;
        while (num > 0) {
            int digit = num % 10;
            res = res + (int)(Math.pow(digit, 3));
            num /= 10;
        }
        System.out.println(res == copy);
    }
    
    //Palindrome Number 
    public static void palindromeNumer(int num){
        int rev = 0;
        int n = num;
        while(n>0){
            int rem = n % 10;
            rev = rev*10 + rem;
            n/=10;
        }
        if(rev == num){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
       
    }

    // Printing all divisor of a Number
    public static void printAllDivisor(int num){
        int counter = 1;
        int sqroot = (int)Math.sqrt(num);
        while (counter <= sqroot) {
            if(num%counter == 0){
                System.out.println(counter + " is a divisor of " + num);
                int otherNumber = num/counter;
                if(otherNumber != counter){
                    System.out.println(otherNumber + " is a divisor of " + num);
                }
            }
            counter++;
        }
        
    }
}
