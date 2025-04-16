import java.util.*;
public class PriorityQueueExample {
    public static void main(String[] args) {
        Queue <Double> queue = new PriorityQueue<>(Collections.reverseOrder());
        queue.offer(3.0);
        queue.offer(8.0);
        queue.offer(6.0);
        queue.offer(2.0);
        queue.offer(7.0);

        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
