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
/*
---#or
       public class recursion{
    public static void shiftdisk(int n, char TA,char TB,char TC){
        if(n==1){
            System.out.println("Disk  1 is Shifted from "+TA+" To "+TC);
        }else{
            shiftdisk(n-1,TA,TC,TB);
            System.out.println("Movet to DISK  "+n+  " From " +TA+ " is Shifted to  "+TC);
            shiftdisk(n-1,TB,TA,TC);
        }
    }
    public static void main(String [] args){
        shiftdisk(3,'a','b','c');
    }
}
*/
