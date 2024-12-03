
package  sorting;
import java.util.*;

public class  selection {
    int arr[] = new int[5];

    public void read() {
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter the numbers:");
        for (int i = 0; i < arr.length; i++) { 
            arr[i] = sc.nextInt();
        }
    }

   public void select(){
    int min;
    for(int i=0;i<=arr.length;i++){
        min=i;
        for(int j=i+1;j<=arr.length;j++){
            if(arr[j]<arr[min]){
                arr[min]=arr[j];
            }
        }
        int temp=arr[min];
        arr[min]=arr[i];
        arr[i]=temp;
    }
   }

    public static void main(String[] args) {
        selection ls = new selection();
        ls.read();  
        Scanner sc = new Scanner(System.in);  
        //  System.out.println("Enter data to search:");
        // int data = sc.nextInt();
        ls.select();  
    }
}
