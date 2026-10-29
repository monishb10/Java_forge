// Java Forge | if-else & switch
// Exercise: Choose the larger value
// Passed all supplied test cases.
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long a=sc.nextLong();
        long b=sc.nextLong();
        if (a>b){
            System.out.println(a);
        }
        else{
            System.out.println(b);
        }
    }
}