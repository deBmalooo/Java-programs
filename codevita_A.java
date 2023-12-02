import java.util.*;
public class codevita_A {
    public static void max_f(int ar[],int k,int c){
        int len=ar.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<len;i++){
            if(ar[i]>max){
                max=ar[i];
            }
        }
        search_pos(ar,max,k,c);
    }
    public static void search_pos(int ar[],int max,int k,int c){
        int i;
        for(i=0;i<ar.length;i++){
            if(ar[i]==max){
                raj_f(ar, i, k,c);
            }
        }
        //return -1;
    }
    public static void raj_f(int ar[],int mid,int k,int c){
        ar[mid]=0;
        c++;
        for(int i=0;i<mid;i++){
            if(ar[i]!=0){
                ar[i]=ar[i]+1;
            }
        }
        if(ar[k]==0){
            System.out.println(c);
        }
        else{
            max_f(ar, k,c);
        }
    }
    public static void main(String args[]){
        int c=0;
        Scanner sc=new Scanner(System.in);
        //Input
        int len=sc.nextInt();
        if(len>=2 && len<=25){
            //Entering the array
            int ar[]=new int[len];
            for(int i=0;i<len;i++){
                ar[i]=sc.nextInt();
            }
            int key=sc.nextInt();
            if(key>=1 && key<=len){
                max_f(ar,key-1,c);
            }
        }
    } 
}
