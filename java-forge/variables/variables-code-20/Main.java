// Java Forge | Variables & Data Types
// Exercise: Percentage as an exact pair
// Passed all supplied test cases.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        long amount = scanner.nextLong();
        long percent = scanner.nextLong();
        
     
        long totalHundredths = amount * percent;
        
        
        long wholeUnits = totalHundredths / 100;
        long fractionalHundredths = totalHundredths % 100;
        
        
        System.out.println(wholeUnits + " " + fractionalHundredths);
    }
}