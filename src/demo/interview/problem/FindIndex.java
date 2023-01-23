package demo.interview.problem;

public class FindIndex {

    public static void main(String[] args) {

        Integer[] arr={1,2,3,4,5};
        System.out.println(getIndex1(arr,5,0,arr.length-1));

    }
    // Complexity : order of n
    static int getIndex(Integer[] arr,int num){
    for(int i=0;i<arr.length;i++){
        if(num==arr[i]){
            return i ;
        }
    }
    return -1;
    }

    // Complexity : lon n

    static int getIndex1(Integer[] arr,int num,int start,int end){

        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==num){
                return mid;
            }
            else if(num>arr[mid]){
                start=mid+1;
            }
            else {
                end=mid-1;
            }
        }
        return -1;
    }
}
