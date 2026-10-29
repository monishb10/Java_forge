// Java Forge | if-else & switch
// Exercise: Find the largest of three
// Passed all supplied test cases.
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long a=sc.nextLong();
        long b=sc.nextLong();
        long c=sc.nextLong();
        if (a<=b && b>=c){
            System.out.println(b);
        }
        else if(a>=b && a>=c){
            System.out.println(a);
        }
        else{
            System.out.println(c);
        }
      
    }
}