public class SQRT {
    public static void main(String[] args) {
        System.out.println(perfectSQRT(36));
    }   
    
    public static int perfectSQRT(int n) {

        if (n < 2) {
            return n;
        }
        int low = 0, high = n, ans = 0;


        while (low <= high) {
            int mid = low + (high - low) / 2;

            if ((long) mid * mid == n) {
                return mid;
            }
            else if ((long) mid * mid < n) {
                ans = mid;
                low =  mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return ans;
    }
}
