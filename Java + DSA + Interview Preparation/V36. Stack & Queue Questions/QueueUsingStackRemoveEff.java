import java.util.Stack;
public class QueueUsingStackRemoveEff {
    private Stack<Integer> first;
    private Stack<Integer> second;

    public QueueUsingStackRemoveEff() {
        first = new Stack<>();
        second = new Stack<>();
    }

    public void add(int item) {
        while (!first.isEmpty()) {
            second.push(first.pop());
        }

        first.push(item);
        while (!second.isEmpty()) {
            first.push(second.pop());
        }
    }

    public int remove() {
        return first.pop();
    }

    public int peek() {
        return first.peek();
    }

    public boolean isEmpty() {
        return first.isEmpty();
    }
}
