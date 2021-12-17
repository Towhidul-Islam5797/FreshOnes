package multiplicationtable;
import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        
        Scanner Scan = new Scanner (System.in);
        System.out.println("Enter a Number - ");
        int num , i , j ;
        num = Scan.nextInt();
        
        System.out.println("Heree is the mulitiplication table from 1 to " +num);
        
        for(i = 1 ; i <= num ; i++) {
            for(j = 0 ; j <= 10 ; j++) {
                System.out.printf("%d * %d = %d\n", i , j , i*j);
            }
            System.out.println("\n");
        }
    }
    
}
