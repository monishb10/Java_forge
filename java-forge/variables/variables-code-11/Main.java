// Java Forge | Variables & Data Types
// Exercise: Three readings total and whole average
// Passed all supplied test cases.
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);;
        long a=sc.nextLong(),b=sc.nextLong(),c=sc.nextLong();
        long whl=a+b+c;
        long frc=whl/3;
        System.out.println(whl+" "+frc);
    }
}