import java.util.Scanner;

public class example {
    public static void main(String[] args) {

        // blood donation

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Age:");
        int age = sc.nextInt();
        System.out.print("Enter Weight:");
        double weight = sc.nextDouble();

        if (age>=18) {
            if (weight>=50) {
                System.out.println("Eligible to donate blood.");
            } else {
                System.out.println("Not Eligible to donate blood.");
            }
        }else{
            System.out.println("Not Eligible");
        }
        sc.close();
    }
}
