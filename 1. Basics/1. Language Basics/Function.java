public class Function{
    public static void main(final String args[]){
        final Function obj = new Function();
        obj.Thunder();
        obj.swap();

    }

    public void Thunder(){
        System.out.println("Thunder........");
    }

    public void swap(int n1, int n2){
        System.out.println("A: " + n1 + " , " + n2);
        final int temp = n1;
        n1 = n2;
        n2 = temp;
        System.out.println(n1 + " , " + n2);
    }

    public void swap(long n1, long n2){
        System.out.println("B: " + n1 + " , " + n2);
        final long temp = n1;
        n1 = n2;
        n2 = temp;
        System.out.println(n1 + " , " + n2);
    }

    public void swap(long n1, int n2){
        System.out.println("C: " + n1 + " , " + n2);
        final long temp = n1;
        n1 = n2;
        n2 = (int) temp;
        System.out.println(n1 + " , " + n2);
    }
        
    public void swap(){
        System.out.println("D: " + "This is too much....");
    }
}