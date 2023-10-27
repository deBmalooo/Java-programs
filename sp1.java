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
    public static void main(String args[]){
        //factorial(2);
        //bin_dec(111);
        //Bin_to(6);
        //hollowRect(5);
        //floyd(5);
        //pattern1(5);
        //pattern2(5);
        //pattern3(4);
        //tera_box(5);
        tera_hollow_box(5);
    }
}
