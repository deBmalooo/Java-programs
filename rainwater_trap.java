public class rainwater_trap{
    public static int trappedwater(int height[]){
        //Finding the leftmax array
        int len=height.length;
        int leftmax[]=new int[len];
        leftmax[0]=height[0];
        for(int i=1;i<len;i++){
            leftmax[i]=Math.max(height[i], leftmax[i-1]);
        }
        //Finding the rightmax array
        int rightmax[]=new int[len];
        rightmax[len-1]=height[len-1];
        for(int i=len-2;i>=0;i--){
            rightmax[i]=Math.max(height[i], rightmax[i+1]);
        }
        //loop
        int trapped=0;
        for(int i=0;i<=len-1;i++){
            int waterlevel=Math.min(leftmax[i],rightmax[i]);
            trapped+=waterlevel-height[i];
        }
        return trapped;
    }

    public static void main(String args[]){
        int height[]={4,2,0,6,3,2,5};
        System.out.println(trappedwater(height));
    }
} 