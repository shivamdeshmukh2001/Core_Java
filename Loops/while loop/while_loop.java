import java.util.Scanner;

public class while_loop {
    public static void main(String [] args){
        //print 1 to n
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :");
        int n = sc.nextInt();
        int i = 1;
        while (i <= n){
            System.out.println(i ); 
            i++;
        }
    sc.close();
    }

}