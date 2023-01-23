package practice.tree.demo;

import java.util.ArrayList;

public class ArraytoBST {

    private static int x=0;
    public static void main(String[] args) {
        int[] nums = {-8 ,4};
        int[] result=sortedArrayToBST(nums);
        for(Integer i:result){
            System.out.print( " "+i);
        }

    }

    public static int[] sortedArrayToBST(int[] nums)
    {
        int[] res=new int[nums.length];
        sortedArrayToBSTUtility(nums,0,nums.length-1,res,0);
        return res;


    }

    private static void sortedArrayToBSTUtility(int[] nums, int start, int end,int[] res,int count) {

        if(start>end){
            return ;
        }

        int mid=(start+end)/2;
        res[x++]=nums[mid];
        sortedArrayToBSTUtility(nums,start,mid-1,res,count+1);

        sortedArrayToBSTUtility(nums,mid+1,end,res,count+1);

    }
}
