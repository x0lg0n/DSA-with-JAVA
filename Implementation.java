public class Implementation {
    public static class Node {
        int data; 
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static class  LinkedList {
        Node head = null;
        Node tail = null;
        int size = 0;
          
        void insert(int val, int pos) {
            Node t = new Node(val);
            Node temp = head;
            if (pos == 0) {
                insertAtStart(val);
                return;
            }
            else if (pos == size) {
                insertAtEnd(val);
                return;
            }
            else if (pos < 0 || pos > size) { 
                System.out.println("Invalid Index");
                return;
            }
            for (int i = 1; i < pos; i++) {
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
            size++;
        }

        void insertAtStart(int val) {
            Node temp = new Node(val);

            if (head == null) {
                tail = temp;
            }
            else {
                temp.next = head;
            }
            head = temp;
            size++;
        }

        void insertAtEnd(int val) {
            Node temp = new Node(val);

            if (head == null) {
                head = temp;
            }
            else {
                tail.next = temp;
            }
            tail = temp;
            size++;
        }

        void insertAtEnd(Node head, int val) {
            Node temp = new Node(val);
            Node t = head;

            while (t.next != null) {
                t= t.next;
            }
            t.next = temp;
            size++;
        }

        void delete(int idx) {
            Node temp = head;
            if (temp == null) {
                return;
            }
            if (idx == 0) {
                head = temp.next;
                size--;
                return;
            }
            if (idx > size) {
                System.out.println("Index Out of Bound");
                return;
            }
            for (int i = 1; i <= idx; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            tail = temp;
            size--;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data);
                if (temp.next != null) {
                    System.out.print(" -> ");
                }
                temp = temp.next;
            }
        }
        
        int getElementAt(int idx) {
            Node temp = head;
            if (idx < 0 || idx > size) { 
                System.out.println("Invalid Index");
                return -1;
            }
            for (int i = 0; i < idx; i++) {
                temp = temp.next;
            }
            return temp.data;
        }
    }
        
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        
        ll.insertAtStart(4); // 4 
        ll.insertAtEnd(5);  // 4 -> 5
        ll.insertAtEnd(7);  // 4 -> 5 -> 7
        ll.insertAtEnd(9);  // 4 -> 5 -> 7 -> 9
        ll.insertAtEnd(13); // 4 -> 5 -> 7 -> 9 -> 13
        ll.insert(0, 1);// 4 -> 0 -> 5 -> 7 -> 9 -> 13
        ll.delete(8);
        ll.display();
        System.out.println();
        // System.out.println(ll.tail.data);
        System.out.println(ll.size);
        // System.out.println(ll.getElementAt(-5));

    }
}   

