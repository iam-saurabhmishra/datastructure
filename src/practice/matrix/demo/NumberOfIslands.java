package practice.matrix.demo;

/**
 * Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of
 * islands.
 * An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically.
 * You may assume all four edges of the grid are all surrounded by water.
 *
 * Input: grid = [
 *   ["1","1","1","1","0"],
 *   ["1","1","0","1","0"],
 *   ["1","1","0","0","0"],
 *   ["0","0","0","0","0"]
 * ]
 * Output: 1
 */
public class NumberOfIslands {
    public static int MAX_ROW=0;
    public static int MAX_COL=0;
    public static void main(String[] args) {
        char[][] grid = {
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}
        };
        MAX_ROW=grid.length;
        MAX_COL=grid[0].length;
        System.out.println(numIslands(grid));

    }

    public static int numIslands(char[][] grid) {
        int no_Of_Island=0;


        for (int i = 0; i <MAX_ROW ; i++) {
            for (int j = 0; j < MAX_COL; j++) {

                if(grid[i][j]=='1'){
                    markVisited(grid,i,j);
                    no_Of_Island++;
                }

            }
        }
        return no_Of_Island;
    }

    private static void markVisited(char[][] grid, int i, int j) {

        if(i<0 || i>=MAX_ROW || j<0 || j>=MAX_COL || !(grid[i][j]=='1')){
            return;
        }

        grid[i][j]='2';
        markVisited(grid,i,j+1);
        markVisited(grid,i,j-1);
        markVisited(grid,i+1,j);
        markVisited(grid,i-1,j);
    }
}
