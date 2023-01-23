package practice.dp.demo;

public class FindOptimalPathForRockCollector {
    public static void main(String[] args) {
        int [][] matrix={{0,0,0,0,5},
                         {0,1,1,1,0},
                         {2,0,0,0,0}};
        System.out.println("Optimal path with max rock is : "+getOptimalPathForRockCollector(matrix));
    }

    public static int getOptimalPathForRockCollector(int[][] arr){
        int dp[][]=new int[arr.length][arr[0].length];

        for (int i = 0; i <arr.length ; i++) {
            for (int j = arr[0].length-1; j >= 0; j--) {

                if(i==0 && j==arr[0].length-1){
                    dp[i][j]=arr[i][j];
                }
                else if(i==0){
                    dp[i][j]=arr[i][j]+dp[i][j+1];
                }
                else if(j==arr[0].length-1){
                    dp[i][j]=arr[i][j]+dp[i-1][j];
                }
                else {
                    dp[i][j]=arr[i][j]+ Math.max(dp[i][j+1],dp[i-1][j]);
                }
            }

        }
        return dp[arr.length-1][0];
    }
}
