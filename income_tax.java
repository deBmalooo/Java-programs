import java.util.*;

public class income_tax {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the income :");
            int i=sc.nextInt();
            int tax;
            if(i<500000){
                tax=0;
            }
            else if(i>=500000 && i<=1000000){
                tax =(int)(i*0.2);
            }
            else{
                tax =(int)(i*0.3);
            }
            System.out.println("your tax is :"+tax);
        }
    }
}
