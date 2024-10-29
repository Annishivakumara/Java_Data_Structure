package tree;
import java.util.*;
class Node{
    int data;
    Node leftlink;
    Node rightlink;
    public Node(int data){
        this.data=data;
        leftlink=null;
        rightlink=null;
    }
}
public class binarysearchtree{
    Node node;
    Node root;
    public void insert(int data){
        node=new Node(data);
        Node temp=root;
        Node cur=null;
        if(root==null){
            root=node;
        }else{
            while (temp!=null) {
                cur=temp;
                if(data<temp.data){
                    temp=temp.leftlink;
                }else{
                    temp=temp.rightlink;
                }
            }
            if(data< cur.data){
               cur.leftlink=node;
            }else{
                cur.rightlink=node;
            }
        }
    }
    //Inorder traversal 
    public void inordertraversal(){
        inorders(root);
    }
    public void inorders(Node root){
        if(root!=null){
            inorders(root.leftlink);
            System.out.println(root.data+" ");
            inorders(root.rightlink);
        }
    }
    public void postordertraversal(){
          postorder(root);
    }
    public void postorder(Node root){
        if(root!=null){
            postorder(root.leftlink);
            postorder(root.rightlink);
           System.out.println(root.data+" ");
        }
    }
    public void preordertraversal(){
        preorder(root);
    }
    public  void preorder(Node root){
        if(root!=null){
            System.out.println(root.data+" ");
            preorder(root.leftlink);
            preorder(root.rightlink);}

    }
    public void search(int data){
        if(root==null){
            System.out.println("Tree is Empty");
        }else{
          Node temp=root;
          while (temp!=null) {
                if(data<temp.data){
                    if(data==temp.data){
                    System.out.println("Searched data found: "+temp.data);
                    break;
                }
                    temp=temp.leftlink;
                }else{
                    if(temp.data==data){
                        if(temp.data==data){
                            System.out.println("Searched Data: "+temp.data);
                            break;
                        }
                    temp=temp.rightlink;
                    }
    }}}System.out.println("Data Not Found");
}
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        binarysearchtree bst = new binarysearchtree();
        int choice;
do {
        System.out.println("Enter the CHoice \n1.insert  \n2.inoder Traversal \n3.postorder Traversal \n4.preorder Traversal \n5.Search \n3 delete");
        choice=sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter the Tree Data");
                int data=sc.nextInt();
                bst.insert(data);
                break;
            case 2:
                System.out.println("Inorder Traversal");
                bst.inordertraversal();
                break;
            case 3:
                System.out.println("Postorder Traversal");
                bst.postordertraversal();
                break;
            case 4:
                System.out.println("Preorder Traversal");
                bst.preordertraversal();
                break;
            case 5:
                System.out.println("Enter the delete data");
                break;
            case 6:
                System.out.println("Enter the Search Data");
                int data1=sc.nextInt();
                bst.search(data1);
                break;
            default:
                break;
        }
} while (choice<=10);
    }
}
