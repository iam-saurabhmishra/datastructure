package practice.Array.demo;


public class StockBuyAndSale2 {
    /**
     * You are given an array prices where prices[i] is the price of a given stock on the ith day.
     * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
     * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
     * Example 1:
     * Input: prices = [7,1,5,3,6,4] Output: 5 Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
     * Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
     *
     */
    public static void main(String[] args) {
        int[] arr={7,5,3,6,4,1};
        //int[] arr={1,1,1,1,1,1};
        System.out.println(maximumProfit(arr));


    }

    public static int maximumProfit(int[] arr){

        int profit=0;
        int min=arr[0];
        int buyingIndex=0;
        int sellingIndex=-1;
        for (int i = 1; i <arr.length ; i++) {
            if(arr[i]<arr[i-1]){
                if(arr[i]<min){
                    buyingIndex=i;
                }
                min=Math.min(arr[i],min);
            }else{
                if(arr[i]-min>profit){
                    sellingIndex=i;
                }
                profit=Math.max(arr[i]-min,profit);
            }
        }
        System.out.println(buyingIndex);
        System.out.println(sellingIndex);
        return profit;

    }
}
