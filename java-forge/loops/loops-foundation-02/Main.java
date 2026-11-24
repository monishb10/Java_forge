// Java Forge | Loops
// Exercise: Count Down
// Passed all supplied test cases.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            System.out.print(i);
            if (i > 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
        sc.close();
    }
}