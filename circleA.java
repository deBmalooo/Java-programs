import java.util.*;
public class circleA {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            float rad = sc.nextFloat();
            int area = (int)(3.14 * rad * rad);
            System.out.println("The Area is: " + area); 
        }
    } 
}
