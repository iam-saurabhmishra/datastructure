package practice.Array.demo;

public class SortNegativeAndPositiveNumbers {
    public static void main(String[] args) {
        int[] arr={-9, 10, 11,12,-13,-14,-15,16,17,-18,-19,20 ,-21,-22};
        sortNumbers(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+arr[i]);
        }
    }

    public static void sortNumbers(int[] arr){
        int start=0;
        int end=arr.length-1;

        while(arr[start]<=end){

            if(arr[start]<0){
                start++;
            }
            else if(arr[end]>0){
                end--;
            }
            else if(arr[start]>0 && arr[end]<0){
                swap(arr,start,end);
                start++;
                end--;
            }
        }
    }

    private static void swap(int[] arr, int start, int end) {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
