import java.util.Scanner;

public class SumSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :");
        int n = sc.nextInt();
        int d =0;
        int i = 1;
        while(i < n){
            if(i %2==0){
                d=d-i;
                i++;
            }else{
                d= d + i;
                i++;
            }
        
        }
        System.out.println(d);
            
        sc.close();
    }
}