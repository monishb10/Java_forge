// Java Forge | Operators
// Exercise: Compare grouping in expressions
// Passed all supplied test cases.
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int f=a+b*c;
        int s=(a+b)*c;
        System.out.println(f);
        System.out.println(s);
    }
}