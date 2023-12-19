public class heap_S {
    public static void heapify(int arr[],int i,int size){
        int left=2*i+1;
        int right=2*i+2;
        int parent=i;

        if(left<size && arr[left]<arr[parent]){
            parent=left;
        }
        if(left<size && arr[right]<arr[parent]){
            parent=right;
        }

        if(parent != i){
            int temp=arr[i];
            arr[i]=arr[parent];
            arr[parent]=temp;

            heapify(arr, i, size);
        }
    }
    public static void heapsort(int arr[]){
        int n = arr.length;
        for(int i=n/2;i<=0;i--){
            heapify(arr, i, n);
        }
        for(int i=n-1;i>0;i--){
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            heapify(arr, 0, i);
        }
    }
    public static void main(String args[]){
        int arr[]={1,2,4,3,5};
        heapsort(arr);

        //print

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}