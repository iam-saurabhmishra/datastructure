package practice.Array.demo;

import java.util.ArrayList;
import java.util.Arrays;

public class SubArrayWithGivenSum {
    public static void main(String[] args) {
        int[] A = {1,2,3,7,5};
        System.out.println(subarraySum(A,A.length,12));
    }

    public static ArrayList<Integer> subarraySum(int[] arr, int n, int target) {
        {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(-1);//Default
            //Arrays.sort(arr);
            int sp = 0;
            int ep = 0;
            int sum = 0;
            while (ep < arr.length) {
                if (sum + arr[ep] < target) {
                    sum = sum + arr[ep];
                    ep++;
                } else if (sum + arr[ep] > target) {
                    sum = sum - arr[sp];
                    sp++;
                } else {
                    list.clear();
                    list.add(sp);
                    list.add(ep);
                    return list;
                }
            }
            return list;
        }
    }
}
