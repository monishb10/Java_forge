// Java Forge | if-else & switch
// Exercise: Check a subject pass mark
// Passed all supplied test cases.
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>=b){
            System.out.println("PASS");
        }
        else{
            System.out.println("FAIL");
        }
    }
}