import java.util.*;
public class num_reverse{
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the number :");
            int n = sc.nextInt();
            int temp = n,c=0,sum=0,d;
            while(temp!=0){
                temp = temp/10;
                c++;
            }
            for(int i=1;i<=c;i++){
                d=n%10;
                sum=(sum*10)+d;
                n=n/10;
            }
            System.out.println("The reverse of number is :"+sum);
        }
    }
}