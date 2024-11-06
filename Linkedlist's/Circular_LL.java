import java.util.*;
class Node {
    int data;
    Node link;
}
public class cirlinkedlist {
    Node first, last;
    public Node createNode(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.link = null;
        return newNode;
    }

    public void insertfront(int data) {
        Node node = createNode(data);
        if (first == null) {
            first = last = node;
            node.link = first;
        } else {
            node.link = first;
            first = node;
            last.link = first;
        }
    }

    public void insertend(int data) {
        Node node = createNode(data);
        if (first == null) {
            first = last = node;
            node.link = first;
        } else {
            last.link = node;
            last = node;
            last.link = first;
        }
    }

    public void deletefront() {
        if (first == null) {
            System.out.println("List is empty");
        } else if (first == last) {
            System.out.println("Data deleted: " + first.data);
            first = last = null;
        } else {
            System.out.println("Data deleted: " + first.data);
            first = first.link;
            last.link = first;
        }
    }

    public void deletelast() {
        if (first == null) {
            System.out.println("List is empty");
        } else if (first == last) {
            System.out.println("Data deleted: " + first.data);
            first = last = null;
        } else {
            Node temp = first;
            while (temp.link != last) {
                temp = temp.link;
            }
            System.out.println("Data deleted: " + last.data);
            last = temp;
            last.link = first;
        }
    }
    public void insertAtPosition(int data, int position) {
        Node node = new Node(data);

        // If list is empty or position is 1, insert at the front
        if (first == null || position == 1) {
            if (first == null) {
                first = last = node;
                node.link = first; // Point to itself
            } else {
                node.link = first;
                first = node;
                last.link = first; // Update last to point to new first
            }
            return;
        }

        Node temp = first;
        int count = 1;

        // Traverse to the position just before the desired position
        while (count < position - 1 && temp.link != first) {
            temp = temp.link;
            count++;
        }
        if(temp==null){
        System.out.println("NO list");
        }
           
            node.link = temp.link;
            temp.link = node;
    }
     public void deleteAtPosition(int position) {
        if (first == null) {
            return;
        }

        if (position == 1) {
            if (first == last) {
                first = last = null;
            } else {
                first = first.link;
                last.link = first;
            }
            return;
        }

        Node temp = first;
        int count = 1;

        while (count < position - 1 && temp.link != first) {
            temp = temp.link;
            count++;
        }

        if (temp.link == first) {
            return;
        }

        Node nodeToDelete = temp.link;
        if (nodeToDelete == last) {
            last = temp;
        }
        temp.link = nodeToDelete.link;
    }
}

    public void display() {
        if (first == null) {
            System.out.println("List is empty");
        } else {
            Node temp = first;
            do {
                System.out.println("Data in the list: " + temp.data);
                temp = temp.link;
            } while (temp != first);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        cirlinkedlist cs = new cirlinkedlist();
        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Insert at front");
            System.out.println("2. Insert at end");
            System.out.println("3. Delete from front");
            System.out.println("4. Delete from end");
            System.out.println("5. Display list");
            System.out.println("Enter your choice (or enter a number > 5 to exit):");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the data");
                    int data1 = sc.nextInt();
                    cs.insertfront(data1);
                    break;
                case 2:
                    System.out.println("Enter the data");
                    int data2 = sc.nextInt();
                    cs.insertend(data2);
                    break;
                case 3:
                    cs.deletefront();
                    break;
                case 4:
                    cs.deletelast();
                    break;
                case 5:
                    cs.display();
                    break;
                default:
                    System.out.println("Exiting...");
            }
        } while (choice >= 1 && choice <= 5);

        sc.close();
    }
}
