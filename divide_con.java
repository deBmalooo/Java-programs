public class divide_con {
    public static void merge(int ar[],int si,int mid,int ei){
        int temp[]=new int[ei-si+1];
    }
    public static void mergesort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        
        int mid=(si+ei)/2;
        mergesort(arr, si, mid); //left part
        mergesort(arr, mid+1, ei); //right part
        merge(arr, si,mid,ei);

    }
    public static void main(String args[]){
        int arr[]={6,3,9,5,2,8};
        mergesort(arr, 0, arr.length-1);
    }
}
