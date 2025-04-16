import java.util.ArrayList;
import java.util.LinkedList;

public class Difference {
    public static void main(String[] args) {
        ArrayList <Integer> arrayList = new ArrayList<Integer>();
        LinkedList <Integer> linkedList = new LinkedList<Integer>();

        long startTime;
        long endTime;
        long elapsedTime;
        for (int i = 0; i <= 100000000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }
        // **********************Linked List***********************

        startTime = System.nanoTime();

        // do something

        linkedList.get(0);

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime ;

        System.out.println("Linked List:\t " + elapsedTime + " ns");

        // **********************Array List************************

        startTime = System.nanoTime();

        arrayList.get(0);

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime ;

        System.out.println("Array List:\t " + elapsedTime + " ns");

        
        


        
    }
}
