// Java Forge | Input / Output
// Exercise: Receipt in major currency
// Passed all supplied test cases.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long quantity = sc.nextLong();
        long unitPriceCents = sc.nextLong();

        long totalCents = quantity * unitPriceCents;

        long major = totalCents / 100;
        long cents = totalCents % 100;

        System.out.printf("%d.%02d", major, cents);
    }
}