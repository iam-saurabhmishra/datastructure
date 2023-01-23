package practice.Array.demo;


import java.util.PriorityQueue;

public class KthLargestNumber {
    public static void main(String[] args) {

        int[] arr={7, 10, 4, 3, 20, 15} ;
        System.out.println(findKthLargestNumber(arr,3));
    }

    public static int findKthLargestNumber(int[] arr,int k){

        PriorityQueue<Integer> pq=new PriorityQueue<>();

        for (int i = 0; i < k; i++) {
            pq.add(arr[i]);
        }

        for (int i = k; i <arr.length ; i++) {
                if(arr[i]>pq.peek()){
                    pq.poll();
                    pq.add(arr[i]);
                }
        }
        return pq.peek();
    }
}
