import java.text.BreakIterator;

public class recursion {
    public static void dec_num(int n){
       if(n==1){
        System.out.print(1);
        return; //After this statement -1 will not come or can say function after this will be returned
       }
       System.out.print(n+" ");
       dec_num(n-1);
    }
    public static void inc_num(int n, int i){
        if(i==n){
            System.out.print(n);
            return;
        }
        System.out.print(i++ + " ");
        inc_num(n, i);
    }
    public static void main(String args[]){
        //dec_num(5);
        inc_num(5,1);
    }
}
