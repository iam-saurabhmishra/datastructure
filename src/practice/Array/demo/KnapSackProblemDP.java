package practice.Array.demo;

public class KnapSackProblemDP {
    public static void main(String[] args) {
        int[] val={1,2,3};
        int[] wt={4,5,1};
        System.out.println(knapSack(4,wt,val,3));
    }

    public static int knapSack(int W, int wt[], int val[], int n)
    {
        int[][] kBag=new int[n+1][W+1];

        for (int i = 1; i < kBag.length; i++) {
            for (int j = 0; j < kBag[0].length; j++) {
               if(j>=wt[i-1]){
                   int rCap=j-wt[i-1];
                   if(kBag[i-1][rCap]+val[i-1]>kBag[i-1][j]){
                       kBag[i][j]=kBag[i-1][rCap]+val[i-1];
                   }else{
                       kBag[i][j]=kBag[i-1][j];
                   }
               }
               else{
                   kBag[i][j]=kBag[i-1][j];
               }
            }
        }
        return kBag[n][W];
    }
}
