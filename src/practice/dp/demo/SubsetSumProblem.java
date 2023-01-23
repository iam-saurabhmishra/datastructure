package practice.dp.demo;

public class SubsetSumProblem {
    public static void main(String[] args) {
            int[] arr={2,2,1,1};
        System.out.println(isSubsetSumPossible(arr,3));
    }

    public static boolean isSubsetSumPossible(int[] arr,int target){
        int n=arr.length;
        int m=target;
        boolean dp[][]=new boolean[n+1][m+1];

        for (int i = 0; i < dp.length; i++) {

            for (int j = 0; j < dp[0].length; j++) {
                if(j==0){
                    dp[i][j]=true;
                }
                else if(i==0){
                    dp[i][j]=false;
                }
                else if(arr[i-1]>j){
                    dp[i][j]=dp[i-1][j];
                }
                else{
                    dp[i][j]=dp[i-1][j] || dp[i-1][j-arr[i-1]];
                }
            }
        }

       /* for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(" "+dp[i][j]);
            }
            System.out.println("");
        }*/

        return dp[n][m];
    }


    public static int noOfsubsetWithGivenSum(int[] arr,int target){
        int n=arr.length;
        int m=target;
        boolean dp[][]=new boolean[n+1][m+1];

        for (int i = 0; i < dp.length; i++) {

            for (int j = 0; j < dp[0].length; j++) {
                if(j==0){
                    dp[i][j]=true;
                }
                else if(i==0){
                    dp[i][j]=false;
                }
                else if(arr[i-1]>j){
                    dp[i][j]=dp[i-1][j];
                }
                else{
                    dp[i][j]=dp[i-1][j] || dp[i-1][j-arr[i-1]];
                }
            }
        }

       /* for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(" "+dp[i][j]);
            }
            System.out.println("");
        }*/

        //return dp[n][m];
        return 0;
    }
}
