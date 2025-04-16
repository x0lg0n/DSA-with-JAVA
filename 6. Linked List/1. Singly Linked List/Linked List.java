public class LinkedList {
    // Node
    public static class Node {
        int data;  //value 
        Node next;  // address of the new node
        
        public Node(int data){
            this.data = data;
        }
    }

    // Displaying a Linked List Recursively
    public static void displayR(Node head){
        if (head == null) return;
        System.out.println(head.data);
        displayR(head.next);
    }

    // Displaying a Linked List 
    public static void display(Node head){
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }   
    }

    public static int lengthR(Node head){
        int cnt = 0;
        if (head == null) return 0;
        cnt++;
        lengthR(head.next);
        return cnt;
    }

    public static int length(Node head){
        int cnt = 0;
        while (head != null) {
            cnt++;
            head = head.next;
        }
        return cnt;
    }


    // Main Method
    public static void main(String[] args) {

        //Implementation of singly linked list
        Node a = new Node(5); // head node 
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16); // tail node

        a.next = b;  // 5 -> 3 9 8 16
        b.next = c;  // 5 -> 3 ->  9 8 16
        c.next = d;  // 5 -> 3 -> 9 -> 8 16
        d.next = e;  // 5 -> 3 -> 9 -> 8 -> 16
        
        System.out.println(lengthR(a));
        
    }
}
