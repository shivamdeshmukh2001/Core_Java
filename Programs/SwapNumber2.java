import java.util.Scanner;

public class SwapNumber2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();

        swap(a, b);
    }


    static void swap(int a, int b){
        System.out.println("Original value :");
        System.out.println("a :"+a);
        System.out.println("b :"+b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Swapped value :");
        System.out.println("a :"+a);
        System.out.println("b :"+b);
    }
}
