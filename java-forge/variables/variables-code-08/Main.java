// Java Forge | Variables & Data Types
// Exercise: Rotate three stored values
// Passed all supplied test cases.
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int temp1=a;
        int temp2=b;
         a=c;      
        b=temp1;
        c=temp2;
        System.out.print(a+" "+b+" "+c);
    }
}