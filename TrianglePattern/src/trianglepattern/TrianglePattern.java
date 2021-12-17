package trianglepattern;

import java.util.Scanner;

public class TrianglePattern {
    public static void main(String[] args) {
         Scanner scan = new Scanner (System.in);
        
        int rows;
        System.out.println("Enter a Rows number for the pattern");
        rows = scan.nextInt();
        System.out.println("\n");
        
        for (int i = rows; i >= 1; --i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print(j+" ");
            }
        System.out.println();
        }
    }
    
}
