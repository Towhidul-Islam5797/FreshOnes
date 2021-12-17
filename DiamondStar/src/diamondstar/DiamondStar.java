package diamondstar;
import java.util.Scanner;

public class DiamondStar {

    public static void main(String[] args) {
        int num ,m = 0,n;
        
        Scanner scan = new Scanner (System.in);
        System.out.print("Enter the size of the diamond :");
        num = scan.nextInt();
       
        
        for (m = 1; m <= num; m++) {
 
            for (n = 1; n <= num - m; n++) {
                System.out.print(" ");
            }
 
            for (n = 1; n <= m * 2 - 1; n++) {
                System.out.print("*");
            }
            System.out.println();
        }
 
        for (m = num - 1; m > 0; m--) {
 
            for (n = 1; n <= num - m; n++) {
                System.out.print(" ");
            }

            for (n = 1; n <= m * 2 - 1; n++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
    
}
