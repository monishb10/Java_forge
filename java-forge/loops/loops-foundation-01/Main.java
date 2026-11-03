// Java Forge | Loops
// Exercise: Count Up
// Passed all supplied test cases.
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner nc=new Scanner(System.in);
        int n=nc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print(i+" ");
        }
        
    }
}