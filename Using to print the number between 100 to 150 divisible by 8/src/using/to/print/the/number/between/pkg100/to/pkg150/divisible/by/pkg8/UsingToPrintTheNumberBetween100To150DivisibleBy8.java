package using.to.print.the.number.between.pkg100.to.pkg150.divisible.by.pkg8;
public class UsingToPrintTheNumberBetween100To150DivisibleBy8 {
    public static void main(String[] args) {
        int n = 150;
        
        while(n <= 150 && n>= 100) {
            if(n % 8 == 0) {
                System.out.println(n +" ");
            }
        n--;
        }
    }
}