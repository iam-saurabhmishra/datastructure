package practice.Array.demo;

import java.util.ArrayList;
import java.util.List;

public class GetContigiousSumSubArrayIndex {
    /**
     * {-2, -3, 4, -1, -2, 1, 5, -3}
     * 2,6
     *
     */

    public static void main(String[] args) {
        //int arr[]={-2, -3, 4, -1, -2, 1, 5, -3};
        //int arr[]={-2, -3, 4, -1, -2, 1, 5, -3, 5, 6, -2, 9, 12};
        int arr[]={-2, -3, 4, -1, -2, 1, 5, -3, 5, 6, -19, 9, 12};
        getContigiousMaxSubArray(arr);
    }

    public static void getContigiousMaxSubArray(int[] arr){

        int maxSum=0;
        int currSum=0;
        List<Integer> list=new ArrayList<>();

        for (int i = 0; i <arr.length ; i++) {
            currSum=currSum+arr[i];

            if(maxSum<currSum){
                maxSum=currSum;
                list.add(i);
            }

            if(currSum<0){
                currSum=0;
                list.clear();
                list.add(i+1);
            }
        }
        if(!list.isEmpty())
            System.out.println("Start Index : "+list.get(0) + " End Index : "+list.get(list.size()-1));
        else
            System.out.println(-1);
    }

}
