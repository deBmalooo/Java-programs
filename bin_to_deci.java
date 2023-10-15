public class bin_to_deci {
    public static void Bin_to_deci(int n){
        int dec=0;
        int pow=0,ld;
        while(n!=0){
            ld=n%10;
            dec=dec+((int)(Math.pow(2,pow))*ld);
            n=n/10;
            pow++;
        }
        System.out.println("The decimal number is:"+dec);
    }
    public static void decitobin(int n){
        int bin=0;
        int pow=0;
        while(n!=0){
            int r=n%2;
            bin=bin+(r*(int)Math.pow(10,pow));
            n=n/2;
            pow++;
        }
        System.out.print("The binary format is:"+bin);
    }
    public static void main(String args[]){
        Bin_to_deci(101);
        decitobin(5);
    }
}
