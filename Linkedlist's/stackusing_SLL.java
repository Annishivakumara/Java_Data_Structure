import java.util.*;
class Node{
     int data;
     Node link;
}
public class  StackUsingSinglyList{
     Node node ;
     Node first;
     public Node createNode(int data){
          node=new Node();
          node.data=data;
          node.link=null;
          return node;
     }
     public void push(int data){
           node= createNode(data);
           if(first==null){
                first=node;
           }else{
                node.link=first;
                first=node;
           }
     }
     public void pop(){
          if(first==null){
               System.out.println("Stack  is Empty");
          }else{
               System.out.println("Poped data is  Top data: " +first.data);
               first=first.link;
          }
     }
     public void Display(){
          if(first==null){
               System.out.println("Empty Stack.. Sorry..Error");
          }else{
               Node temp=first;
               while(temp!=null){
                    System.out.println("Stack Data: " +temp.data);
                    temp=temp.link;
               }
          }
     }
     public int TopElement(){
          return first.data;
     }
     
public static void main(String [] args){
     Scanner sc = new Scanner (System.in);
     StackUsingSinglyList sd= new StackUsingSinglyList();
     int choice;
     do{
          System.out.println("Enter the Choice ");
          choice=sc.nextInt();
     switch(choice){
          case 1:
               System.out.println("Enter the Data");
               int data= sc.nextInt();
               sd.push(data);
               break;
          case 2:
               sd.pop();
               break;
          case 3:
               sd.Display();
               break;
          case 4:
               System.out.println("Top data In The List"+sd.TopElement());
               break;
     }
}while(choice<=10);
}}
