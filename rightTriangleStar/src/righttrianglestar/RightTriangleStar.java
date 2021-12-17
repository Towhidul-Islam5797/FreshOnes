package righttrianglestar;
import java.util.Scanner;
public class RightTriangleStar {
    public static void main(String[] args) {
        int rows;
        
        Scanner scan = new Scanner (System.in);
        System.out.print("Enter the number of rows : ");
        rows = scan.nextInt();
        
        for (int i = 0; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
        System.out.println();

        }
    
    }
}
