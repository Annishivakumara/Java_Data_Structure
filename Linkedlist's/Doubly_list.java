
import java.util.*;
class Node{
    int data;
    Node leftlink;
    Node rightlink;
}
public class LinkedList {
       Node node;      // pointer
       Node first, last;
    public  Node createNode(int data){
       node=new Node();
        node.data=data;
        node.leftlink=null;
        node.rightlink=null;
        return node;
    }
    public void InsertFront(int data){
        node =createNode(data);
        if(first==null){
            first=node;
            last=node;
        }else{
            node.leftlink=first;
            first=node;
            first.rightlink=node;
        }
    }
    public void DeleteFront(){
        if(first==null && last==null){
            System.out.println("List is Empty");
        }else{
            Node temp=first;
            while (temp.rightlink!=null) {
                temp=temp.rightlink;
            }

        }
    }
    public void InsertEnd(int data){
        node =createNode(data);
        
    }
    public void Display(){
        if(first==null){
            System.out.println("List is Empty");
        }else{
            Node temp=first;
           while(temp!=null){
            System.out.println("data in the List > "+temp.data);
            temp=temp.leftlink;
           }
        }
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        LinkedList ls= new LinkedList();
        int choice;
        do{
            choice=sc.nextInt();
            System.out.println("Enter the valid Option 1.InsertFront 2. InsertEnd");
            switch (choice) {
                case 1:
                    
                    break;
            
                default:
                    break;
            }
        }while(choice<=5);
    }
}
