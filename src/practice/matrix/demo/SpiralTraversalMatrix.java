package practice.matrix.demo;

public class SpiralTraversalMatrix {
    public static void main(String[] args) {
        int[][] arr={{12,13,14,15,16},
                     {22,23,24,25,26},
                     {32,33,34,35,36},
                     {42,43,44,45,46},
                     {52,53,54,55,56}};

        getSpiralTraversalMatrix(arr);
    }

    public static void getSpiralTraversalMatrix(int[][] arr){

        int minr=0;
        int minc=0;
        int maxr=arr.length-1;
        int maxc=arr[0].length-1;
        int tn=(maxc+1)*(maxr+1);
        int cn=0;
        while (cn<tn){
            //left
            for (int i = minr,j=minc; i <=maxr && cn<tn ; i++) {
                System.out.print(" "+arr[i][j]+" ");
                cn++;
            }
            minc++;
            System.out.println("");
            //bottom
            for (int j = minc,i=maxr; j <=maxc && cn<tn; j++) {
                System.out.print(" "+arr[i][j]+" ");
                cn++;
            }
            maxr--;
            System.out.println("");
            //right
            for (int i = maxr,j=maxc; i >=minr && cn<tn ; i--) {
                System.out.print(" "+arr[i][j]+" ");
                cn++;
            }
            maxc--;
            System.out.println("");
            //top
            for (int j = maxc,i=minr; j >=minc  && cn<tn; j--) {
                System.out.print(" "+arr[i][j]+" ");
                cn++;
            }
            minr++;
            System.out.println("");
        }
    }
}
