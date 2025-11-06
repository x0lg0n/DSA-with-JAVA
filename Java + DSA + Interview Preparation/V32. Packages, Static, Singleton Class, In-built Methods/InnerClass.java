
public class InnerClass {

    static class Test {
        String name;
        public Test(String name) {
            this.name = name;
        }
    }
    public static void main(String[] args) {
        Test a = new Test("Hell");
        Test b = new Test("Hell");

        if (a == b) {
            System.out.println("True");
        }
        else {
            System.out.println("false");
        }

    }


}
