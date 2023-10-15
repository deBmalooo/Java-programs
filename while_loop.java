import java.util.*;

public class while_loop {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the n value");
            int n = sc.nextInt();
            int c=1, sum=0;
            while(c<=n){
                sum += c;
                c++;
            }
            System.out.println("The sum is: "+sum);
        }
    }    
}
