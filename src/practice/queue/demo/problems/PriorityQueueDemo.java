package practice.queue.demo.problems;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {

    //*****Find Kth largest/minimum no in a array************************************
        //Integer[] arr=new Integer[]{20,10,60,30,50,40};
        //System.out.println(getKthMaximumApp2(arr,3));

    //*****Connect N ropes with minimum cost ****************************************
        //Integer[] arr=new Integer[]{2,5,4,8,6,9};
        //System.out.println(getMinimumCostForRopeConnect(arr));

    //*****Find median of a given array **********************************************
        Integer[] arr=new Integer[]{1,3,5,7,11};
        System.out.println(getMedianOfGivenArray(arr));

    }

    //Approach 1 : O(nlogn)********************************************************************
    private static int getKthMaximumApp1(Integer[] arr,int k){

        Arrays.sort(arr, Collections.reverseOrder());
        if(arr.length>k)
            return arr[k-1];
        return -1;
    }

    //Approach 1 : O(n)************************************************************************
    private static int getKthMaximumApp2(Integer[] arr,int k){

        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            pq.add(arr[i]);
        }
        for (int i = k; i < arr.length; i++) {
           if(pq.peek()<arr[i]){
               pq.poll();
               pq.add(arr[i]);
           }
        }

        return pq.peek();
    }

    //Connect N ropes with minimum Cost*******************************************************
    private static int getMinimumCostForRopeConnect(Integer[] arr){
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int cost=0;
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }

        while(pq.size()>1){
            int first=pq.poll();
            int second=pq.poll();
            int sum=first+second;
            cost=cost+sum;
            pq.add(sum);
        }
        return cost;
    }


    //*****Find median of a given array ******************************************************

    private static double getMedianOfGivenArray(Integer[] arr){
        double median=0;
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minHeap=new PriorityQueue<>();
        for (Integer el:arr){
            if(maxHeap.isEmpty() || maxHeap.peek()>=el) {
                maxHeap.add(el);
            }
            else{
                minHeap.add(el);
            }

            //Check size
            if(maxHeap.size()>minHeap.size()+1){
                minHeap.add(maxHeap.poll());
            }
            else if(minHeap.size()>maxHeap.size()){
                maxHeap.add(minHeap.poll());
            }
        }
        //return median
        if(maxHeap.size()==minHeap.size())
            return (maxHeap.poll()+minHeap.poll())/2;
        else
            return maxHeap.poll();

    }

}
