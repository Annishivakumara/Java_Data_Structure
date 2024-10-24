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
public class BinaryTree{
    Node node;
    Node root=null;
    public void insert(int data){
        node= new Node(data);
        Node temp=root;
        Node cur=temp;
        if(root==null){
            root=node;
        }else{
            while(temp!=null){
                cur=temp;
                if(data>temp.data){
                    temp=temp.rightlink;
                }else{
                    temp=temp.leftlink;
                }
            }
            if(data>cur.data){
                cur.rightlink=node;
            }else{
                cur.leftlink=node;
            }
        }
    }
public static void main(String args []){
BinaryTree bts= new BinaryTree();
bts.insert(10);
bts.insert(20);

}
}
