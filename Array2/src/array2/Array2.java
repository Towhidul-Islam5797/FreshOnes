package array2;
import java.util.Scanner;
public class Array2 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        int[] a = new int[4];
        
        for(int i = 0; i < a.length; i++) {
            System.out.print("Enter the integer " + (i+1) + ":");
            a[i] = scan.nextInt();
        }
        
        int sum = 0;
        for(int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println("The sum of the array elements is :" + sum);
        
        int product = 1;
        for(int i = 0; i < a.length; i++) {
            product *=  a[i];
        }
        System.out.println("The product of the array elements is :" + product);
        
        double average = 0 ;
        for(int i = 0; i < a.length; i++) {
            average = (double) sum /  a.length;
        }
        System.out.println("The average of the array elements is :" + average);
    }
    
}
