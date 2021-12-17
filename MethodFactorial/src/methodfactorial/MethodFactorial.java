package methodfactorial;
import java.util.Scanner;
public class MethodFactorial {
    public static void Factorial(int a)  {
        int b = 1;
        for (int i = 1 ; i <= a ; ++i) {
            b = b *i;
        }
    System.out.println("The factorial of the number " + a + " is " + b);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print("Enter a number : ");
        int num = scan.nextInt();
        Factorial(num);
    }
    
}
