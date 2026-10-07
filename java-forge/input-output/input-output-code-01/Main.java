// Java Forge | Input / Output
// Exercise: Whole line length
// Passed all supplied test cases.
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int count=a.length();
        System.out.println(count);
    }
}