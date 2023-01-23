package practice.Array.demo;

import java.util.HashMap;
import java.util.Map;

public class CountSubarraysWithSumEqualsK {
    public static void main(String[] args) {

        int[] arr={-1,1,1,-1};
        System.out.println(countSubarraysWithSumEqualsK(arr,0));
    }

    public static int countSubarraysWithSumEqualsK(int[] arr,int target){

        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int count=0;
        int sum=0;

        for (int i = 0; i <arr.length; i++) {
            sum+=arr[i];
            if(map.containsKey(sum-target)){
                count+=map.get(sum-target);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        System.out.println(map);
        return count;
    }
}
