// Java Forge | Variables & Data Types
// Exercise: Hours and spare minutes
// Passed all supplied test cases.
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int hours=a/60;
        int mins=a%60;
        System.out.println(hours+" "+mins);
            
    }
}