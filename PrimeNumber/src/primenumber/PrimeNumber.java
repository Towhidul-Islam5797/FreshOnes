package primenumber;

import java.util.Scanner;

public class PrimeNumber {
    
    public static void main(String[] args) {
        
        Scanner Scan = new Scanner (System.in);
        System.out.print("Enter a Integer - ");
        
        int number ;
        number = Scan.nextInt();
        
        if(number == 0 || number == 1) {
            System.out.println(number+ " is not a prime number.");
        }
        if(number == 2 || number == 3 ) {
            System.out.println(number+ " is a prime number.");
        }
        else {
            for(int i = 2 ; i <= number/2; i++) {
                
                if( number % i == 0) {
                    System.out.println(number+ " is not a prime number.");
                }
                else {
                    System.out.println(number+ " is a prime number.");
                }
            break;
            }
        }
    }           
}