import java.util.*;
public class QueueExample {
    public static void main(String[] args) {
        Queue <String> queue = new LinkedList<String>();
        queue.offer("Kain");
        queue.offer("Karina");
        queue.offer("Hinata");
        queue.offer("Naruto");
        queue.offer("Genji");
        System.out.println(queue.isEmpty());
        queue.poll();
        System.out.println(queue.peek());
        queue.poll();
        System.out.println(queue);
    }
}
