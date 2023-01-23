package practice.stack.demo;

import java.util.Arrays;

public class FindHistogramArea {
    public static void main(String[] args) {
        System.out.println("Area : "+getHistogramArea(new int[]{4,2,1,5,6,3,2,4,2}));
    }


    //CALCULATE AREA
    public static double getHistogramArea(int[] arr){
        double maxArea=0;
        double area=0;
        int[] a= Arrays.copyOf(arr,arr.length+1);
        a[arr.length]=-1;
        int[] ps=FindPreviousOrNextSammlestNumber.getPrivoiusSmallerNumberIndex(a);
        int[] ns=FindPreviousOrNextSammlestNumber.getNextSmallerNumberIndex(a);
        for (int i = 0; i < a.length; i++) {
            area=(ns[i]-ps[i]-1)*a[i];
            if(area>maxArea){
                maxArea=area;
            }
        }
        return maxArea;
    }
}
