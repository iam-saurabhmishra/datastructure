package practice.leet.demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 */

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap();

        map.put(nums[0], 0);
        for(int i=1;i<nums.length;i++){
            if(map.containsKey(target - nums[i])){            //Check if the target-current element present in the map or not
                return new int[]{map.get(target-nums[i]), i}; // if present then return the ans
            }
            map.put(nums[i], i);                             //add the current element to the map
        }
        return null;
    }

    public static void main(String[] args) {
        TwoSum twoSum=new TwoSum();
        int arr[]={3,2,3};
        Arrays.stream(twoSum.twoSum(arr, 6)).forEach(System.out::println);
    }
}
