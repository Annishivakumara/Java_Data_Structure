import java.util.*;
class Node{
     int data;
     Node link;
}
public class LinkedList{
     Node node;
     Node first;
     public Node createNode(int data){
          node= new Node();
          node.data=data;
          node.link=null;
          return node;
      }
     public void InsertFirst(int data){
          node=createNode(data);
          if(first==null){
               first=node;
          }
          else{
               node.link=first;
               first=node;
          }
     }
     public void InsertLast(int data){
       node=createNode(data);
         if(first==null){
             first=node;
         }
         else{
             Node End = first;
             while(End.link!=null){
                 End=End.link;
             }
             End.link=node;
         }
     }
     public void InsertSpecific(int position , int data){
         node = createNode(data);
         if(position ==  1){
             node.link=first;
             first=node;
         }
         else{
             Node current=first;
             int count=1;
             while(current!=null && count<position-1){
                 current=current.link;
                 count++;
             }
             node.link=current.link;
             current.link=node;
         }
     }
      //Deleting from Beginning of the list
     public void DeleteFirst(){
          if(first==null){
               System.out.println("List Is Empty");
          }
          else{
       
                    System.out.println("Deleted data->"+first.data);
                    first=first.link;
          }
     }
     public void DisplayList(){
          if(first==null){
               System.out.println("List is Empty ");
          }
          else{
               Node temp=first;
               while(temp!=null){
                    System.out.println("Data In the List->" +temp.data );
                    temp=temp.link;
               }
          }
     }
     public static void main(String [] args){
          Scanner sc= new Scanner(System.in);
          LinkedList  ll= new LinkedList();
          int choice=0;

         do{ 
              System.out.println("Enter The Choice \n 1.Insert At first \n 2.Delete at fir\n 3.Display  List Elemnts \n 4.Insert At Last \n 5.Inert at specific");   
            choice = sc.nextInt();
          switch(choice){
           
            case 1: 
                 System.out.println("Enter the data");
                 int data=sc.nextInt();
                 ll.InsertFirst(data);
                 break;
            case 2:
                 ll.DeleteFirst();
                 break;
             case 3:
                  ll.DisplayList();
                  break;
            case 4:
                System.out.println("Enter Last Data");
                int data1=sc.nextInt();
                  ll.InsertLast(data1);
                  break;
            case 5:
                System.out.println("Enter the  1.  Position  2. and data");
                int position=sc.nextInt();
                int data2=sc.nextInt();
                ll.InsertSpecific(position,data2);
                break;
          }
         }while(choice<=5);
     }
}
