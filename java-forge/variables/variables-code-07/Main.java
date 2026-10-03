// Java Forge | Variables & Data Types
// Exercise: Product stock record
// Passed all supplied test cases.
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Name = sc.next();
        int stock = sc.nextInt();
        int unit = sc.nextInt();
        
        // Use long and cast to prevent integer overflow for huge values
        long stk = (long) stock * unit; 
        
        boolean val = stock > 0;
        System.out.println(Name + " " + stk + " " + val);
    }
}