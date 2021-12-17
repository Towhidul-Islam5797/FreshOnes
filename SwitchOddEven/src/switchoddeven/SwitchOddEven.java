package switchoddeven;
import java.util.Scanner;
public class SwitchOddEven {

    public static void main(String[] args) {
       Scanner scan = new Scanner (System.in);
       System.out.println("Enter A Number - ");
       int number;
       number = scan.nextInt();
       
       switch(number%2) {
           case 0 :
               System.out.println(number+ " is a even number ");
               break;
           case 1 : 
               System.out.println(number+ " is a odd number ");
       }
    }
    
}
