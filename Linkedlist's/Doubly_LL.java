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
       public void InertLast(int data){
      node=createNode(data);
            if(last==null){
                first=last=node;
            }else{
                 node.leftLink=last;
                 last.rightLink=node;
                 last=node;
            }
       }
       public void InsertAtSpecific(int data , int pos){
           node = createNode(data);
            if(first==null){
                if(pos==1){
                 first=last=node;
                }else{
               System.out.println("List is Empty");
               }
            }
            else if(pos==1){
               node.rightLink=first;
               first.leftLink=node;
               first=node;
            }else{
               Node temp=first;
               int cnt=1;
               while(temp!=null && cnt<pos-1){
                  temp=temp.rightLink;
                  cnt++;
               }
               if(temp==null){
                    System.out.println("Inavalid List");
               }
              node.leftLink=temp;
              node.rightLink=temp.rightLink;
              if(temp.rightLink!=null)
              temp.rightLink.leftLink=node;
            else{
                 last=node;
            }
              temp.rightLink=node;
            }
       }
       public void DeleteAtSpecific(int pos){
            if(first==null){
               System.out.println("List is Null");
            }else if(pos==1){
               System.out.println("Deleteed At Position 1 "+first.data);
               // Additional
               first=first.rightLink;   
               if(first!=null){//no nessary condition for understanding pourpose
                    first.leftLink=null;
               }else{
                    last=null;
               }
            }
            else{
               Node temp=first;
               int cnt=1;
               while(temp!=null && cnt<pos){
                 temp=temp.rightLink;
                 cnt++;
                 }
                 if(temp==null){
                      System.out.println("Invalid Position.. ");
                 }
                 System.out.println("Deleted data:  >>" +temp.data);
                   if(temp.leftLink!=null){
                        temp.leftLink.rightLink=temp.rightLink;
                   }
                  if(temp.rightLink!=null){
                     temp.rightLink.leftLink=temp.leftlink;
                  }
                  if(temp==last){
                     last=last.leftLink;
                 }
            }    
             }
           public void DeleteLast(){
                if(last==null){
                     System.out.println("List is Null");
                }else{
                    Node temp=last;
                    System.out.println("Deleted Data >>"+last.data);
                    temp=temp.leftLink;
                    if(temp!=null){
                    temp.rightLink=null;
                    }else{
                    first=null;
                    }
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
             System.out.println("Entee the Choice \n 1.InsertFront \n 2.InertLast \n 3.InsertAtSpecific \n 4.DeleteAtSpecific \n 5.DeleteLast \n 6.DeleteFront   \n 7.Display");
             choice=sc.nextInt();
             switch(choice){
               case 1:
                        System.out.println("Enter the  Inserting Front Data");
                        int data=sc.nextInt();
                        dl.InsertFront(data);
                        break;
               case 2:
                        System.out.println("Enter the Inserting Last Data");
                        int data1=sc.nextInt();
                        dl.InertLast(data1);
                        break;
               case 3:
                        System.out.println("Enter the InsertingAt Specific Last  1.Data \n 2.Position");
                        int data3=sc.nextInt();
                        int pos= sc.nextInt(); 
                        dl.InsertAtSpecific(data3, pos);
                        break;
               case 4:
                        int pos1=sc.nextInt();
                        dl.DeleteAtSpecific(pos1);
                        break;
               case 5:
                        dl.DeleteLast();
                        break;
               case 6: 
                         dl.DeleteFront();
                         break;
               case 7:
                        dl.Display();
                        break;
             }
        }while(choice<=15);
       }
  }
