
import java.util.*;

public class else_if {
    public static void main(String[] args) {
        // Student Score
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        if(n>=80){
            System.out.println("First Class with distinction"); 
        }
        else if (n>=65 && n<80) {
            System.out.println("First Class");
        }
        else if (n>=50 && n<65) {
            System.out.println("Second Class");
        }
        else if(n>=35 && n<50){
            System.out.println("Third Class");
        }else{
            System.out.println("Failed");
        }
        sc.close();
    }
}
