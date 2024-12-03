
import java.util.*;

public class  selection {
    int size;
    int [] arr;
    public selection(int size){
    this.size=size;
     arr= new int[size];
}
    public void read() {
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter the numbers:");
        for (int i = 0; i < arr.length; i++) { 
            arr[i] = sc.nextInt();
        }
    }

   public void select(){
    int min;
    for(int i=0;i<arr.length;i++){
        min=i;
        for(int j=i+1;j<arr.length;j++){
            if(arr[j]<arr[min]){
               min=j;
            }
        }
        int temp=arr[min];
        arr[min]=arr[i];
        arr[i]=temp;
    }
    System.out.println("Sorted Selection Array");
    for(int i:arr){
        System.out.print(i+" ");
    }
    System.out.println();
   }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the Size of the Array: ");
        int size=sc.nextInt();
        selection ls = new selection(size);
         ls.read(); 
         ls.select(); 
           }
}
