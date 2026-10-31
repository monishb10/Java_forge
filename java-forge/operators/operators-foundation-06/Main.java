// Java Forge | Operators
// Exercise: Convert seconds into a duration
// Passed all supplied test cases.
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int hour=a/3600;
        int min=(a%3600)/60;
        int sec=a%60;
        System.out.print(hour+" "+min+" "+sec);
    }
}