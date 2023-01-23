package practice.sorting.demo;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr={4,6,2,5,7,9,1,3};
        quickSort(arr,0,arr.length-1);
        Arrays.stream(arr).forEach((e)->{
            System.out.print(" "+e+" ");
        });

    }


    public static void quickSort(int[] arr,int s,int e){
        if(s<e){
            int pivot=partition(arr,s,e);
            quickSort(arr,s,pivot-1);
            quickSort(arr,pivot+1,e);
        }
    }

    private static int partition(int[] arr, int s, int e) {
        int pivot=arr[s];
        int i=s;
        int j=e;

        while (i<j){
            while (arr[i]<=pivot){
                i++;
            }
            while (arr[j]>pivot){
                j--;
            }
            if(i<j){
                swap(arr,i,j);
            }

        }
        swap(arr,j,s);

        return j;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }
}
