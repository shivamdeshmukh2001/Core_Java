import java.util.Scanner;

public class decimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :");
        int decimal = sc.nextInt();
        int ans =0;
        int pw = 1;
        
        while(decimal > 0){
            int parity = decimal % 2;
            ans = ans + (parity * pw );
            decimal = decimal / 2;
            pw = pw * 10;
        }
        System.out.print(ans);
        sc.close();
    }
}