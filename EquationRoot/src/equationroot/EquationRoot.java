package equationroot;

import java.util.Scanner;

public class EquationRoot {
    public static void main(String[] args) {
        int a, b, c;  // ax^2 + bx + c      
        double discriminant, root1, root2;
        Scanner scan = new Scanner (System.in);
        
        System.out.println ("ax^2 + bx +c");
        
        System.out.print ("a = ");
        a = scan.nextInt();
        
        System.out.print ("b = ");
        b = scan.nextInt();
        
        System.out.print ("c = ");
        c = scan.nextInt();      // Use quadratic formula to compute the roots.
        
        discriminant = Math.pow(b, 2) - (4 * a * c);
        
        root1 = ((-1 * b) + Math.sqrt(discriminant)) / (2 * a);
        root2 = ((-1 * b) - Math.sqrt(discriminant)) / (2 * a);
        System.out.println ("Root #1: " + root1);
        System.out.println ("Root #2: " + root2);
    }
    
}
