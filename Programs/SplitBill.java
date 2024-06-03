
import java.util.*;

public class SplitBill {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Bill Amount :");
        int Bill_Amount = sc.nextInt();
        System.out.println("Total Friends :");
        int Total_Friends = sc.nextInt();
        int GST;
            if (Bill_Amount < 5000) {
                GST=12;
            } 
            else{
                GST=18;
            }
        System.out.println("Service Charges :");
        int Service_Charge = sc.nextInt();
        double Total_Amount = (Bill_Amount + ((Bill_Amount * GST)/100) + Service_Charge);

        double Amount_For_each_friend = Total_Amount / Total_Friends;
        System.out.println("Per head Bill Amount : "+Amount_For_each_friend);

        sc.close();
    }
}
