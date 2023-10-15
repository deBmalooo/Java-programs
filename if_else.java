import java.util.*;
public class if_else {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the value of first number");
            int a = sc.nextInt();
            System.out.println("Enter the value of second number");
            int b = sc.nextInt();
            if(a>b){
                System.out.println("First number is greater");
            }
            else{
                System.out.println("second number is greater");
            }
        }
    }
}
