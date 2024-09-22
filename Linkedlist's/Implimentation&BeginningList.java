import java.util.*;
class Node{
     int data;
     Node link;
}
public class LinkedList{
     Node node;
     Node first;
     public void InsertFirst(int data){
          node= new Node();
          node.data=data;
          node.link=null;
          if(first==null){
               first=node;
          }
          else{
               node.link=first;
               first=node;
          }
     }
     public void DeleteFirst(){
          if(first==null){
               System.out.println("List Is Empty");
          }
          else{
        Node del_data=first;
                    System.out.println("Deleted data->"+del_data.data);
                    del_data=del_data.link;
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
              System.out.println("Enter the choice \n 1.Insert At first \n 2.Delete at first \n 3.Display List Elemnts ");   
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
          }
         }while(choice<=5);
     }
}
