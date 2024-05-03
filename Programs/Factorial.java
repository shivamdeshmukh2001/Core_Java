
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :");
        int n = sc.nextInt();
        int d =1;
        for(int i=1;i<=n;i++){
            d=d*i;
            
        }
        System.out.println(d);
            
        sc.close();
    }
}