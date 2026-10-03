// Java Forge | Variables & Data Types
// Exercise: Exchange two readings
// Passed all supplied test cases.
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int temp=a;
        a=b;
        b=temp;
        System.out.print(a+" "+b);
    
    }
}