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
           public void push(int data){
           node= createNode(data);
           if(first==null){
                first=node;
           }else{
                node.rightLink=first;
                first=node;
           }
     }
     public void pop(){
          if(first==null){
               System.out.println("List is Empty");
          }else{
               System.out.println("Poped data is  Top data: " +first.data);
               first=first.rightLink;
          }
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
       public void Reverse(){
            
            if(first==null){
               first=last=node;
            }
            else{
            Node temp=first;
            while(temp.rightLink!=null){
                      push(temp.data);
                      temp=temp.rightLink;}
            }
            Node temp=first;
            while(temp!=null){
               
                 pop(temp.data);
                 temp=temp.rightLink;
            }
            }
       
         public void DeleteFront(){
                if(first==null){
                     System.out.println("Doubly Linked List is Nulll");
                }else{
                       Node temp=first;
                       System.out.println("Deleted Data At Specific >"+temp.data);
                      temp = temp.rightLink;
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
             System.out.println("Enter the Choice \n 1.Insert At First \n 2.DeleteFront \n 3.Display ");
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
               case 4:
                    dl.Reverse();
                    break;
               
             }
        }while(choice<=3);
             }
  }
