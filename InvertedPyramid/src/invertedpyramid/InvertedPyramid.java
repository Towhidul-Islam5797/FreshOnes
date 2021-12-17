package invertedpyramid;
import java.util.Scanner;
public class InvertedPyramid {
    public static void main(String[] args) {
        int num ,count;
        
        Scanner scan = new Scanner (System.in);
        System.out.print("Enter the size of the Inverted Pyramid :");
        num = scan.nextInt();
        
        for(int i = num ; i>= 1; i--) {
            for(int j = i; j < num; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= (2 * i - 1); j++) {
               if(j%2 == 0){
                   count =0;
                   System.out.print(count +"");
               }
               else{
                   count = 1;
                   System.out.print(count +"");
               } 
            }
            System.out.println("");
        }
    }
    
}
