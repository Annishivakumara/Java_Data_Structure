
import java.util.*;
public class Main{
    int [] arr=new int[7];
    
    public void read() {
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter the numbers:");
        for (int i = 0; i < arr.length; i++) { 
            arr[i] = sc.nextInt();
        }
    }
    public void insert(){
        for( int i=1;i<arr.length;i++){
            int key = arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                if(arr[j]>key){
                    arr[j+1]=arr[j];
                    j--;
                }
                arr[j]=key;
            }
        }
    }
    public static void main(String[] argfs){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        Main m= new Main();
        m.read();
        m.insert();
    }
}
