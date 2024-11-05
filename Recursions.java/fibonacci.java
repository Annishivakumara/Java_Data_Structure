
 public class fin{ 
    public static int f(int n){
        if(n==0 || n==1){
            return 1;
        }
        return f(n-1)+f(n-2);
    }
    public static void main(String[] args) {
         int n=9;
         System.out.println("FIb "+n+"" );
         for(int i=0;i<n;i++){
            System.out.println("Fib "+f(i));
         }
    }
}
