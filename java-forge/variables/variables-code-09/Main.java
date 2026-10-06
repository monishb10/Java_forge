// Java Forge | Variables & Data Types
// Exercise: Wide multiplication check
// Passed all supplied test cases.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        int wrapped=a*b;
        long org=(long) a*b;
        System.out.println(wrapped+" "+org);
    
    
    }
    
}