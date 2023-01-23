package practice.dp.demo;

public class ClimbingStairsWithMinimumMoves {
    public static void main(String[] args) {
        int[] arr={3,2,4,2,0,2,3,1,2,2};
        System.out.println(climbingStairsWithMinimumMoves(arr));
    }

    public static int climbingStairsWithMinimumMoves(int[] arr){
        int n=arr.length;
        int[] dp=new int[n+1];
        dp[n]=0;
        for (int i = n-1; i >=0 ; i--) {
            int min=Integer.MAX_VALUE;
            for (int j = 1; j <=arr[i] && (i+j)<dp.length ; j++) {
                if(dp[i+j]<min){
                    min=dp[i+j];
                }
            }
            if(min!=Integer.MAX_VALUE)
                dp[i]=min+1;
            else
                dp[i]=Integer.MAX_VALUE;
        }
        return dp[0];
    }
}
