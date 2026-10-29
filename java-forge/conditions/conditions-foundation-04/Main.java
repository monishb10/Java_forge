// Java Forge | if-else & switch
// Exercise: Name odd and even values
// Passed all supplied test cases.
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long a=sc.nextLong();
        if (a%2==0){
            System.out.println("EVEN");
        }
        else{
            System.out.println("ODD");
        }
    }
    
}