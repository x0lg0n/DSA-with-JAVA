import java.util.Scanner;
import java.util.Stack;

public class ValidParantheses {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String s = sc.next();

        System.out.println(isValid(s));
        sc.close();
    }

    public static boolean isValid(String s) {
        Stack <Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                if (ch == ')') {
                    if (stack.pop() != '(') {
                        return false;
                    }
                }
                if (ch == ']') {
                    if (stack.pop() != '[') {
                        return false;
                    }
                }
                if (ch == '}') {
                    if (stack.pop() != '{') {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}
