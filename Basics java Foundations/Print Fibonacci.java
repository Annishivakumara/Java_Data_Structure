import java .util. Scanner ;

public class Main{

public static void main(String [] args)
{
Scanner sc = new Scanner (System.in);
int num=sc.nextInt();

int a=0;
int b=1;

for(int i=0;i<=num;i++){
    int c=a+b;
    System.out.println(" NUMBER Fibonacci IS   " +a);
   
    a=b;
    b=c;
}
}


}
