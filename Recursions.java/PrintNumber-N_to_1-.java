import java.util.*;
public class Recursion{
    public static void PrintNumber(int i, int num){
        if(num<i){
            return;
        }
        System.out.println(num);
        PrintNumber(i,num-1);
        
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num= sc.nextInt();
        PrintNumber(1,num);
    }
}

