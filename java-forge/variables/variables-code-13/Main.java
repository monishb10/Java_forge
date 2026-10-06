// Java Forge | Variables & Data Types
// Exercise: Three-dimensional storage
// Passed all supplied test cases.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        long dim=a*b*c;
        System.out.println(dim);

    }
}