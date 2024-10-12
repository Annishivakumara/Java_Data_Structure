import java.util.*; // importing java pacakage 

public class stack {
    int size ; // size  of the array declaration
    int top;  //  top  represents index value o fthe array
    int[] number ;
    public stack(int size){
        this.size=size;
        top=-1;
        number= new int[size];
    }
    public boolean isFull(){
        if(top==size-1){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isEmpty(){
        if(top==-1){
            return true;
        }
        else{
            return false;
        }
    }
    public void push(int data){
        if(isFull()){
            System.out.println("Stack is Full");
        }
        else{
           top++;
           number[top]=data;
           System.out.println("Push data  " +data);
        }
    }
    public int  pop(){
        int del_data=0;
        if(isEmpty()){
            System.out.println("stack is Empty");
        }
        else{
        
           del_data = number[top];
           top--;
           System.out.println("Deleted data ->"+del_data);
        }
        return del_data;
    } 
    public int Top(){
       return number[top]; 
    }
    
    public void display(){
        if(top==-1){
            System.out.println("Stack is Over flow");
        }
        else{
             for (int i = 0; i <= top; i++) {
                System.out.println(number[i]);
            }
        }
    }
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Stack Operations");
        System.out.println("Enter the size of the Stack");
        int size=sc.nextInt();
        stack st= new stack(size);
        int choice=0;
        do{
             System.out.println("Enter  the  Choice  \n1. Push  \n2. Pop  \n3. Disply");
            choice=sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter The Data");
                    int data = sc.nextInt();
                    st.push(data);
                    break;
                case 2:
                  System.out.println(st.pop());
                    break;
                 case 3:
                    st.display();
                    break;
                case 4:
                    st.Top();
                    break;
                     default:
                     System.out.println("Please Enter valid choice");
            }
        }while(choice<=4);    
    }
}
