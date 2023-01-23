package demo.interview.problem;

import java.util.*;

public class Anonymous {
    public static void main(String[] args) {
        /////STRING/////

        String s="saas";
        System.out.println(isPalindrome(s,0,s.length()-1));

        /////SORTING//////

       /* int[] arr={4,2,3,7,9,1};
        int[] sortArray=bubbleSort(arr);
        for(int i:arr){
            System.out.print(" "+i+" ");
        }*/

       ///////////////JOSHEP's PROBLEM////////////////

       //getWinner(6,3);

        //
        /*
    find if one arrray is a subset of another with the below dataset
    {1,2,4,5} , {2,5}  return true

    {2,5}, {3,2,7,5} return true

    {1,2}, {3,4} return false
    {1, 2,4,5}, {2,2,5} return false
    {1, 2,4,5, 2}, {2,2,5} return true*/

        //Duplicate are allowed
        //Empty Arrays
        Integer[] arr1={1,2,4,5};
        Integer[] arr2= {2,5};
        System.out.println(isSubArray(arr1,arr2));



    }

    private static int getWinner(int n, int k) {
        //saurabh
        return 0;

    }

    public static boolean isPalindrome(String str,int start,int end){
        boolean flag=false;
        if(start>=end){
            return true;
        }
        if(str.charAt(start)!=str.charAt(end)){
            return false;
        }
        return isPalindrome(str,start+1,end-1);

    }

    public static int[] bubbleSort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for (int j = 0; j < n-i-1; j++) {
                if(arr[j]>arr[j+1]){
                  int temp=arr[j];
                  arr[j]=arr[j+1];
                  arr[j+1]=temp;
                }
            }
        }
        return arr;
    }

    public static boolean isSubArray(Integer[] arr1, Integer[] arr2) {
        List<Integer> source;
        List<Integer> target;
        boolean flag = false;
        if (arr1.length > arr2.length) {
            source = Arrays.asList(arr1);
            target = Arrays.asList(arr2);
        } else {
            source = Arrays.asList(arr2);
            target = Arrays.asList(arr1);
        }
        for (Integer i : target) {
            int cSource = getCount(source, i);
            int ctarget = getCount(target, i);
            if (source.contains(i) && cSource == ctarget) {
                flag = true;
            } else {
                flag = false;
                break;
            }
        }
        return flag;
    }


    public static int getCount(List<Integer> list, int e) {
        int count = 0;
        for (Integer i : list) {
            if (i == e) {
                count++;
            }
        }
        return count;
    }
}
