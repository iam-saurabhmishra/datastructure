package practice.Array.demo;

import java.util.ArrayList;
import java.util.List;

public class MaxElementInGivenWindow {
    public static void main(String[] args) {
        int[] arr={-5,2,-4,3,1};
        List<Integer> list=getMaxInGivenWindow(arr,2);
        list.stream().forEach((k)->{
            System.out.println(" "+k);
        });
    }

    public static List<Integer> getMaxInGivenWindow(int[] arr, int k){
        List<Integer> result=new ArrayList<>();
        int start=0;
        int end=0;
        int max=Integer.MIN_VALUE;

        while (end<arr.length){
            max=arr[end];
            for (int i = start; i <start+k ; i++) {
            }
            while(end-start<k){
                max=Math.max(max,arr[end]);
                end++;
            }
            result.add(max);
            if(start==arr.length-k){
                return result;
            }
            else{
                start++;
                end=start;
            }
        }
        return result;
    }
}
