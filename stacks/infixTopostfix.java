import java.util.*;
class stack2{
    int size;
    char [] ch1;
    int top;
    public stack2(int size){
        this.size=size;
        ch1=new char[size];
        top=-1;
    }
public void  push(char ch){
    if(top==size-1){
        System.out.println("Stack is full");
    }else{
        top=top+1;
        ch1[top]=ch;
    }
}
public char pop(){
    char data=' ';
    if(top==-1){
        System.out.println("Stack Underflow");
    }else{
     data=ch1[top--];     
    }
    return data;
}

public char topElement(){
    char data1 =' ';
    if(top==-1){
       return '\0';
    }
     return ch1[top];
}
public boolean isEmpty(){
return top==-1;
    }
}


public class PostFix{
    public static  int precedence(char ch){
     int prec=0;
     switch (ch) {
        case '+':
        case '-':
           prec=1;
            break;
        case '*':
        case '/':
           prec=2;
            break;
        case '^':
           prec = 3;
            break;
     }
     return prec;
    }

    public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            char ch;
          
            String postfix="";
            //Above Decalation is for Next Code Works and Those are required for Some operations
            System.out.println("Enter the infix operation");
            String infix=sc.nextLine();// a+b;
            int size=infix.length(); 
            stack2 st= new stack2(size);// Character Array size Giving  to  class 
        for(int i=0;i<infix.length();i++){  
             ch=infix.charAt(i);
             
             // return's the character from the specified  character
             // ch is storing  single charcter 
             if(ch>=97 && ch<=122) // we can also use if(character.isAlphabetic(ch))
             {
              postfix+=ch;
             }else{
                //if the entered input is Operator  then we need to perform 
                //some Stack push and pop based on precedence of operator
                 if(!st.isEmpty() && precedence(st.topElement())>precedence(ch)){
                 postfix=postfix+st.pop();
                 }else{
                  st.push(ch);
                 }
             }
             while (!st.isEmpty()) {
                postfix += st.pop();
            }
            System.out.println("Infix to postFix Expression is "+postfix);
            }}}
