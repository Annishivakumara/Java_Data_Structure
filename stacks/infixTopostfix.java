import java.util.*;
class stack{
     char ch[];
     int top;
     public stack(int size){
          ch=new char[size];
          top=-1;
     }

     public void push(char c){
          ch[++top]=c;
     }
     public char pop(){
          return ch[top--];
     }
public char topElement() {
        return ch[top];
    }
public  boolean isEmpty(){
     return top==-1;
}
}
public class InfixToPostfix{
     public static int precedenc(char ch){
          int prec=0;
          switch(ch){
               case '+':
               case '-':
                    prec=1;
                    break;
               case '*':
               case '/':
                    prec=2;
                    break;
               case '^':
                    prec=3;
                    break;
          }
          return prec;}
     public static void main(String [] args){
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the Infix Expression: ");
        
         String postfix="";
         char ch;
         String Infix=sc.nextLine();
         int length= Infix.length();
          stack st= new stack(length);
         st.push('#');
         for(int i=0;i<Infix.length();i++){
              ch=Infix.charAt(i);
              if(Character.isAlphabetic(ch) || Character.isDigit(ch) || (ch>=97 && ch<=122)){
                   postfix+=ch;
              }else if(ch=='('){
                   st.push(ch);
                   }else if(ch==')'){
                     while(st.topElement()!='('){
                         postfix+=st.pop(); 
                     }
                    st.pop();
                   } else {
                   while(precedenc(st.topElement()) >= precedenc(ch)){
                        postfix+=st.pop();
                   }
                 st.push(ch);}
              }
              while(st.topElement()!='#'){
                   postfix+=st.pop();
              }
              System.out.println("InfixToPostfix Expression:  "+postfix);
         }
}
