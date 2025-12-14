public class LL {
    private Node head;
    private Node tail;
    private int size;

    // Constructor
    public LL() {
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

    // -------------------------
    //        DISPLAY
    // -------------------------
    // Funsction to display values of Linked List
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    // -------------------------
    //         SIZE
    // -------------------------
    // Funstion to print the size of Linked List
    public void size() {
        int size = 0;
        Node temp = head;
        while (temp != null) {
            size += 1;
            temp = temp.next;
        }
        System.out.println(size);
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
    //        INSERTION
    // -------------------------
    // Function to insert element at the start of linked list
    public void insertFirst(int val) {
        if (tail == null) {
            tail = head;
        }
        Node node = new Node(val);
        node.next = head;
        head = node;
        size += 1;
    }

    // Function to insert element at the end of linked list
    public void insertLast(int val) {
        Node node = new Node(val);
        if (tail == null) {
            insertFirst(val);
        }
        tail.next = node;
        tail = node;
        size += 1;
    }

    // Function to insert element at a particular index in linked list
    public void insert(int index, int val) {
        if (index == 0) {
            insertFirst(val);
        }

        if (index == size) {
            insertLast(val);
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;
        size += 1;
    }

    // Function to insert an element at a given index in linked list using recusrion
    public void insertRec(int val, int index) {
        head = insertRec(val, index, head);
        size++;
    }

    // Helper Function 
    private Node insertRec(int val, int index, Node node) {
        if (index < 0) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            Node temp = new Node(val, node);
            return temp;
        }

        if (node == null) {
            throw new IndexOutOfBoundsException();
        }
        node.next = insertRec(val, index-1, node.next);

        return node;
    }

    // -------------------------
    //        DELETION
    // -------------------------
    // Function to delete the first element from linked list
    public int deleteFirst() {
        if (head == null) {
            tail = null;
        }
        int val = head.val;
        head = head.next;
        size -= 1;
        return val;
    }

    // Function to delete the last element from linked list
    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();

        }
        Node secondlast = get(size - 1);
        int val = tail.val;
        tail = secondlast;
        tail.next = null;
        size -= 1;
        return val;
    }

    // Function to delete a particular index of linked list
    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }

        if (index == size - 1) {
            return deleteLast();
        }

        Node prev = get(index - 1);
        int val = prev.next.val;
        prev.next = prev.next.next;
        return val;
    }

    // -------------------------
    //       MAIN FUNCTION
    // -------------------------
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(5);
        list.insertFirst(7);
        list.insertFirst(17);
        list.display();
        list.insertLast(12);
        list.insert(3, 45);
        list.insert(4, 0);
        list.display();
        list.size();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        list.display();
        list.size();
        list.insertRec(1000, 3);
        list.display();
    }

}
