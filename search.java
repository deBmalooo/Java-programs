//import java.util.*;

public class search {
    public static int linear_search(int numbers[],int key){
        int i;
        for(i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
        
    }
    public static void main(String args[]){
        int numbers[]={2,4,5,6,7,8,10};
        int key=1;
         int index = linear_search(numbers, key);
        if(index == -1){
            System.out.println("Not found");
        }
        else{
            System.out.println("Key is at index:"+index);
        }
    }
}
