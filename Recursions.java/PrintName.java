 
import java.util.*;
 class Recursion{
 static int count=0;
 public static void PrintName(int i, int n){
     if(i>n){
         return;
     }
     System.out.println("SHIVU");
  
     PrintName(i+1,n);// 
        count++;
 }
 
 public static void main(String [] args){
     Scanner sc= new Scanner (System.in);
      Recursion obj= new Recursion();
      int n= sc.nextInt();
      PrintName(1,n);
 }
 }
