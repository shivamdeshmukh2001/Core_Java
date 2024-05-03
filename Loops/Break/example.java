package Loops.Break;

import java.util.Scanner;

public class example {
    public static void main(String[] args) {
        // when n = 10 stop the loop
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :");
        int n = sc.nextInt();

        for(int i =1; i<n; i++){
            System.out.println(i);
            if (i==10) {
                break;
            }
        }
        sc.close();
    }
    
}
