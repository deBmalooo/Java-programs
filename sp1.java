public class sp1 {
    public static void factorial(int n){
        int prod=1;
        for(int i=1;i<=n;i++){
            prod=prod*i;
        }
        System.out.println("The factorial is:"+prod);
    }
    public static void optimized_prime(int n){
        for(int i=2;i<n;i++){

        }
    }
    public static void bin_dec(int n){
        int sum=0,c=0;
        while(n!=0){
            int ld=n%10;
            sum=sum+(ld*(int)Math.pow(2, c));
            n=n/10;
            c++;
        }
        System.out.println("The decimal is:"+sum);
    }
    public static void Bin_to(int n){
        int sum=0,pow=0;
        while(n!=0){
            int rem=n%2;
            sum=sum+(rem*(int)Math.pow(10,pow));
            n=n/2;
            pow++;
        }
        System.out.println("The binary is:"+sum);
    }
    public static void hollowRect(int x){
        for(int i=1;i<=x;i++){
            for(int j=1;j<=x;j++){
                if(i==1||i==x||j==1||j==x){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void floyd(int x){
        int k=1;
        for(int i=1;i<=x;i++){
            for(int j=1;j<=i;j++){
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }
    public static void pattern1(int x){
        for(int i=1;i<=x;i++){
            int k=1;
            for(int j=i;j<=x;j++){
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }
    public static void pattern2(int x){
        for(int i=1;i<=x;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1"+" ");
                }
                else{
                    System.out.print("0"+" ");
                }
            }
            System.out.println();
        }
    }
    public static void pattern3(int x){
        for(int i=1;i<=x;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int k=1;k<=(2*(x-i));k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=x;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int k=1;k<=(2*(x-i));k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void tera_box(int x){
        for(int i=1;i<=x;i++){
            for(int j=1;j<=(x-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=5;j++){
                System.out.print("# ");
            }
            System.out.println();
        }
    }
    public static void tera_hollow_box(int x){
        for(int i=1;i<=x;i++){
            for(int j=1;j<=(x-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(x);j++){
                if(i==1||i==x||j==1||j==x){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }  
            }
            System.out.println();
        }
    }
    public static int binary_search(int n[],int key){
        int start=0,end=n.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(n[mid]==key){
                return mid;
            }
            if(n[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void rev_array(int n[]) {
        int start=0,last=n.length-1;
        while(start<=last){
            int temp=0;
            temp=n[last];
            n[last]=n[start];
            n[start]=temp;
            start++;
            last--;
        }
        System.out.println("The new array is");
        for(int i=0;i<=n.length-1;i++){
            System.out.print(n[i]+",");
        }
    }
    public static void array_pair(int n[]){
        int x=n.length-1;
        for(int i=0;i<=x;i++){
            for(int j=i+1;j<=x;j++){
                System.out.print("("+n[i]+","+n[j]+")");
            }
            System.out.println();
        }
    }
    public static void sub_array(int ar[]){
        for(int i=0;i<ar.length;i++){
            for(int j=i;j<ar.length;j++){
                System.out.print("(");
                for(int k=i;k<=j;k++){
                    System.out.print(ar[k]+",");
                }
                System.out.print(")");
            }
            System.out.println();
        }
    }
    public static void maxsum_subarray(int ar[]){
        int len=ar.length-1;int max_sum=Integer.MIN_VALUE;
        for(int i=0;i<ar.length;i++){
            for(int j=i;j<ar.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum=sum+ar[k];
                }
                if(sum>max_sum){
                    max_sum=sum;
                }
            }
        }
        System.out.println("The max sum of a subarray is:"+max_sum);                   
    }
    public static void kadanes_max_subarray(int ar[]){
        int len=ar.length-1,cs=0;
        int ms=Integer.MIN_VALUE;
        for(int i=0;i<=len;i++){
            cs+=ar[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs, ms);
        }
        System.out.println("The max sum of a subarray is:"+ms);
    }
    public static void rainwater_trap(int ar[]){
        //Finding the left max
        int lm[]=new int[ar.length];
        lm[0]=ar[0];
        for(int i=1;i<ar.length;i++){
            lm[i]=Math.max(lm[i-1],ar[i]);
        }
        //Finding the right max
        int rm[]=new int[ar.length];
        rm[ar.length-1]=ar[ar.length-1];
        for(int i=ar.length-2;i>=0;i--){
            rm[i]=Math.max(rm[i+1],ar[i]);
        }
        int trapped=0;
        for(int i=0;i<ar.length;i++){
            trapped+=Math.min(lm[i],rm[i])-ar[i];
        }
        System.out.println("Amount of water stored is:"+trapped);
    }
    public static void main(String args[]){
        // factorial(2);
        // bin_dec(111);
        // Bin_to(6);
        // hollowRect(5);
        // floyd(5);
        // pattern1(5);
        // pattern2(5);
        // pattern3(4);
        // tera_box(5);
        // tera_hollow_box(5);
        int arr[]={4,2,0,6,3,2,5};
        // System.out.println("Index for key is : "+binary_search(arr,5));
        // rev_array(arr);
        //array_pair(arr);
        //sub_array(arr);
        //maxsum_subarray(arr);
        //kadanes_max_subarray(arr);
        rainwater_trap(arr);
    }
}
