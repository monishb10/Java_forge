// Java Forge | Variables & Data Types
// Exercise: Coin value in cents
// Passed all supplied test cases.
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(),d=sc.nextInt();
        int qua=a*25;
        int dim=b*10;
        int nic=c*5;
        int pen=d*1;
        int ans=qua+dim+nic+pen;
        System.out.println(ans);
    }
}