package practice.dp.demo;

public class MinimumPathSum {
    public static void main(String[] args) {
        int grid[][]={{1,3,1},
                      {1,5,1},
                      {4,2,1}};

        System.out.println("Minimum Cost for Traversal : "+minPathSum(grid));
    }

    public static int minPathSum(int[][] grid) {

        int[][] dp=new int[grid.length][grid[0].length];

        for (int i = grid.length-1; i >=0 ; i--) {
            for (int j = grid[0].length-1; j >=0 ; j--) {

                if(i==grid.length-1 && j==grid[0].length-1){
                   dp[i][j]=grid[i][j];
                }
                else if(i==grid.length-1){
                    dp[i][j]=grid[i][j]+dp[i][j+1];
                }
                else if(j==grid[0].length-1){
                    dp[i][j]=grid[i][j]+dp[i+1][j];
                }
                else{
                    dp[i][j]=grid[i][j] + Math.min(dp[i][j+1],dp[i+1][j]);
                }
            }
        }

        
        return dp[0][0];
    }

}