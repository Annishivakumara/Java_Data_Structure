import java.util.*;
class Node{
     int data;
     Node link;
}
public class QueueUsingSlist{
       Node node;
       Node first;
       public Node createNode(int data){
            node = new Node();
            node.data=data;
            node.link=null;
            return node;
       }
       public void enqueue(int data){
            node= createNode(data);
                 if(first==null){
                      first=node;
                 }else{
                      first.link= node;
                      first=node;
            }
       }
       public void Dequeue(){
            if(first==null){
               System.out.print("Queue is Empty");
               
            }else if(first.link==null){
                 System.out.print("Delted data "+first.data);
                 first=null;
            }else{
                 Node temp=first;
                 while(temp.link.link!=null){
                      temp=temp.link;
                 }
                 System.out.println("Data in the Queue: "+temp.link.data);
                 temp.link=null;
            }
       }
       public void display(){
            if(first==null){
                 System.out.println("Queue is Empty");
            }else{
            Node temp=first;
            while(temp!=null){
                 System.out.println("Data in the Queue: "+temp.data);
                 temp=temp.link;
            }
       }
       }
        
       public static void main(String [] args){
            Scanner sc= new Scanner(System.in);
            int choice;
            QueueUsingSlist qd= new QueueUsingSlist();
            do{
                 System.out.println("Enter the Choice");
                 choice=sc.nextInt();
                 switch (choice) {
                      case 1:
                           System.out.println("Enter the data");
                           int data=sc.nextInt();
                           qd.enqueue(data);
                           break;
                      case 2:
                           qd.Dequeue();
                           break;
                     case 3:
                          qd.display();
                          break;
                 }
            }while(choice<=10);
            
       }
}
