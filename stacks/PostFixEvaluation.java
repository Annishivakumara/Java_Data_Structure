import java.util.*;
class Stack{
	int arr[];
	int top;
	int size;
	public  Stack(int size){
        this.size=size;
        top=-1;
        arr= new int[size];
        }
        public void Push(int data){
            if(top==size-1){
                System.out.println("Stack is Full");
            }else{
                top=top+1;
                arr[top]=data;
            }
        }
        public int pop(){
            int data=0;
            if(top==-1){
                System.out.println("Stack is Empty");
            }else{
                data=arr[top--];
            }
            return data;
        }
}
public class PostFixEvaluation {
    public static int compute(int op1, char ch, int op2){
     int  result=0;
     switch (ch) {
        case '+':result=op1+op2;
            break;
        case '-':result = op1 - op2;
        break;
        case '*': result=op1*op2;
        break;
        case '/':result = op1/op2;
        break;
     }
     return result;
    }
    public static void main(String [] args){
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter a postfix expression to evaluate");
      String postfix=sc.nextLine();
      int length=postfix.length();
      Stack st= new Stack(length);
    
      for (int i=0;i<postfix.length();i++){
          char ch= postfix.charAt(i);
          //Charcacter . is digit is a  method for chracking  digit or variabble
          if(Character.isDigit(ch-'0')){
            st.Push(ch-'0');
          }else{
            int op1=st.pop();
            int op2=st.pop();
            st.Push(compute(op1, ch, op2));
          }
      }
      int eval_result=st.pop();
System.out.println("PostFix Expression is for single digit >"+eval_result);
    }
}
