package string1;

import java.util.Scanner;   //creating scanner object

public class String1 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);     //initialize scanner
        
        System.out.print("Enter a line : ");
        String str1= scan.nextLine(); //input in string 1
        
        System.out.print("Enter a line : ");
        String str2= scan.nextLine(); // input in string 2
        
        //comparing to strings
        int result = str1.compareToIgnoreCase(str2);
        
        //Displaying the comparison
        if(result < 0){
            System.out.print("'"+ str1 +"' is less than '"+ str2 + "'.");
        }
        else if(result == 0) {
            System.out.print("'"+ str1 +"' '"+ str2 + "' are both equal.");
        }
        else { //If result >0 
            System.out.print("'"+ str1 +"' is greater than '"+ str2 + "'.");
        }
    }
    
}
