package farmerlist;
import java.util.Scanner;
public class FarmerList {
    public static void main(String[] args) {
        int chicken, cow , pig ;
        Scanner scan = new Scanner (System.in);
        
        System.out.println("This is a farmer list");
        System.out.println();
        
        System.out.print("Enter the number of chicken : ");
        chicken = scan.nextInt();
        int a = chicken * 2;
        System.out.println("The number of the leg of chickens : " + a);
        
        System.out.println();
        
        System.out.print("Enter the number of : ");
        cow = scan.nextInt();
        int b = cow * 4;
        System.out.println("The number of the leg of cows : " + b);
        
        System.out.println();
        
        System.out.print("Enter the number of pigs : ");
        pig = scan.nextInt();
        int c = pig * 4;
        System.out.println("The number of the leg of pigs : " + c);
        
        System.out.println("The total number of the legs : chicken =" + a + " cows = " + b + " pigs = " + c);
    }
}
