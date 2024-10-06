import java.util.*;
class Node{
     int data;
     Node leftLink;
     Node rightLink;
}
  public class DoublyLinkedList{
       Node node;
       Node first , last;
       public Node createNode(int data){
            node=new Node();
            node.data=data;
            node.leftLink=null;
            node.rightLink=null;
           return node;
       }
       public void InsertFront(int data){
           node= createNode(data);
            if(first==null){
                 first=last=node;
            }else{
                 node.rightLink=first;
                 first.leftLink=node;
                 first=node;
            }
       }
         public void DeleteFront(){
                if(first==null){
                     System.out.println("Doubly Linked List is Nulll");
                }else{
                       Node temp=first;
                       System.out.println("Deleted Data At Specific >"+temp.data);
                      temp= temp.rightLink;
                      if(temp!=null){
                       temp.leftLink=null;
                      }else{
                           last=null;
                      }
                }
           }
              public void Display(){
                if(first==null){
                     System.out.println("Doubly List is Empty");
                }else{
                  Node temp=first;
                  while(temp!=null){
                       System.out.println("Data in the List >>"+temp.data);
                       temp=temp.rightLink;
                  }
                }
           }
             public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        DoublyLinkedList dl= new DoublyLinkedList();
        int choice=1;
        do{
             System.out.println("Enter the Choice \n 1.Insert At First \n2DIsplay \n 3.DeleteFron ");
             choice=sc.nextInt();
             switch(choice){
                  case 1:
                       System.out.println("Enter the Data");
                       int dat=sc.nextInt();
                       dl.InsertFront(dat);
                       break;
                  case 2:
                       dl.DeleteFront();
                       break;
                 case 3:
                      dl.Display();
                      break;
                    default:
                    System.out.println("Enter the VSlid ");
                    
             }
        }while(choice<=3);
             }}
