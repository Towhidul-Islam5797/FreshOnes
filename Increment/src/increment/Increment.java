package increment;
import java.util.Scanner;
public class Increment {
    public static void main(String[] args) {
        int n; 
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Enter a number : ");
        n = scan.nextInt();
        
        n = increment(n);
        System.out.println("The number : " + n);
    }
    public static int increment(int a) {
        a++;
        return a;
    }
}
