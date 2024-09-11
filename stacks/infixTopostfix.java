import java.util.*;
import java.util.Stack;
 public class Main{
        public int prec(char c){
            if(c=='^')
            {
                return 3;
            }
            else if(c=='*' && c=='/'){
                return 2;
            }
            else if(c=='+' && c=='-'){
                return 1;
            }
            else{
                return -1;
            }
        }
        
 public String infixTopostfix(String sh){
              Stack <Character> st;
              String res;
       for(int i=0;i<sh.length;i++){
           if(sh[i]>='a' && sh[i]<='z'|| sh[i]>='A' && sh[i]<='Z'){
               res=res+sh[i];
           }
           else if(sh[i]=='('){
               st.push(sh[i]);
           }
           else if(sh[i]==')'){
               while(!sh.empty() sh.top()!='('){
                   res=res+st.top();
               }
               if(!isEmpty()){
                   st.top();
               }
           }
           else{
       }
 }
 
 public static void main(String [] args){
     
 }
 }
