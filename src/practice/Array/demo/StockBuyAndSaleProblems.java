package practice.Array.demo;

import java.util.ArrayList;

//NOT YET SOLVED COMPLETELY

public class StockBuyAndSaleProblems {
    public static void main(String[] args) {
        int N = 18;
        //int A[] = {4,2,2,2,4};
        //int A[] = {100,180,260,310,40,535,695};
        int A[] = {11, 42, 49, 96, 23, 20, 49, 26, 26, 18, 73, 2, 53, 59, 34, 99, 25, 2};
        System.out.println(stockBuySell(A,A.length));
    }

    public static ArrayList<ArrayList<Integer>> stockBuySell(int A[], int N) {
        // code here
        int profit=0;
        int maxProfit=0;
        int bIndex=0;
        int sIndex=0;
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        for (int i = 0; i < A.length-1; i++) {
            for (int j = i+1; j <A.length ; j++) {
                if(A[j]>A[i] && maxProfit<(A[j]-A[i])){
                    profit=A[j]-A[i];
                    bIndex=i;
                    sIndex=j;
                    maxProfit=profit;

                }
                else if(A[j]==A[i]){
                    continue;
                }
                else if(A[j]<A[i] && profit>0){
                    sIndex=j-1;
                    break;
                }
                else{
                    bIndex=j;
                    sIndex=j;
                    break;
                }
            }
            if (bIndex<sIndex && profit>=maxProfit){
                ArrayList<Integer> list=new ArrayList<>();
                list.add(bIndex);
                list.add(sIndex);
                result.add(list);
                maxProfit=profit;
            }
        }

        return result;
    }

    public static ArrayList<ArrayList<Integer>> stockBuySell_1(int A[], int n) {
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
       // ArrayList<Integer> trade=new ArrayList<>();
        ArrayList<Integer> index=new ArrayList<>();

        //int A[] = {4,2,2,2,4};
        //int A[] = {100,180,260,310,40,535,695};
        //int A[] = {11, 42, 49, 96, 23, 20, 49, 26, 26, 18, 73, 2, 53, 59, 34, 99, 25, 2};
        int profit=0;
        int min=A[0];
        int bIndex=0;

        for (int i = 1; i < n; i++) {

            if (A[i] != A[i - 1]) {
                if (A[i] < min) {
                    bIndex = i;
                    min = A[i];
                } else if (A[i] > min) {

                    int tempProfit = A[i] - A[bIndex];
                    if (tempProfit > profit) {

                        profit = tempProfit;
                        if(i==n-1){
                            ArrayList<Integer> list=new ArrayList<>();
                            list.add(bIndex);
                            list.add(i);
                            result.add(list);
                            if(!index.isEmpty()){
                                for(Integer s:index){
                                    ArrayList<Integer> list1=new ArrayList<>();
                                    list1.add(s);
                                    list1.add(i);
                                    result.add(list1);
                                }
                                index.clear();
                            }
                        }

                    } else {
                        ArrayList<Integer> trade=new ArrayList<>();
                        trade.add(bIndex);
                        trade.add(i - 1);
                        result.add(trade);
                        for(Integer s:index){
                            ArrayList<Integer> list=new ArrayList<>();
                            list.add(s);
                            list.add(i-1);
                            result.add(list);
                        }
                        bIndex = 1;
                        min = A[i];
                        index.clear();
                    }

                }
            }
            else {
                index.add(i);
            }



        }

        return result;
    }

    public static ArrayList<ArrayList<Integer>> sellBuyStock2(int A[], int n){
        // code here
        ArrayList<ArrayList<Integer>> arrlist = new ArrayList<ArrayList<Integer>>();

        ArrayList<Integer> localArr = new ArrayList<Integer>();

        int diff = 0, pos = 0;
        boolean buy = false, sell = false;

        for(int i = 0; i < n; i++){
            if(buy && sell){
                arrlist.add(localArr);
                // System.out.println("visited");
                localArr = new ArrayList<Integer>();
                buy = false;
                sell = false;
            }
            if(i == n-1){
                break;
            }
            int temp = A[i+1]-A[pos];
            // System.out.println(temp);
            if(temp >= diff){
                if(!buy){
                    buy = true;
                    localArr.add(i);
                    // System.out.println("Buy-" + i);
                    pos = i;
                }
                diff = temp;

            } else if((temp < diff)){
                if(buy){
                    localArr.add(i);
                    sell = true;
                    // System.out.println("Sell-"+i);
                }
                diff = 0;
                pos = i+1;

            }
        }

        if(buy && !sell){
            localArr.add(n-1);
            arrlist.add(localArr);
        }

        // System.out.println(arrlist.size());
        //     for(int i = 0; i < arrlist.size(); i++){
        //         for(int j = 0; j < arrlist.get(i).size(); j++)
        //         {
        //             System.out.println(arrlist.get(i).get(j));
        //         }
        //     }
        return arrlist;
    }

    /**
     * You are given an array prices where prices[i] is the price of a given stock on the ith day.
     *
     * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
     *
     * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
      * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {

        int minSoFar=prices[0];
        int maxprofit=0;


        for (int i = 0; i < prices.length; i++) {

            minSoFar=Math.min(minSoFar,prices[i]);
            int profit=prices[i]-minSoFar;
            maxprofit=Math.max(maxprofit,profit);
        }
        return maxprofit;

    }

    /** 122. Best Time to Buy and Sell Stock II
     * You are given an integer array prices where prices[i] is the price of a given stock on the ith day.
     *
     * On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time. However, you can buy it then immediately sell it on the same day.
     *
     * Find and return the maximum profit you can achieve.
     */

    public int maxProfit_II(int[] prices) {


        int maxProfit=0;

        for (int i = 1; i < prices.length; i++) {
           if(prices[i]>prices[i-1]){
               maxProfit=maxProfit+(prices[i]-prices[i-1]);
           }
        }
        return maxProfit;
    }
    }



