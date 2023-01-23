package practice.map.demo;

import java.util.HashMap;
import java.util.Map;

public class FindAllPairForATargetSum {
    public static void main(String[] args) {
        findAllPairForATargetSum(new int[]{2,3,6,8,1,5},7);
    }

    public static void findAllPairForATargetSum(int[] arr,int target){
        Map<Integer,Integer> map=new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i],0);
        }

        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(target-arr[i]) && map.get(arr[i])==0){
                System.out.println("Target Sum pair is :" +"("+ arr[i]+ ","+(target-arr[i])+")");
                map.put(target-arr[i],1);
            }
        }


    }
}
