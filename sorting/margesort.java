import java.util.*;
class sort{
    public static void margesort1(int arr[] , int low, int high){
        if(low>=high){
            return ;
        }
        int mid=(low+high)/2;
        margesort1(arr,low, mid);
        margesort1(arr,mid+1,high);
        marge(arr, low,mid, high);
    }
    public static void marge(int arr[], int low, int mid , int high){
    ArrayList <Integer>  temp= new ArrayList<>();
    int left=low;
    int right=mid+1;
    while(left<=mid && right<=high ){
        if(arr[left]<=arr[right]){
            temp.add(arr[left]);
            left++;
        }else{
            temp.add(arr[right]);
            right++;
        }
    }
    while(left<=mid){
        temp.add(arr[left]);
        left++;
    }
    while(right<=high){
        temp.add(arr[right]);
        right++;
    }
    for(int i=low;i<=high;i++){
        arr[i]=temp.get(i-low);
    }
} 
}
public class margesort {
 static    int [] arr;
    public  margesort(int size){
        arr= new int[size];
    }
    public  void read(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter The Array Elements");
    for(int i=0;i<arr.length;i++){
       arr[i]=sc.nextInt();
    }
    System.out.println();
    }
    public static void main(String [] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter The Array Size: ");
    int size= sc.nextInt();
    margesort mg= new margesort(size);
    mg.read();
    sort.margesort1(arr, 0, size-1);
    for (int i = 0; i <size; i++) {
        System.out.print(arr[i] + " ");
    }
    System.out.println();
    sc.close();
    }
}
