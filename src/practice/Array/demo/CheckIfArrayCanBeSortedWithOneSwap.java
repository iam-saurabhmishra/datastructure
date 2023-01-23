package practice.Array.demo;

import java.util.Arrays;

public class CheckIfArrayCanBeSortedWithOneSwap {
    public static void main(String[] args) {
        System.out.println(checkIfArrayCanBeSortedWithOneSwap_1(new int[]{1, 2, 4, 3, 5,9}));
    }


    public static boolean checkIfArrayCanBeSortedWithOneSwap(int[] arr){

        int b[]=new int[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            b[i]=arr[i];
        }
        Arrays.sort(b);
        int counter=0;
        for (int i = 0; i <arr.length ; i++) {
           if(arr[i]!=b[i]){
               counter++;
            }
        }

        if(counter==0 || counter==2){
            return true;
        }
        return false;
    }

    public static boolean checkIfArrayCanBeSortedWithOneSwap_1(int[] arr){
        int count=0;
        int first=0,second=0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<arr[i-1]){
                count++;
                if (first==0){
                    first=i;
                }
                else {
                    second=1;
                }
            }
        }
        if(count>2){
            return false;
        }
        if(count==0){
            return true;
        }
        if(count==1){
            swap(arr,first-1,first);
        }
        if(count==2){
            swap(arr,first-1,second);
        }
        for (int i = 1; i <arr.length ; i++) {
            if(arr[i]<arr[i-1]){
                return false;
            }
            else
                return true;
        }

        return false;
    }

    private static void swap(int[] arr, int i, int first) {
        int temp=arr[first];
        arr[first]=arr[i];
        arr[i]=temp;
    }
}
