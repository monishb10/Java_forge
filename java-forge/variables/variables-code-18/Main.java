// Java Forge | Variables & Data Types
// Exercise: Stored value updates
// Passed all supplied test cases.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a=sc.nextLong();
        long b=sc.nextLong();
        long c=sc.nextLong();

        long dep=a+b;
        long wd=dep-c;
        System.out.println(dep);
        System.out.println(wd);
    }
}