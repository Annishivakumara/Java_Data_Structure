import java.util.Scanner ;

public class Main{
        public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        int num=sc.nextInt();
        for(int i=0;i<= num;i++){
          int count=0;
        for(int div=2;div * div<=num; div++){
           if(num%div==0){
            count++;
            break;
        }
    } 
        if(count==0)
        System.out.println("PRIME NUMBER");
        else
          System.out.println(" NOT PRIME NUMBER");
        }
        }
}
