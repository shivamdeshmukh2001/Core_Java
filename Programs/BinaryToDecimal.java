import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :");
        int Binary_Number = sc.nextInt();
        int ans =0;
        int power = 1;
        
        while(Binary_Number > 0){
            int Unit_Digit = Binary_Number % 10;
            ans = ans + (Unit_Digit * power );
            Binary_Number = Binary_Number / 10;
            power = power * 2;
        }
        System.out.print(ans);
        sc.close();
    }
}