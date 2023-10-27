public class stocks {
    public static int buyandsellstocks(int prices[]){
        int buyPrices=Integer.MAX_VALUE;
        int maxProfit=0;

        for(int i=0;i<prices.length;i++){
            if(buyPrices<prices[i]){ //profit
                int profit = prices[i]-buyPrices;
                maxProfit=Math.max(maxProfit,profit);
            }
            else{
                buyPrices = prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String args[]){
        int prices[]={7,1,5,3,6,4};
        System.out.println("The max profit is:"+buyandsellstocks(prices)+" Rupee");
    }
}
