import  java.util.Scanner;

public class Recursion{
    public static  void  PrintNUmber(int i int name){
    if(i>name){
    return;
    }
    System.out.println(i);
    Recursion(i+1,name);
    }
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the NUmber: ");
        int name=sc.nextInt();
        PrintNumber(1,name);
    }
