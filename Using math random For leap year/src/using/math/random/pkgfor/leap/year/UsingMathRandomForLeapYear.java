package using.math.random.pkgfor.leap.year;
public class UsingMathRandomForLeapYear {
    public static void main(String[] args) {
        int max = 2020;
        int min = 1990;
        int n = (int)(min+Math.random()*(max-min+1));
        
        if(n % 4 == 0 && n % 100 == 0 && n % 400 == 0) {
            System.out.println(n+" is a leap year");
        }
        else {
            System.out.println(n+" is not a leap year");
        }
    }
    
}
