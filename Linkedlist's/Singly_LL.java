import java.util.*;
 class Node{
      int data;
      Node link;
 }
 public class LinkedList{
      Node node;
      Node first;
      public Node createNode(int data){
           node=new Node();
           node.data=data;
           node.link=null;
          return node;
      }
      public void insertFront(int data){
           node=createNode(data);
           if(first==null){
                first=node;
           }
           else{
                node.link=first;
                first=node;
           }
      }
      public void InsertEnd(int data){
           node= createNode(data);
           if(first==null){
                System.out.println("List is Empry");
           }
           else{
                Node temp= first;
                while(temp.link!=null){
                     temp=temp.link;
                }
                temp.link=node;
           }
      }
      public void InsertSpecific( int pos, int data){
           node= createNode(data);
           if(pos<1){
                System.out.println("Enter Valid Position");
           }
           else if(pos==1){
                 node.link=first;
                 first=node;
           }
           else{
               Node current=first;
               int count=1;
               while(current !=null && count<pos-1){
                    current=current.link;
                    count++;
               }
               if(current==null){
                    System.out.println("Postion wrong");
               }else{
               node.link=current.link;
               current.link=node;}
           }
      }
      public void DeleteFront(){
           if(first==null){
                System.out.println("List is Empty");
           }
           else{
                System.out.println("De;eted data   > "  +first.data );
               first=first.link;
           }
      }
      public void DeleteLast(){
         if(first==null){
             System.out.println("Null list");
         }
         if(first.link==null){
                System.out.println("Deleted at last" +first.data);
             first=null;
            
         }
         else{
             Node temp=first;
             while(temp.link.link!=null){
                 temp=temp.link;
             }
                
                 System.out.println("Deleted at last" +temp.link.data);
                  temp.link=null;
         }
         
     }
     public void DeletedAtSpecific(int pos){
          if(first==null){
               if(pos<1){
               System.out.println("Enter the Valid posiion");
               System.out.println("List is Null");
          }
          }
          else if(pos==1){
               System.out.println("Deleted data > "+first.data);
            first=first.link;
          }
          else{
               Node Current=first;
               int count=1;
               while(Current!=null && count< pos-1){
                    Current=Current.link;
                    count++;
               }
               if(Current ==null ||  Current.link==null){
                    System.out.println("Enter the valid postion");
               }
               else{
                    System.out.println("deleted pos"+pos+ " " +Current.link.data);
                    Current.link=Current.link.link;
               }
          }
     }
     public void Display(){
          if(first==null){
               System.out.println("List is Null");
          }
          else{
               Node temp=first;
               while(temp!=null){
                    System.out.println("data in list > "+temp.data);
                    temp=temp.link;
               }
          }
     }
      public static void main(String [] args){
       Scanner sc= new Scanner(System.in);
       int choice=0;
       LinkedList ll= new LinkedList();
       
       do{
    System.out.println("Enter the choice \n1.Insert Front \n2.Delete Fornt\n3.Display \n4.InsertAt end\n5.delete End\n6.Insert At specific \n7.Delete at Specific ");
            choice=sc.nextInt();
            switch(choice){
            case 1:
                 System.out.println("Enter the Data");
                 int data=sc.nextInt();
                 ll.insertFront(data);
                 break;
           case 2:
                ll.DeleteFront();
                break;
           case 3:
                ll.Display();
                break;
          case 4:
               System.out.println("Ente the data");
               int data1=sc.nextInt();
               ll.InsertEnd(data1);
               break;
          case 5:
               ll.DeleteLast();
               break;
          case 6:
               System.out.println("Enter the \n 1.Position \n 2.Data");
               int pos=sc.nextInt();
               int data2 =sc.nextInt();
               ll.InsertSpecific(pos,data2);
               break;
          case 7:
               System.out.println("Ente the \n 1.Position ");
               int pos2=sc.nextInt();
               ll.DeletedAtSpecific(pos2);
               break;
          default:
          System.out.println("Enter the valid Choice");
       }  
       }while(choice<=8);
       
      }
 }
