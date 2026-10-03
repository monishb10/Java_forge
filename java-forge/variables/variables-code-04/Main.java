// Java Forge | Variables & Data Types
// Exercise: Clock duration fields
// Passed all supplied test cases.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long totalSeconds = sc.nextLong();
        
        long hours = totalSeconds / 3600;
        long minutes = (totalSeconds % 3600) / 60;
        long seconds = totalSeconds % 60;
        
        System.out.println(hours + " " + minutes + " " + seconds);
    }
}