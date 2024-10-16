import java.util.*;

public class NamePrinting{
    public static void main(String [] args){
         
        Scanner sc= new Scanner(System.in);
          System.out.println("Enter The FullName");
             String fullName=sc.nextLine();
             String [] Name_Parts=fullName.split(" ");
             String first_Name=Name_Parts[0];
             String last_Name=Name_Parts[Name_Parts.length-1];
          System.out.println("First_Name "+first_Name);
        System.out.println("LastName "+last_Name);
    }
}
