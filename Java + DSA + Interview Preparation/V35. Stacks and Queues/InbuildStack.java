import java.util.Stack;

public class InbuildStack {
    public static void main(String[] args) {
        Stack <Integer> stack = new Stack<>();

        // Push Operation
        stack.push(12);
        stack.push(24);
        stack.push(36);
        stack.push(45);
        stack.push(78);
        stack.push(1);

        // POP Operations
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        // Printing Elements of Stack
        for (Integer i : stack) {
            System.out.println(i);
        }

    }
}
