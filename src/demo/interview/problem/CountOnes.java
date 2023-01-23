package demo.interview.problem;


public class CountOnes {
    public static void main(String[] args) {

        //A= [ 1 1 1 1  0 0 0 0 0]

        int arr[]={0,0,0,0,0,0};
        System.out.println(getCount(arr));

    }


    public static int getCount(int[] arr){
        int totalCount=0;
        int start=0;
        int end=arr.length-1;

        while (start<=end){
            int tempCount=getOnesCount(arr,start,end);
            int mid=(start+end)/2;
            if(tempCount>0){
                totalCount=totalCount+tempCount;
                start =mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return totalCount;
    }

    public static int getOnesCount(int[] arr,int start,int end){
        int mid=(start+end)/2;

        if (arr[mid]==1){
            return end-start+1;
        }
        else{
            return 0;
        }

    }

    public static int get1Count(int[] arr,int start,int mid){
        int count=0;
        for (int i = start; i <=mid ; i++) {
            if(arr[i]==1){
                count++;
            }
        }
        return count;
    }



}
