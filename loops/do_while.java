import java.util.*;
public class do_while {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int c=1;
            do{
                System.out.println("Hello world");
                c++;
            } while(c<=5);
        }
    }
}