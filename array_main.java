public class array_main{
    public static int largest(int ar[]){
        int len=ar.length;
        int i,max=0; int min=Integer.MAX_VALUE;
        for(i=0;i<len;i++){
            if(ar[i]>max){
                max=ar[i];
            }
            if(ar[i]<min){
                min=ar[i];
            }
        }
        System.out.println("The SMALLEST in the array is:"+min);
        return max;
    }
    public static int bin_Search(int ar[],int key)  {
        int start=0,end=ar.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(ar[mid]==key){
                return mid;
            }
            if(ar[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void Rev_array(int ar[]){
        int last=ar.length-1;int first=0;
        while(first<last){
            int temp=ar[last];
            ar[last]=ar[first];
            ar[first]=temp;
            first++;
            last--;
        }
    }
    public static void printpairs(int ar[]){
        for(int i=0;i<ar.length;i++){
            int curr = ar[i];
            for(int j=i+1;j<ar.length;j++){
                System.out.print("("+curr+","+ar[j]+")");
            }
            System.out.println();
        }
    }
    public static void sum_subarray(int ar[],int start,int end){
        int sum=0;
        for(int i=start;i<=end;i++){
            sum=sum+ar[i];
        }
        System.out.print("The sum is:"+sum);
    }
    public static void subarray(int ar[]){
        int len=ar.length-1;
        int ts=0;
        for(int i=0;i<=len;i++){
            int start=i;
            for(int j=i;j<=len;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(ar[k]+" ");
                }
                ts++;
                System.out.print(" ");
                sum_subarray(ar,start,end); 
                System.out.println(); 
            }
            System.out.println();
        }
        System.out.println("Total subarrays:"+ts);
    }
    public static void lsum_subarrayBRUTEFORCE(int ar[]){
        
        int len=ar.length-1;
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;

        for(int i=0;i<=len;i++){
            int start=i;
            for(int j=i;j<=len;j++){
                int end=j;
                currSum=0;
                for(int k=start;k<=end;k++){
                    currSum += ar[k];
                }
                System.out.println(currSum);
                if(maxSum<currSum){
                    maxSum=currSum;
                } 
            }          
        }
        System.out.println("max sum ="+maxSum);
    }
    public static void prefixsum(int ar[]){
        //finding the prefix array
        int currsum=0;
        int MAX_sum=Integer.MIN_VALUE;
        int prefix[]=new int[ar.length];
        prefix[0]=ar[0];

        for(int i=1;i<ar.length;i++){
            prefix[i]=prefix[i-1]+ar[i];  //The prefix array is printed
        }

        for(int i=0;i<ar.length;i++){
            int start=i;
            for(int j=i;j<ar.length;j++){
                int end=j;
                currsum= start==0 ? prefix[end]:prefix[end]-prefix[start-1];
                if(MAX_sum<currsum){
                    MAX_sum=currsum;
                }
            }
        }
        System.out.println("The max_Sum is:"+MAX_sum);
    }
    public static void kadanes_max_subarray(int ar[]){
        int ms=Integer.MIN_VALUE;
        int cs=0;

        for(int i=0;i<ar.length;i++){
            cs=cs+ar[i];
            if(cs<0){
              cs=0;
            }
            ms=Math.max(cs, ms);
        }
        System.out.println("Maxsub array sum is:"+ms);
    }
    public static void main(String args[]){
        int ar[]={-1,-3,4,-1,-2,1,5,-3};
        kadanes_max_subarray(ar);
        lsum_subarrayBRUTEFORCE(ar);
        prefixsum(ar);
        subarray(ar);
        printpairs(ar);
        int key=10;
        Rev_array(ar);
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
        System.out.println();
        System.out.println("Index for key is : "+bin_Search(ar, key));
        int largest_num=largest(ar);
        System.out.println("The LARGEST in the array is:"+largest_num);
    }
}
