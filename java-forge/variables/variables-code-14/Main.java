// Java Forge | Variables & Data Types
// Exercise: Distance in whole centimetres
// Passed all supplied test cases.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long a = sc.nextLong();
        long b = sc.nextLong();
        long cm = sc.nextLong();

        long km=a*100000;
        long mtr=b*100;

        System.out.println(km+mtr+cm);
    }
}