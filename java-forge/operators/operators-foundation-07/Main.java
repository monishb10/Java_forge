// Java Forge | Operators
// Exercise: Sum the digits of a three-digit value
// Passed all supplied test cases.
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long a=sc.nextLong();
        long h=a/100;
        long t=(a/10)%10;
        long o=a%10;
        long sum=h+t+o;
        System.out.println(sum);
            
        
    }
}