import java.util.*;
public class LinkedListsExample {
    public static void main(String[] args) {
        LinkedList <Integer> linkedList = new LinkedList<>();
        //LinkedLists as Stack
        // linkedList.push(1);
        // linkedList.push(7);
        // linkedList.push(4);
        // linkedList.push(6);
        // linkedList.pop();
        // System.out.println(linkedList);
        // LinkedLists as Queue
        linkedList.offer(5);
        linkedList.offer(4);
        linkedList.offer(9);
        linkedList.offer(8);
        linkedList.poll();
        System.out.println(linkedList);
        
        linkedList.add(1, 8);
        linkedList.remove(0);
        System.out.println(linkedList);



    }
}
