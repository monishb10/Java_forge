// Java Forge | Variables & Data Types
// Exercise: Packet groups and remainder
// Passed all supplied test cases.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a=sc.nextLong();
        long div=a/1024;
        long rem=a%1024;
        System.out.println(div+" "+rem);
    }
}
 