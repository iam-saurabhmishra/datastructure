package practice.matrix.demo;

public class MatrixTranspose {
    public static void main(String[] args) {
        int[][] matrix={{1,2},
                        {3,4},
                        {5,6},
                        {7,8},
                        {9,10}};
        int row=matrix.length;
        int col=matrix[0].length;
        int[][] transposeMatrix=new int[col][row];
        for (int i = 0; i <col ; i++) {
            for (int j = 0; j <row ; j++) {
                transposeMatrix[i][j]=matrix[j][i];
            }
        }

        for (int i = 0; i <col ; i++) {
            for (int j = 0; j <row ; j++) {
                System.out.print(transposeMatrix[i][j]+" ");
            }
            System.out.println("");
        }


    }
}
