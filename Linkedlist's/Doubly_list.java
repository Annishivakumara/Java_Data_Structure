import java.util.*;
class Node{
     int data;
     Node leftLink ;
     Node rightLink;
}
public class DoublyLinkedLIst{
     Node node;
     Node first, last;
     public Node createNode(int data){
           node= new NOde();
           node.data=data;
           node.leftLink=null;
           node.rightLink=null;
           return node;
     }
     //Insert at Front
     public void InsertFront(int data){
          node = createNode(data);
           if(first==null){
                first=last=node;
           }else{
                node.leftLink=first;
               first.rightLink=node;
               first=node;
           }
     }
     //Insert At Last
     public void InserLast(int data){
          node= createNode(data);
          if(last==null){
               first=last=node;
          }else{
               node.rightLink=last;
               last.leftLink=node;
               last=node;
          }
     }
     //Insert At SpecificPosition
     public void InsertAtspecifc(){
          node=createNode(data);
          if()
     }
     //Delete at first
     public void DeleteFront(){
          if(first==null){
               System.out.println("DoublyLinkedLIst is Null");
          }else{
               System.out.println("Deleted Data At Front >> " +first.data);
               first.leftLink=null;
          }
     }
     //Delete at last
     public void DeleteLast(){
          if(last==null){
               System.out.
               println("DoublyLinkedLIst is Null");
          }else{
               System.out.println("Deleted data At Last >> "+last.data);
               last.rightLink=null;
          }
     }
     //Delete at SpecificPosition
     public void DeleteAtspecific(){
          
     }
     public void Display(){
          
     }
     public static void main(String [] args){
          Scanner sc = new Scanner (System.in);
          DoublyLinkedLIst dl= new DoublyLinkedLIst();
         
          int choice=0;
     do{
          
          System.out.println("Enter the Choice  1.InsertFront \n 2.InsertLast \n 3.InsertAtspecifc \n 4.DeleteFront \n 4.DeleteLast \n 5.DeleteAtspecific \n 6.Display");
        choice =sc.nextInt();
          switch (choice) {
               case 1:
                    System.out.println("Enter the  First data");
                    int data1=sc.nextInt();
                    dl.InsertFront(data);
                    break;
               case 2:
                    System.out.println("Enter the  Last data ");
                    int data2=sc.nextInt();
                    dl.InsertLast(data);
                    break;
               case 3:
                    System.out.println("Enter The InsertAtspecifc 1. Position \n 2. Data");
                    int Pos=sc.nextInt();
                    int data3=sc.nextInt();
                    dl.InsertAtspecifc(Pos, data3);
                    break;
               case 4:
                    dl.DeleteFront();
                    break;
               case 5:
                    dl.DeleteLast();
                    break;
               case 6:
                    System.out.println("Enter DeleteAtSpecific 1.position  ");
                    int pos=sc.nextInt();
                    dl.DeleteAtspecific(pos);
                    break
               case 7:
                    dl,Display();
                    break;
          }
     }while(choice<=10);
}
