import java.util.*;
public class Queue{
int front , rear, size;
int [] arr;
    public Queue(int size){
        this.size=size;
        arr=new int[size];
        front=-1;
        rear=-1;
    }
public void enque(int data ){
    if(rear==size-1){
        System.out.println("Queue becoming Full");
    }
    else if(rear==-1 && front==-1){
        rear=front=0;
    }
    else{
        rear+=1;
        arr[rear]=data;
    }
}
public void Deque(){
    if(rear==-1 && front==-1){
        System.out.println("Queue is Empty");
    }
    else if(rear==front){
        front=rear=-1;
    }
    else{
      
        
         front++;
          System .out.println("deleted queue is"+arr[front]);
    }

}

public  void Display(){
    if(rear==-1 && front==-1){
        System .out.println("Queue is empty");
    }
    else {
        for(int i=front;i<=rear;i--){
        System.out.println(i);
        }
    }
}
    public static void main(String [] args){
        Scanner sc= new Scanner(System .in);
        int size=sc.nextInt();
        Queue obj= new Queue(size);
        
        int choice;
          
        do{
            System.out.println("Enter the choice");
            choice =sc.nextInt();
            switch (choice) {
               case 1:
                   System.out.println("enter the data");
                   int data = sc.nextInt();
                   obj.enque(data);
                    break;
                case 2:
                  obj.Deque();
                    break;
                case 3:
                    obj.Display();
                    break;
                case 4:
                default:
                      System.out.println();
            }
        }while(choice<=4);
        
    }
}
