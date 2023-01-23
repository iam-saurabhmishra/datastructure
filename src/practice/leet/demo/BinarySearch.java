package practice.leet.demo;

public class BinarySearch {
    public static void main(String[] args) {
    int[] arr={1,2,3,4,5,6,7,8,9,11};
    int max=arr.length-1;
    int min=0;
    int result=search(arr,max,min,6);
        System.out.println(result);
    }

    public static int search(int[] arr,int max,int min, int target) {
        int mid=0;
        while(min<=max){
          mid=(min+max)/2;
          if(target==arr[mid]){
              return mid;
          }
          else if(target>arr[mid]){
               min=mid+1;
          }
          else {
              max=mid-1;
          }
        }
    return -1;
    }
}
