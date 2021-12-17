package array3;
import java.util.Arrays;
import java.util.Scanner;
public class Array3 {
    public static void main(String[] args) {
        int[] a = new int[10];
        Scanner scan = new Scanner (System.in);
        
        for(int i = 0; i < a.length; i++) {
            System.out.print("Enter the integer " + (i+1) + ":");
            a[i] = scan.nextInt();
        }
        for(int i = 0; i < a.length/2 ; i++) {
            int temp           = a[i];
            a[i]               = a[a.length -i -1];
            a[a.length -i -1]  = temp;   
        }
        System.out.println("The reverse array is :" + Arrays.toString(a));
    }
    
}
