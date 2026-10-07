// Java Forge | Input / Output
// Exercise: Sum tokens until input ends
// Passed all supplied test cases.
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int sum=0;

        try{
            sum +=sc.nextInt();
            sum +=sc.nextInt();
            sum +=sc.nextInt();
            sum +=sc.nextInt();
            
        }
        catch (Exception e){
            
        }
        System.out.println(sum);
    }
}