import java.util.Scanner;

public class countDidits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :");
        long n = sc.nextLong();
        long t = 0;
        long original_n = n;

        while (n>0) {
            n = n/10;
            t++;
        }
        System.out.println("Number of digits in " + original_n + " = " + t);


        sc.close();
    }
}
