package practice.matrix.demo;


import java.util.ArrayList;
import java.util.List;

/**
 * Easy-1260
 * Given a 2D grid of size m x n and an integer k. You need to shift the grid k times.
 *
 * In one shift operation:
 *
 * Element at grid[i][j] moves to grid[i][j + 1].
 * Element at grid[i][n - 1] moves to grid[i + 1][0].
 * Element at grid[m - 1][n - 1] moves to grid[0][0].
 * Return the 2D grid after applying shift operation k times.
 * Input: grid = [[1,2,3],[4,5,6],[7,8,9]], k = 1
 * Output: [[9,1,2],[3,4,5],[6,7,8]]
 */
public class Shift2DGrid {
    public static void main(String[] args) {
        int[][] grid = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(shiftGrid(grid,10));
    }

    public static List<List<Integer>> shiftGrid1(int[][] grid, int k) {

        List<List<Integer>> list=new ArrayList<>();
        int[][] res=new int[grid.length][grid[0].length];

        for (int l = 1; l <= k; l++) {
            res=new int[grid.length][grid[0].length];
            for (int j = 0; j < grid[0].length-1; j++) {
                for (int i = 0; i < grid.length; i++) {
                    res[i][j+1]=grid[i][j];
                }
            }
            for (int i = 0; i < grid.length-1; i++) {
                res[i+1][0] = grid[i][grid[0].length-1];
            }
            res[0][0]=grid[grid.length-1][grid[0].length-1];

            System.out.println("GRID ARRAY");

            printArray(grid);

            System.out.println("RES ARRAY");
            printArray(res);
            grid=res;
            //res=new int[grid.length][grid[0].length];
            System.out.println("GRID ARRAY AFTER REASSIGNMENT");
            printArray(grid);
            System.out.println("*******************************");
        }



        for (int i = 0; i < res.length; i++) {
            List<Integer> tl= new ArrayList<>();
            for (int j = 0; j < res[0].length; j++) {
                tl.add(res[i][j]);
            }
            list.add(tl);
        }
    return list;
    }

    //Working ***********

    public static List<List<Integer>> shiftGrid(int[][] grid, int k){
        int row = grid.length;
        int col = grid[0].length;

        // Create temporary array of the same size in which we will add element in new position after k shifting.
        int temp[][] = new int[row][col];

        // Solution Approach:
        // Assume if we convert given array into 1D Array then shift element to k positions and after shifting all the elements we will again convert 1D
        // Array to our original dimention array.

        // Logic for Finding current elements's index in 1D Array after shifting K times :
        // For current element We will just find that what will be it's index in 1D Array
        // After for New postion in 1D Array we will shift it k times means we will add K in current index
        // And if new positon in 1D Array get's increased by it's total size, we will modulo it by 1D Array Size

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {

                // (i * col) + j : will Give Index in 1D Array
                // (i * col) + j + k : Adding K means we will shift it k times
                // ((i * col) + j + k ) % (row * col) : modulo it by array size (row * col), if it exceeds the size
                int indexIn1DArray = ((i * col) + j + k ) % (row * col);

                // Now Based on the 1D Array Index we will find it's index in our temporary result array
                int tempRowIndex = indexIn1DArray / col; // Find the particular row
                int tempColIndex = indexIn1DArray % col; // Find the particular column
                temp[tempRowIndex][tempColIndex] = grid[i][j]; // Add Element at that new index in our temporary result array
            }
        }

        // Prepare Result in List
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        for(int i = 0; i < row; i++) {
            List<Integer> list = new ArrayList<Integer>();
            for(int j = 0; j < col; j++) {
                list.add(temp[i][j]);
            }
            result.add(list);
        }

        return result;
    }

    public static void printArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(" "+arr[i][j]);
            }
            System.out.println("");
        }
    }
}
