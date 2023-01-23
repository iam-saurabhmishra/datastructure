package practice.leet.demo;

/**
 * 1. You are given a number n, representing the number of houses.
 * 2. In the next n rows, you are given 3 space separated numbers
 *    representing the cost of painting nth house with red or blue or green color.
 * 3. You are required to calculate and print the minimum cost of painting all houses
 *    without painting any consecutive house with same color.
 */

public class PaintHouseLeetCode {
    public static void main(String[] args) {
            int arr[][] ={{1,5,7},
                    {5,8,4},
                    {3,2,9},
                    {1,2,4}};
            paintHouse(arr);
    }

    public static void  paintHouse(int[][] arr){
        int[][] dp=new int[arr.length][3];

        dp[0][0]=arr[0][0];
        dp[0][1]=arr[0][1];
        dp[0][2]=arr[0][2];

        for (int i = 1; i < dp.length; i++) {
            dp[i][0]=arr[i][0]+Math.min(dp[i-1][1],dp[i-1][2]);
            dp[i][1]=arr[i][1]+Math.min(dp[i-1][0],dp[i-1][2]);
            dp[i][2]=arr[i][2]+Math.min(dp[i-1][0],dp[i-1][1]);
        }

        int min=Integer.MAX_VALUE;
        for (int j = 0; j < 3; j++) {
            if(dp[dp.length-1][j]<min){
                min=dp[dp.length-1][j];
            }
        }


       /* for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(" "+dp[i][j]);
            }
            System.out.println("");
        }*/
        System.out.println("Minnimum Cost to Paint House is : "+min);
    }
}
