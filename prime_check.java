import java.util.*;

public class prime_check{
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the number :");
            int n = sc.nextInt();
            int c=0;
            for(int i=2;i<n;i++){
                if(n%i==0){
                    c++;
                }
            }
            if(c!=0){
                System.out.println("The number "+n+" is not prime.");
            }
            else{
                System.out.println("The number "+n+" is prime.");
            }

        }
    }
}