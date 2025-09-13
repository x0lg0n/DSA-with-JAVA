public class EvenOdd {
    public static void main(String[] args) {
        System.out.println(isOdd(37));
    }

    private static boolean isOdd(int num) {
        return (num & 1) == 1;
    }
}

