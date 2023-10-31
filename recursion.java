
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
    
    public static int fibonacci(int n){
        if(n==1 || n==0){
            return n;
        }
        int fn=fibonacci(n-1)+fibonacci(n-2);
        return fn;
    }
    public static int sum_num(int n){
        if(n==1){
            return 1;
        }
        int sum=n+sum_num(n-1);
        return sum;
    }
    public static boolean isSorted(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }
    public static int firstOccurence(int arr[],int key,int i){
        if(arr[i]==key){
            return i;
        }
        if(i==arr.length){
            return -1;
        }
        return firstOccurence(arr, key, i+1);
    }
    public static int lastOccurence(int ar[],int key,int i){
        if(i==0){
            return -1;
        }
        if(ar[i]==key){
            return i;
        }
        return lastOccurence(ar, key, i-1);
    }
    public static int power_of_X(int n,int x){
        if(x==1){
            return (n);
        }
        int prod=n*power_of_X(n,x-1);
        return prod;
    }
    public static void main(String args[]){
        //dec_num(5);
        //inc_num(5,1);
       //factorial(5,1);   
       //System.out.print(factorial(5));
       //System.out.print(sum_num(5));
        int arr[]={1,2,3,4,5,6,4,8};
        //System.out.println(fibonacci(5));
        //System.out.println(isSorted(arr, 0));
        //System.out.print(firstOccurence(arr, 4, 0));
        //System.out.print(lastOccurence(arr, 4, arr.length-1));
        System.out.print(power_of_X(2, 3));

    }
}
  