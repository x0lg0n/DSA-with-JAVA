import java.util.Scanner;

public class BinaryTree {

    public BinaryTree() {

    }

    private static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    // Insert Element
    public void populate(Scanner scanner) {
        System.out.println("Enter the root node: ");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner, root);
    }

    public void populate(Scanner scanner, Node node) {
        System.out.println("Do you want to enter left of " + node.value);
        boolean left = scanner.nextBoolean();

        if (left) {
            System.out.println("Enter the value of the left of " + node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left);
        }

        System.out.println("Do you want to enter right of " + node.value);
        boolean right = scanner.nextBoolean();

        if (right) {
            System.out.println("Enter the value of the right of " + node.value);
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner, node.right);
        }
    }

    public void display() {
        display(root, "");
    }

    public void display(Node node, String indent) {
        if (node == null) {
            return;
        }
        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }

    // Pretty display function with better formatting
    public void prettyDisplay() {
        System.out.println("\n========== Pretty Tree Display ==========");
        prettyDisplay(root, "", true);
        System.out.println("==========================================\n");
    }

    private void prettyDisplay(Node node, String prefix, boolean isLeft) {
        if (node == null) {
            return;
        }

        System.out.println(prefix + (isLeft ? "├── " : "└── ") + node.value);

        if (node.left != null || node.right != null) {
            if (node.left != null) {
                prettyDisplay(node.left, prefix + (isLeft ? "│   " : "    "), true);
            } else if (node.right != null) {
                // If left is null but right exists, show proper formatting
                System.out.println(prefix + (isLeft ? "│   " : "    ") + "├── null");
            }
            
            if (node.right != null) {
                prettyDisplay(node.right, prefix + (isLeft ? "│   " : "    "), false);
            } else if (node.left != null) {
                // If right is null but left exists, show proper formatting
                System.out.println(prefix + (isLeft ? "│   " : "    ") + "└── null");
            }
        }
    }

    // Enhanced pretty display with level-based formatting
    public void prettyDisplayAdvanced() {
        System.out.println("\n========== Advanced Tree Display ==========");
        prettyDisplayAdvanced(root, "", true, true);
        System.out.println("===========================================\n");
    }

    private void prettyDisplayAdvanced(Node node, String prefix, boolean isLeft, boolean isRoot) {
        if (node == null) {
            return;
        }

        if (isRoot) {
            System.out.println("Root: " + node.value);
        } else {
            System.out.println(prefix + (isLeft ? "├─► " : "└─► ") + node.value);
        }

        if (node.left != null || node.right != null) {
            if (node.left != null) {
                prettyDisplayAdvanced(node.left, prefix + (isRoot ? "" : (isLeft ? "│   " : "    ")), true, false);
            }
            if (node.right != null) {
                prettyDisplayAdvanced(node.right, prefix + (isRoot ? "" : (isLeft ? "│   " : "    ")), false, false);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.populate(sc);
        
        System.out.println("\n--- Regular Display ---");
        tree.display();
        
        tree.prettyDisplay();
        tree.prettyDisplayAdvanced();
        
        sc.close();
    }
}
