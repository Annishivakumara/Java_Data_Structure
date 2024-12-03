import java.util.*;

public class insertion{
    int size;
    int [] arr;
    public insertion(int size){
        this.size=size;
       arr= new int[size];
    }
    public void read(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number: ");
       for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
       }
        }
    
    public void insert(){
        for(int i=1;i<arr.length;i++){
           int data=arr[i];
           int j=i-1;
           while(j>=0 && arr[j]>data){
           if(arr[j]>data){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=data;
          }
        }
        System.out.println("Sorted Array");
        for(int s:arr){
            System.out.print(s+" ");
        }
        System.out.println();
    }

        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter The Size Of the Arrsy: ");
            int size=sc.nextInt();
            insertion is= new insertion(size);
            is.read();
            is.insert();
        }
}
