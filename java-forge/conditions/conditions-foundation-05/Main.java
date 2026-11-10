// Java Forge | if-else & switch
// Exercise: Apply an age eligibility rule
// Passed all supplied test cases.
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if (a>=18){
            System.out.println("ELIGIBLE");
        }
        else{
            System.out.println("TOO_YOUNG");
        }
    }
}