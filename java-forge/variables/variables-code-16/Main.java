// Java Forge | Variables & Data Types
// Exercise: Signed short narrowing
// Passed all supplied test cases.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        short b = (short) x;
        System.out.println(b);
    }
}
