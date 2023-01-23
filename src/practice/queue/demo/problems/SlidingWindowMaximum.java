package practice.queue.demo.problems;

import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindowMaximum {
    public static void main(String[] args) {

    }

    public static void printSlidingWindowMaximum(int[] arr,int k){
        Deque<Integer> deque=new ArrayDeque<>();
        for (int i = 0; i < arr.length ; i++) {

            if(deque.isEmpty()){
                deque.addLast(arr[i]);
            }
            while (deque.peek()>arr[i]){
                deque.pollLast();
            }

        }
    }
}
