import java.util.*;
class Node{
     int data;
     
     Node link;
}
public class LinkedList{
     Node node;
     Node first;
     public void IF(int data){
          node = new Node();
          node.data=data;
          node.link=null;
          if(first==null){
               first = node;
          }
          else{
               node.link=first;
               first=node;
          }
     }
      public void IE(int data){
          Node newNode=new Node();
          newNode.data=data;
          newNode.link=null;
          if(first==null){
               first=newNode;
          }
          else{
               Node temp=first;
               while(temp.link!=null){
                    temp=temp.link;
                      }
                    temp.link=newNode;
               }
          }
     public void display(){
          Node temp=first;
          if(first==null){
               System.out.println("NUll");
          }
          else{
               while(temp!=null){
                    System.out.println("Temp data"+temp.data);
                    temp=temp.link;
               }
          }
     }
     public void Delete(){
          if(first==null){
               System.out.println(" null");
          }
          else{
               System.out.println("First data deleted "+first.data);
               first=first.link;
          }
     }

     public static void main(String [] args){
          Scanner sc =  new Scanner (System.in);
          
          int choice=0;
          LinkedList ls= new LinkedList();
          
         do{
              System .out.println("Enter the case 1 or 2 and 3 and 4");
              choice = sc.nextInt();
              switch(choice){
              
              case 1:
                   System.out.println("ENter the data");
                   int data=sc.nextInt();
                   ls.IF(data);
                   break;
             case 2:
               ls.Delete();
               break;
             case 3:
               ls.display();
               break;
           
          case 5:
               System.out.println("Exiting..");
               break;
         
         }
         }while(choice<=5);
}}
