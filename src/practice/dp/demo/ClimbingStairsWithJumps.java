package practice.dp.demo;

public class ClimbingStairsWithJumps {
    public static void main(String[] args) {
        int[] arr={5,5,2,4,1,5,9,8,6,3,8,9,1};
        System.out.println(climbingStairsWithJumps(arr));
    }

    public static int climbingStairsWithJumps(int[] arr){
        int n=arr.length;
        int[] dp=new int[n+1];
        dp[n]=1;

        for (int i = n-1; i >=0 ; i--) {
            for (int j = 1; j <=arr[i] && (i+j)<dp.length ; j++) {
                dp[i]+=dp[i+j];
            }
        }

        return dp[0];
    }
}
