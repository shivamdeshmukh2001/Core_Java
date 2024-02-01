package if_else;

import java.util.*;

public class if_else {
    public static void main(String[] args) {
        //Given number is even or odd
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        if(n%2==0){
            System.out.println("The given number " + n  + " is Even"); 
        }else{
            System.out.println("The given number "+ n + " is Odd");
        }
        sc.close();
    }
}
