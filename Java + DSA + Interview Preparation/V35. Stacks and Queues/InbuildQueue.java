import java.util.LinkedList;
import java.util.Queue;

public class InbuildQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Add Operation
        queue.add(1);
        queue.add(10);
        queue.add(13);
        queue.add(20);
        queue.add(24);
        queue.add(14);

        // Remove Operation
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());

        // Print Elements of Queue
        for (Integer i : queue) {
            System.out.println(i);
        }
    }
}
