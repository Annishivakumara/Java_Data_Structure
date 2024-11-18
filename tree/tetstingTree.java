import java.util.*;

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class BinarySearchTree {
    Node root;

    public void insert(int data) {
        Node node = new Node(data);
        if (root == null) {
            root = node;
        } else {
            Node temp = root, cur = null;
            while (temp != null) {
                cur = temp;
                if (data > temp.data) {
                    temp = temp.right;
                } else {
                    temp = temp.left;
                }
            }
            if (data > cur.data) {
                cur.right = node;
            } else {
                cur.left = node;
            }
        }
    }

    public void inorder() {
        in(root);
    }

    private void in(Node root) {
        if (root != null) {
            in(root.left);
            System.out.println(root.data + " ");
            in(root.right);
        }
    }

    public void preorder() {
        pre(root);
    }

    private void pre(Node root) {
        if (root != null) {
            System.out.println(root.data + " ");
            pre(root.left);
            pre(root.right);
        }
    }

    public void postorder() {
        post(root);
    }

    private void post(Node root) {
        if (root != null) {
            post(root.left);
            post(root.right);
            System.out.println(root.data + " ");
        }
    }

    public void search(int data) {
        Node temp = root;
        if (root == null) {
            System.out.println("Tree Empty");
        } else {
            while (temp != null) {
                if (data == temp.data) {
                    System.out.println("Data Found: " + data);
                    return;
                } else if (data < temp.data) {
                    temp = temp.left;
                } else {
                    temp = temp.right;
                }
            }
            System.out.println("Data Not Found: " + data);
        }
    }

    public void inorderWithoutRecursion() {
        if (root == null) {
            System.out.println("Tree is empty");
            return;
        }

        Stack<Node> stack = new Stack<>();
        Node current = root;

        while (current != null || !stack.isEmpty()) {
            // Traverse to the leftmost node
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            // Pop the node from the stack
            current = stack.pop();
            System.out.println(current.data + " ");

            // Move to the right subtree
            current = current.right;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinarySearchTree bst = new BinarySearchTree();
        int choice;

        System.out.println("Binary Search Tree Operations");
        do {
            System.out.println("Enter your choice: \n1. Insert \n2. Preorder \n3. Postorder \n4. Inorder \n5. Search \n6. Inorder (Without Recursion) \n0. Exit");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the data to insert: ");
                    int data = scanner.nextInt();
                    bst.insert(data);
                    break;

                case 2:
                    System.out.println("Preorder traversal:");
                    bst.preorder();
                    break;

                case 3:
                    System.out.println("Postorder traversal:");
                    bst.postorder();
                    break;

                case 4:
                    System.out.println("Inorder traversal:");
                    bst.inorder();
                    break;

                case 5:
                    System.out.println("Enter the data to search: ");
                    int searchData = scanner.nextInt();
                    bst.search(searchData);
                    break;

                case 6:
                    System.out.println("Inorder traversal (without recursion):");
                    bst.inorderWithoutRecursion();
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 0);

        scanner.close();
    }
}
