package Loops.Continue;
import java.util.Scanner;

public class example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print( "Enter a number: ");
        int n = sc.nextInt();

        // for(int i=1;i<n;i++){
        //     if(i%3==0){
        //         continue;
        //     }
        //     System.out.println(i);
        // }

        int i = 1;
        while(i<n){
            if(i%3==0){
                i++;
                continue;
                
            }
            System.out.println(i);
            i++;
        }
        sc.close();
    }
}
