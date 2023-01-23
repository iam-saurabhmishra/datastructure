package practice.Array.demo;

public class SortArrayProblems {
    public static void main(String[] args) {
        int a[]=sortArrayWith01(new int[] {1,1,1,0,0,0,1,0,0,0,1});
        for (int e:a){
            System.out.print(e+" ");
        }
    }

    public static int[] sortArrayWith01(int arr[]){
        int start = 0;
        int end = arr.length-1;
         while (start<=end){
             if(arr[start]>arr[end]){
                 swap(arr,start,end);
                 start++;
                 end--;
             }
             else if(arr[start]==arr[end]){
                 end--;
             }
             else{
                 start++;
             }
         }
        return arr;
    }

    public static int[] sortArrayWith012(int[] arr){

        int start=0;
        int mid=0;
        int end=arr.length-1;
         while (mid<=end){

             switch (arr[mid]){
                 case 0:
                    swap(arr,start,mid);
                    start++;
                    mid++;
                    break;
                 case 1:
                     mid++;
                     break;
                 case 2:
                     swap(arr,mid,end);
                     end--;
                     break;
             }
         }

        return arr;
    }

        private static void swap(int[] arr,int i,int j){
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
        }
}
