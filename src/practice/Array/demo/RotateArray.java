package practice.Array.demo;

import java.util.Arrays;
//5 6 7 1 2 3 4
public class RotateArray {
    public static void main(String[] args) {

        int[] arr=new int[] {1,2,3,4,5,6,7};
        rotateArray(arr,3);
        Arrays.stream(arr).forEach((e)->System.out.print(e+" "));
    }

    public static void rotateArray(int[] arr, int k){
        if(k>0){
            k=k%arr.length;
        }
        else {
            k=(k%arr.length)+arr.length;
        }
        //revert Last K elements
        revertArray(arr,arr.length - k,arr.length-1);
        revertArray(arr,0,arr.length-k-1);
        revertArray(arr,0,arr.length-1);
    }

    public static void revertArray(int[] arr, int start,int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
