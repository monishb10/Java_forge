// Java Forge | Operators
// Exercise: Count full boxes and leftovers
// Passed all supplied test cases.
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long a=sc.nextInt();
        long b=sc.nextInt();
        long c=a/b;
        long r=a%b;
        System.out.println(c+" "+r);
    }
}