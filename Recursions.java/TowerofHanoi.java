import java.util.*;
public class Recursion{
       public void Toh(int n,int a, int b, int c){
           if(n==0){
               return ;
               
           }
           Toh(n-1,a,b,c);
           System.out.println("Move A "+a+"To" +c);
           Toh(n-1,b,a,c);
       }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        Recursion tr=new Recursion();
        tr.Toh(3,1,2,3);
        
    }
}
