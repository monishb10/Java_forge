// Java Forge | Variables & Data Types
// Exercise: Signed byte narrowing
// Passed all supplied test cases.
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        byte b=(byte) a;
        System.out.println(b);
     
    }
}