package practice.dp.demo;

/**
 * 1. You are given a number n, representing the number of rows.
 * 2. You are given a number m, representing the number of columns.
 * 3. You are given n*m numbers, representing elements of 2d array a, which represents a gold mine.
 * 4. You are standing in front of left wall and are supposed to dig to the right wall. You can start from 
 * any row in the left wall.
 *
 * 5. You are allowed to move 1 cell right-up (d1), 1 cell right (d2) or 1 cell right-down(d3). 
 */
public class PathWithMaximumGold {
    public static void main(String[] args) {
       int[][] arr ={{2,2},
            {2,3},{4,5}};
        System.out.println(pathWithMaximumGold(arr));
    }
    
    public static int pathWithMaximumGold(int[][] arr){
        
        int[][] dp=new int[arr.length][arr[0].length];
        


        for (int j = arr[0].length-1; j >=0 ; j--) {
            for (int i = arr.length-1; i>=0; i--) {
              if(j==arr[0].length-1){
                  dp[i][j]=arr[i][j];
              }
              else if(i==arr.length-1){
                        dp[i][j]=arr[i][j]+Math.max(arr[i][j+1],arr[i-1][j+1]);
              }
              else if(i==0){
                  dp[i][j]=arr[i][j]+Math.max(arr[i][j+1],arr[i+1][j+1]);
              }
              else {
                  dp[i][j]=arr[i][j]+Math.max(Math.max(arr[i+1][j+1],arr[i][j+1]),arr[i+1][j+1]);
              }
            }
        }
        int max=dp[0][0];
        for (int i = 0; i < dp.length; i++) {
            if(max<dp[i][0]){
                max=dp[i][0];
            }
        }
        
        return max;
    }
}
