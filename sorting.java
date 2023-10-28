
public class sorting {
    public static int BubbleSort(int arr[]){
        int temp=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<(arr.length-1-i);j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        return -1;
    }
    public static void printarray(int ar[]){
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
    }
    public static void countsort(int ar[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<ar.length;i++){ //finding the max value
            largest=Math.max(largest, ar[i]);
        }
        int count[]=new int[largest+1];
        for(int i=0;i<ar.length;i++){
            count[ar[i]]++;     //counting the number of elements
        }
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]!=0){
                ar[j]=i;
                j++;
                count[i]--;
            }
        }
    } 
    public static void main(String args[]){
        int array[]={5,4,1,3,2};
        //BubbleSort(array);
        //selection_sort(array);
        // Arrays.sort(array,Collections.reverseOrder());  //To use the collection function we have to put bigger "Integer" type
        countsort(array);
        printarray(array);
    }
}
