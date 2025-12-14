public class DLL {
    private Node head;
    private Node tail;
    private int size;

    // Constructor
    public DLL() {
        this.size = 0;
    }

    // Node class with it's Constructors
    private class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }

    // Function to display values of linked list
    public void display() {
        Node temp = head;
        Node last = null;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            last = temp;
            temp = temp.next;
        }
        System.out.println("END");

        System.out.println("Print in reverse");
        while (last != null) {
            System.out.print(last.val + " -> ");
            last = last.prev;
        }
        System.out.println("START");
    }

    // Function to get the required index of linked list
    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    // Function to the find the index by providing the value in linked list
    public Node find(int val) {
        Node node = head;
        while (node != null) {
            if (node.val == val) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    // -------------------------
    // INSERTION
    // -------------------------
    // Function to insert element at the start of linked list
    public void insertAtFirst(int val) {
        if (tail == null) {
            tail = head;
        }
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
        size += 1;
    }

    // Function to insert element at the last of linked list
    public void insertAtLast(int val) {
        Node node = new Node(val);
        Node temp = head;

        node.next = null;

        if (head == null) {
            node.prev = null;
            head = node;
            return;

        }
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
        node.prev = temp;
        size += 1;
    }

    // Function to insert an element at a given index in linked list
    public void insert(int val, int index) {

        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        Node node = new Node(val);

        if (index == 0) {
            node.next = head;
            if (head != null) {
                head.prev = node;
            }
            head = node;
            head.prev = null;
            size++;
            return;
        }

        Node temp = head;

        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        node.prev = temp;
        node.next = temp.next;
        if (temp.next != null) {
            temp.next.prev = node;
        }
        temp.next = node;
        size++;
    }

    // Main Function
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertAtFirst(10);
        list.insertAtFirst(20);
        list.insertAtFirst(30);
        list.display();
        // System.out.println();
        // list.insertAtLast(40);
        // list.insertAtLast(50);
        // list.display();
        // System.out.println();
        // list.insert(14, 3);
        // list.display();
        System.out.println();
        list.insert(12, 1);
        list.display();
    }
}
