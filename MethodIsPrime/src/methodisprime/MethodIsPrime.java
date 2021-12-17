package methodisprime;
import java.util.Scanner;
public class MethodIsPrime {
    private static boolean isPrime(int a) {
            boolean Checker = true;
            for (int i = 2; i < a; i++) {
                if (a % i == 0 ||a == 0 || a == 1 ) {
                    Checker = false;
                    break;
                }
            }
            return Checker;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print("Entter a number to check prime : ");
        int num = scan.nextInt();
        System.out.println("The number " + num + " : "+ isPrime(num));
        
        System.out.print("Primes from 1 to 500\n");
        for (int i = 1; i <= 500; i++){
            
                if (isPrime(i)){
                    System.out.print(i + " , ");
                }
            }
    }
    
}
