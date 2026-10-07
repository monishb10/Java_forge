// Java Forge | Input / Output
// Exercise: Age then full name
// Passed all supplied test cases.
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        sc.nextLine();
        String b=sc.nextLine();
        System.out.println(b+" | "+a);
    }
}