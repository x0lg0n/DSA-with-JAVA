public class FibonnaciNumber {
    public static void main(String[] args) {
        System.out.println(fibonnaci(6));   
    }

    static int fibonnaci(int n) {
        if (n < 2) {
            return n;
        }

        return (fibonnaci(n - 1) + fibonnaci(n - 2));
    }
}
