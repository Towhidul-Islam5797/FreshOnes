package method1;
import java.util.Scanner;
public class Method1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a word : ");
        String text = scan.next();
        
        if(isPalindrom(text)) {
            System.out.println("The word is palindrom " + text);
        }
        else {
            System.out.println("The word is not a palindrom " + text);
        }
    }
    public static boolean isPalindrom (String arg) {
        boolean count = true;
        for(int i = 0, j = arg.length() - 1; i < arg.length() - 1; i++, j--) {
            if(arg.charAt(i) != arg.charAt(j)) {
                count = false;
            }
        }
        return count ;
    }
}
