// Java Forge | Variables & Data Types
// Exercise: Next uppercase letter
// Passed all supplied test cases.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        int asci = a;
        
        char next;
        if (a == 'Z') {
            next = 'A';
        } else {
            next = (char) (a + 1);
        }
        
        System.out.println(asci + " " + next);
    }
}