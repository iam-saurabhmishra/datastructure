package practice.backtracking.demo;

public class ValidSudoku {
    public static void main(String[] args) {

    }

    public static boolean isValidSudoku(int[][] board) {



        return solveSudoko(board,0,0);
    }

    public static boolean solveSudoko(int[][] board,int i,int j) {

        int ni=0;
        int nj=0;

        if(j==board[0].length-1){
            ni=ni+1;
            nj=j;
        }
        else{
            ni=i;
            nj=j+1;
        }

        if(board[i][j]!=0){
            solveSudoko(board,ni,nj);
        }
        else{
            for (int pos = 1; pos <=9 ; pos++) {
                if(isValidPos(board,pos,i,j)){

                }
            }
        }


        return false;
    }

    private static boolean isValidPos(int[][] board, int pos, int x, int y) {
        for (int i = 0; i < board.length; i++) {
            if(board[i][y]==pos){
                return false;
            }
        }
        for (int j  = 0; j < board.length; j++) {
            if(board[x][j]==pos){
                return false;
            }
        }

        int smi=3*(x/3);
        int smj=3*(y/3);
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
               if( board[smi+i][smj+j]==pos){
               return false;
               }
            }
            }

        return true;
        }
}
