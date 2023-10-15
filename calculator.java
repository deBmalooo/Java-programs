import java.util.*;
public class calculator {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the value of a");
            int a = sc.nextInt();
            System.out.println("Enter the value of b");
            int b = sc.nextInt();
            System.out.println("Enter the operator");
            char op = sc.next().charAt(0);

            switch(op){
                case '+' :
                System.out.println(a+b);
                break;
                case '-' :
                System.out.println(a-b);
                break;
                case '*' :
                System.out.println(a*b);
                break;
                case '%' :
                System.out.println(a%b);
                break;
                default :
                System.out.println(a+b);
            }
        }
    }
    
}
