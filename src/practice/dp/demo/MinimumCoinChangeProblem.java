package practice.dp.demo;

import java.util.Arrays;

public class MinimumCoinChangeProblem {
    public static void main(String[] args) {
        int[] coins={2};
        System.out.println("Minumum Coin : "+coinChange1(coins,3));
    }

    public static int coinChange1(int[] coins, int amount) {
        int n=coins.length;
        int m=amount;
        int[][] dp=new int[n+1][m+1];

        for (int i = 0; i<=coins.length; i++) {
            for (int j = 0; j <=amount; j++) {
                if(j==0){
                    dp[i][j]=0;
                }
                else if(i==0){
                    dp[i][j]=Integer.MAX_VALUE;
                }
                else{
                    if(j<coins[i-1]){
                        dp[i][j]=dp[i-1][j];
                    }
                    else{
                        int remaining=dp[i][j-coins[i-1]];
                        if(remaining==Integer.MAX_VALUE)
                            dp[i][j]= Math.min(dp[i][j-coins[i-1]],dp[i-1][j]);
                        else
                            dp[i][j]= Math.min(1+dp[i][j-coins[i-1]],dp[i-1][j]);
                    }
                }
                //printdp(dp);
            }
        }


        return (dp[n][m]==Integer.MAX_VALUE)?-1:dp[n][m];
    }

    public static int coinChange(int[] coins, int amount) {

        if(amount==0){
            return 0;
        }
        int ans =Integer.MAX_VALUE;

        for (int i = 0; i < coins.length; i++) {
            if(amount-coins[i]>=0){
                int subAns=coinChange(coins,amount-coins[i]);

                if(subAns!=Integer.MAX_VALUE && subAns+1<ans){
                    ans=subAns+1;
                }
            }
        }
        return (ans!=Integer.MAX_VALUE && ans!=0)?ans:-1;
    }

    public static void printdp(int[][] dp){
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(" "+dp[i][j]);
            }
            System.out.println("");
        }

        System.out.println("*****************************************************");
    }
}
