import java.util.*;
public class Binomial_C
{
    public static int Factorial(int a){
        int i,prod=1;
        for(i=1;i<=a;i++){
            prod=prod*i;
        }
        return prod;
    }
    public static int bino(int x,int y){
        int c=Factorial(x)/(Factorial(y)*Factorial(x-y));
        return c;
    }
    public static void main(String args[]){
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter the value of n and r ");
            int n=sc.nextInt();
            int r=sc.nextInt();
            System.out.println("The Binomial Coefficient is "+bino(n,r));
        }
    }
}
