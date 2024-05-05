package Patterns;

import java.util.Scanner;

public class HollowNumericPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row :");
        int n = sc.nextInt();
        
        // Outer loop for rows
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print the left half of the pyramid
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1 || i == n) {
                    System.out.print(i);
                } else {
                    System.out.print(" ");
                }
            }
            // Move to the next line
            System.out.println();
        }
        sc.close();
    }
}
