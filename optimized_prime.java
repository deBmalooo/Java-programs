import java.util.*;
public class optimized_prime {
    public static Boolean isPrime(int n){
        int i;
        if(n==2){
            return true;
        }
            for(i=2;i<=(n/2);i++){
                if(n%i==0){
                    return false;
                }
            }
            return true;
            }
    public static void main(String args[]){
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("Enter the range:");
            int range=sc.nextInt();
            System.out.println("The prime numbers are");
            for(int i=1;i<=range;i++){
                if(isPrime(i)==true){
                    System.out.println(i);
                }
            }
        }
    }
}

