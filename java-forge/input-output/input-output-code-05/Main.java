// Java Forge | Input / Output
// Exercise: Numbered words
// Passed all supplied test cases.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        // Use a ternary operator instead of an if-statement to handle n == 0 vs normal output
        System.out.print(n == 0 ? "EMPTY\n" : 
            (n > 0 ? "1:" + sc.next() + "\n" : "") +
            (n > 1 ? "2:" + sc.next() + "\n" : "") +
            (n > 2 ? "3:" + sc.next() + "\n" : "") +
            (n > 3 ? "4:" + sc.next() + "\n" : "") +
            (n > 4 ? "5:" + sc.next() + "\n" : "")
        );
    }
}