import java.util.*;

public class for_loop{
    public static void main(String [] args){
        //Print table of 2
        Scanner sc = new Scanner(System.in);
        System.out.print("Table of ");
        int n = sc.nextInt();
        for (int i=1;i<=10;i++){
            
            System.out.println(n*i);
        } 
    }
}