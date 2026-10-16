// Java Forge | if-else & switch
// Exercise: Classify the sign
// Passed all supplied test cases.
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if (a==0){
            System.out.println("ZERO");
        }
        else if (a>=0){
            System.out.println("POSITIVE");
        }
        else{
            System.out.println("NEGATIVE");
        }
    }
}