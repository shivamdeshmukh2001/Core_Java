import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of a :");
        int a=sc.nextInt();
        System.out.println("Enter value of b :");
        int b=sc.nextInt();
        swap(a,b);

        sc.close();
    }

    static void swap(int a,int b){
        System.out.println("Original value :");
        System.out.println("a :"+a);
        System.out.println("b :"+b);


        int temp=a;
        a=b;
        b=temp;

        System.out.println("Swapped value :");
        System.out.println("a :"+a);
        System.out.println("b :"+b);
    }
}
