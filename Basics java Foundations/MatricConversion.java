import java.util.*;

public class MatricConversion{
    
       public static void main(String [] args){
         Scanner sc= new Scanner(System.in);
          System.out.println("Enter The Farenheit");
              double farenheit=sc.nextDouble();
             
             double celcius=(((farenheit-32)*5)/9);
              System.out.println("Converted Celcius "+celcius);
    }
}
