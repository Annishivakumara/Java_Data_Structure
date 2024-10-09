import java.util.*;
public class Recursion{
    public static void PrintNumber(int i, int num){
        if(i>num){
            return;
        }
        System.out.println(i);
        PrintNumber(i+1,num);
        
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num= sc.nextInt();
        PrintNumber(1,num);
    }
}
