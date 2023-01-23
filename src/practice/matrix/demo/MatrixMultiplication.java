package practice.matrix.demo;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int A[][] = {{1, 1, 1},
                     {2, 2, 2},
                     {3, 3, 3},
                     {4, 4, 4}};
        int B[][] = {{1, 1, 1, 1},
                     {2, 2, 2, 2},
                     {3, 3, 3, 3}};

        int[][] result=matrixMultiplication(A,B);
        for (int i = 0; i <result.length ; i++) {
            for (int j = 0; j <result[0].length ; j++) {
                System.out.print(" "+result[i][j]+" ");
            }
            System.out.println("");
        }
    }

    public static int[][] matrixMultiplication(int[][] A,int[][] B){
        int r1=A.length;
        int r2=B.length;
        int c1=A[0].length;
        int c2=B[0].length;

        int[][] result=new int[r1][c2];

        if(c1!=r2){
            System.out.println("Matrix multiplication is not possible");
            return result;
        }

        for (int i = 0; i <result.length ; i++) {
            for (int j = 0; j <result[0].length; j++) {
                for (int k = 0; k <c1 ; k++) {
                    result[i][j]+=A[i][k]*B[k][j];
                }
            }
        }

        return  result;
    }
}
