// Find Smallest letter greater than target

public class Leetcode {
    public static void main(String[] args) {
        char[] latters = {'c', 'd', 'f', 'j'};
        char target = 'j';
        char ans = solution(latters, target);
        System.out.println(ans);
    }   
    
    private static char solution(char[] latters, char target) {
        int low = 0, high = latters.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (target < latters[mid]) {
                high = mid - 1;
            }

            else {
                low = mid + 1;
            }
        }
        return latters[low % latters.length];
    }
}
