package practice.sorting.demo;

public class BubbleSort {
    public static void main(String[] args) {
          int[] arr={4,2,3,7,9,1,10};
        int[] sortArray = bubbleSort(arr);
        for(int i:arr){
            System.out.print(" "+i+" ");
        }
    }

    private static int[] bubbleSort(int[] arr) {
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i]>arr[j]){
                    swap(arr,i,j);
                }
            }
        }
        return arr;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }
}
