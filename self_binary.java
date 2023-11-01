public class self_binary {
    public static void binary(int ar[],int key){
        int len=ar.length;
        int i=len/2;
        if(key==ar[i]){
            System.out.print("The key is place in: "+i);
        }
        if(key>ar[i]){
            int start=i+1;
            for(int j=start;j<len;j++){
                if(key==ar[j]){
                    System.out.print("The key is place in: "+j);
                }
            }
        }
        else{
            int end=i-1;
            for(int j=0;j<=end;j++){
                if(key==ar[j]){
                    System.out.print("The key is place in: "+j);
                }
            }
        }
    }
    public static void triplet(int ar[]){
        int len=ar.length-1;
        for(int i=0;i<=len;i++){
            for(int j=i+1;j<=len;j++){
                for(int k=j+2;k<=len;k++){
                    if((ar[i]+ar[j]+ar[k])==0){
                        System.out.print("["+ar[i]+","+ar[j]+","+ar[k]+"]");
                    }
                }
            }
        }
    }
    public static void main(String args[]){
        // int arr[]={4,5,6,7,8,9,10};
        // binary(arr, 10);
        int ar[]={-1,0,1,2,-1,4};
        triplet(ar);


    }
}
