import java.util.Scanner;


public class ReverseNumber {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :");
        int n = sc.nextInt();
        
        
        while(n>0){
            int r = n%10;
            
            n = n/10;
            System.out.print(r);
        }
        
        sc.close();
    }
}

