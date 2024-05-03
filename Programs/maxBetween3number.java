import java.util.*;

public class maxBetween3number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first no. :");
        int a = sc.nextInt();
        System.out.print("Enter Second no. :");
        int b = sc.nextInt();
        System.out.print("Enter Third no. :");
        int c = sc.nextInt();

        if (a > b) {
            if (a > b) {
                System.out.println(a +" is Greater number.");
            } else {
                System.out.println(c +" is Greater number.");
            }
            
        } else {
            if (b > c) {
                System.out.println(b +" is Greater number.");
            } else {
                System.out.println(c +" is Greater number.");
            }
        }
        sc.close();
    }
}
