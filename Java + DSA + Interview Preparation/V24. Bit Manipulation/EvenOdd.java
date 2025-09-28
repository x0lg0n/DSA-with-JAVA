public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isOdd(n));
        sc.close();
    }

    private static boolean isOdd(int num) {
        return (num & 1) == 1;
    }
}

