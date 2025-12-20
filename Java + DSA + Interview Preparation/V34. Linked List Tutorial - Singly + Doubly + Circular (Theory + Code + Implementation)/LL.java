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
    //       QUESTIONS
    // -------------------------

    // Link: https://leetcode.com/problems/remove-duplicates-from-sorted-list/
    public void duplicates() {
        Node node = head;

        while (node.next != null) {
            if (node.val == node.next.val) {
                node.next = node.next.next;
                size--;
            }
            else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }

    // Link: https://leetcode.com/problems/merge-two-sorted-lists/
    public static LL mergeTwoLists(LL list1, LL list2) {
        Node f = list1.head;
        Node s = list2.head;

        LL ans = new LL();

        while (f != null && s != null) {
            if (f.val < s.val) {
                ans.insertFirst(f.val);
                f = f.next;
            } else {
                ans.insertFirst(s.val);
                s = s.next;
            }
        }

        while (f != null) {
            ans.insertFirst(f.val);
            f = f.next;
        }

        while (s != null) {
            ans.insertFirst(s.val);
            s = s.next;
        }

        return ans;
    } 

    // Link: https://leetcode.com/problems/linked-list-cycle/
    public boolean hasCycle(Node head) {
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                return true;
            }
        }
        return false;
    }
    
    public int cycleLenght(Node head) {
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                Node temp = slow;
                int length = 0;
                do {
                    temp = temp.next;
                    length++;
                } while (temp != slow);
                return length;
            }
        }
        return 0;
    }

    // Link: https://leetcode.com/problems/linked-list-cycle-ii/
    public Node detectCycle(Node head) {
        int lenght = 0;
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                lenght = cycleLenght(slow);
                break;
            }
        }

        if (lenght == 0) {
            return null;
        }

        // find the start node 
        Node f = head;
        Node s = head;

        while (lenght > 0) {
            s = s.next;
            lenght--;
        }

        // keep moving both forward and they will meet at cycle start
        while (f != s) {
            f = f.next;
            s = s.next;
        }

        return s;
    }
    
    // link: https://leetcode.com/problems/happy-number/
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = findSqaure(n);
            fast = findSqaure(findSqaure(n));
        } while (slow != fast);

        if (slow == 1) {
            return true;
        }
        return false;
    } 

    private int findSqaure(int n) {
        int ans = 0;
        while (n > 0) {
            int rem = n % 10;
            ans += rem * rem;
            n /= 10;
        }
        return ans;
    }

    // link: https://leetcode.com/problems/middle-of-the-linked-list/   
    public Node middleNode(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && slow != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    

    // -------------------------
    //       MAIN FUNCTION
    // -------------------------
    public static void main(String[] args) {
        LL list = new LL();
        LL list2 = new LL();
        list.insertFirst(7);
        list.insertFirst(6);
        list.insertFirst(5);
        list.display();
        list2.insertFirst(17);
        list2.insertFirst(12);
        list2.insertFirst(8);
        list2.insertFirst(5);
        list2.insertFirst(2);
        list2.display();
        LL ans = mergeTwoLists(list, list2);
        ans.display();
        
        
    }

}
