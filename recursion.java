
public class recursion {
    public static void dec_num(int n){
       if(n==1){
        System.out.print(1+" ");
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
    public static void factorial(int n,int prod){
        if(n==1){
            prod=prod*1;
            System.out.print(prod);
            return;
        }
        prod=prod*n;
        factorial(n-1,prod);
    }
        // easy method
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        int fn = n*factorial(n-1);
        return fn;
        }
    
    public static void fibonacci(int n){

    }
    public static int sum_num(int n){
        if(n==1){
            return 1;
        }
        int s=sum_num(n-1);
        int sum=n+s;
        return sum;
    }
    public static void main(String args[]){
        //dec_num(5);
        //inc_num(5,1);
       //factorial(5,1);   
       //System.out.print(factorial(5));
       System.out.print(sum_num(5));
    }
}
