package practice.stack.demo;

public class LargestAreaSubMatrix {
    public static void main(String[] args) {
        int[][] matrix ={{1,1,0,1,1},{1,1,1,1,1},{0,1,1,1,1},{1,1,1,1,1},{1,0,1,1,1},{1,1,1,1,1}};
        System.out.println(getLargestAreaSubMatrix(matrix));
    }
    
    public static double getLargestAreaSubMatrix(int[][] matrix){
        double maxArea=0;
        double area=0;
        int[] currRow=matrix[0];
        area=FindHistogramArea.getHistogramArea(currRow);
       for (int i = 0; i <matrix.length ; i++) {
           for (int j = 0; j <matrix[i].length ; j++) {
               if(matrix[i][j]==1){
                   currRow[j]=currRow[j]+1;
               }
               else if(matrix[i][j]==0){
                   currRow[j]=0;
               }
           }
        }
        maxArea=FindHistogramArea.getHistogramArea(currRow);
        return maxArea;
    }

}
