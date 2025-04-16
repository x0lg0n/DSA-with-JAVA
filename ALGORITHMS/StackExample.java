import java.util.Stack;

//Stack

class StackExample {
    public static void main(String[] args) {
        Stack <String> stack = new Stack<>();
        stack.push("One");
        stack.push("Two");
        stack.push("Three");
        stack.push("Four");
        stack.push("Five");
        stack.pop();
        stack.pop();
        
        System.out.println(stack.search("Five"));
        for(int i=0; i<1000000000; i++){
            stack.push("Five");
        }
        System.out.println(stack.peek());
    }
    
}