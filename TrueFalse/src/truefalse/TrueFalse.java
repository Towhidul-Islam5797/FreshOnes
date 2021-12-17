package truefalse;
import java.util.Scanner;
public class TrueFalse {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int a ;
        System.out.print("Enter a number = ");
        a = scan.nextInt();
        
        if(Divisible(a) == true){
            System.out.println("True");
        }
        if(Divisible(a) == false){
            System.out.println("False");
        }
    }    
    static boolean Divisible(int num)
    {
        if( num % 5 == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
