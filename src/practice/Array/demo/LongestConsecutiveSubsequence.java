package practice.Array.demo;

import java.util.Arrays;

public class LongestConsecutiveSubsequence {
    public static void main(String[] args) {
        //int arr[]={1,9,3,10,4,20,2};
        int arr[]={6,6,2 ,3 ,1 ,4 ,1, 5, 6, 2, 8 ,7 ,4 ,2 ,1 ,3 ,4 ,5, 9, 6};
      //  Arrays.stream(arr).forEach(x->System.out.print(" "+x));
        System.out.println( findLongestConseqSubseq(arr,arr.length));
    }

    static int findLongestConseqSubseq(int arr[], int N)
    {
        Arrays.sort(arr);

        int lastNumber=arr[0];
        int count=0;
        int maxCount=0;

        for (int i = 1; i < arr.length; i++) {
           if(arr[i]!=lastNumber){
               if(1+lastNumber==arr[i]) {
                   count++;
               }
               else{
                   count=0;
               }
               maxCount=Math.max(count,maxCount);

           }
            lastNumber=arr[i];
        }

        return maxCount+1;

    }


}
