public class CLL {
    private Node head;
    private Node tail;
    private int size;

    // Constructor
    public CLL() {
        this.size = 0;
    }

    // Node class with it's Constructors
    private class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }   

    // Funsction to display values of Linked List
    public void display() {
        Node temp = head;
        if (head != null) {
            do {
                System.out.print(temp.val + " -> ");
                temp = temp.next;
            } while (temp != head);
        }
        System.out.println("HEAD");
    }
    
    // -------------------------
    //          INSERTION
    // -------------------------
    // Function to insert element after tail in linked list
    public void insert(int val) {
        Node node = new Node(val);

        if (head == null) {
            head = node;
            tail = node;
        }
        
        tail.next = node;
        node.next = head;
        tail = node;
    }

    // -------------------------
    // DELETION
    // -------------------------
    // Function to delete the element from linked list
    public void delete(int val) {
        Node node = head;
        if (node == null) {
            return;
        }

        if (node.val == val) {
            head = head.next;
            tail.next = head;
            return;
        }

        do {
            Node n = node.next;
            if (n.val == val) {
                node.next = n.next;
                break;
            }
            node = node.next;
        } while (node != head);
    }


    // Main Function
    public static void main(String[] args) {
        CLL list = new CLL();
        list.insert(12);
        list.insert(15);
        list.insert(14);
        list.insert(18);
        list.insert(20);
        list.display();
        list.delete(14);
        list.display();
    }
}
