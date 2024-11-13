
import java.util.*;
class Node{
  int data;
  Node left;
  Node right;
  public Node(int data){
    this.data=data;
    left=null;
    right=null;
  }
}
public class binarysearchtree{
  Node node;
  Node root;
  public void insert(int data){
    node = new Node(data);
    if(root==null){
        root=node;
    }else{
         Node temp=root;
        Node cur=null;
        while(temp!=null){
            cur =temp;
             if(data>temp.data){
                 temp=temp.right;
             }else{
                temp=temp.left;
             }
        }
        if(data>cur.data){
            cur.right=node;
        }else{
            cur.left=node;
        }
    }
  }
  public void inorder(){
    in(root);
  }
  public void in(Node root){
    if(root!=null){
        in(root.left);
        System.out.println(root.data+" ");
        in(root.right);
    }
  }
  public void postorder(){
    post(root);
  }
  public void post(Node root){
    if(root!=null){
        post(root.left);
        post(root.right);
        System.out.println(root.data+" ");
    }
  }
  public void preorder(){
    pre(root);
  }
  public void pre(Node root){
    if(root!=null){
        System.out.println(root.data+" ");
        pre(root.left);
        pre(root.right);
    }
  }
       public void search(int data){
        Node temp=root;
        if(root==null){
            System.out.println("Tree Empty ");
        }else{
            while(temp!=null){
                if(data<temp.data){
                    if(data==temp.data){
                        System.out.println("Data Found:  ");
                        break;
                    }
                    temp=temp.left;
                }
                else{
                    if(data>temp.data){
                        if(data==temp.data)
                        System.out.println("Data Found");
                        break;
                    }
                   temp= temp.right;
                }
            }
            System.out.println("Data Not Found: ");
        }
    }
  

    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
         binarysearchtree bst= new binarysearchtree();
         int choice;
         System.out.println("Binary Search Operations");
         do{
            System.out.println("Ente the Choice \n1.insert \n2.preorder \n3.postorder \n4.inorder \n5.search");
            choice=sc.nextInt();
         switch (choice) {
            case 1:
                System.out.println("Enter the Data: ");
                 int data=sc.nextInt();
                 bst.insert(data);
                break;
            case 2:
                System.out.println("preorder:" );
                bst.preorder();
                break;
            case 3:
                System.out.println("PostOrder");
                bst.postorder();
                break;
            case 4:
                System.out.println("inorder: ");
                bst.inorder();
                break;
            case 5:
                System.out.println("Searched Element");
                int data1=sc.nextInt();
                bst.search(data1);
                break;         
            default:
                break;
         }
        }while(choice<=10);
    }
}
