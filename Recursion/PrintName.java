package  Recursion;

import java.util.*;
 public class PrintName{
 static int count=0;
 public static void PrintName1(int i, int n){
     if(i>n){
         return;
     }
     System.out.println("SHIVU");
  
     PrintName1(i+1,n);
        count++;
 }
 public static void main(String [] args){
     Scanner sc= new Scanner (System.in);
      PrintName obj= new PrintName();
      int n= sc.nextInt();
      PrintName1(1,n);
    }
 }