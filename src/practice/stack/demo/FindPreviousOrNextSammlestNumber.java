package practice.stack.demo;

import java.util.Arrays;
import java.util.Stack;

public class FindPreviousOrNextSammlestNumber {
    public static void main(String[] args) {
        //printPreviousSmallerNumber(new int[]{4,10,5,8,20,15,3,12});
        //printPreviousLargerNumber(new int[]{4,10,5,8,20,15,3,12});
        //int[] a=getNextSmallerNumberIndex(new int[]{4,10,5,8,20,15,3,12});
        int[] a=getPrivoiusSmallerNumberIndex(new int[]{4,2,1,5,6,3,2,4,2});
        //int[] a=getLargerNumberfromCurrentIndex(new int[]{4,2,1,5,6,3,2,4,2});
        for(Integer integer:a){
            System.out.print(" "+integer);
        }
    }

    public static void printPreviousSmallerNumber(int arr[]){
        Stack<Integer> s=new Stack<>();
        System.out.println("\n");
        for (int i = 0; i <arr.length; i++) {
            while (!s.isEmpty() && s.peek()>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                System.out.print(" "+-1);
            }
            else{
                System.out.print(" "+s.peek());
            }
            s.push(arr[i]);
        }

    }

    public static void printPreviousLargerNumber(int arr[]){
        Stack<Integer> s=new Stack<>();
        System.out.println("\n");
        for (int i = 0; i <arr.length; i++) {
            while (!s.isEmpty() && s.peek()<=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                System.out.print(" "+-1);
            }
            else{
                System.out.print(" "+s.peek());
            }
            s.push(arr[i]);
        }

    }
    //{4,10,5,8,20,15,3,12}
    public static int[] getPrivoiusSmallerNumberIndex(int arr[]){
        Stack<Integer> s=new Stack<>();
        int[] ps=new int[arr.length];
        System.out.println("\n");
        for (int i = 0; i <arr.length; i++) {
            while (!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                ps[i]=-1;
            }
            else{
                ps[i]=s.peek();
            }
            s.push(i);
        }
    return ps;
    }

    public static int[] getNextSmallerNumberIndex(int arr[]){
        Stack<Integer> s=new Stack<>();
        int[] ps=new int[arr.length];
        System.out.println("\n");
        for (int i = arr.length-1; i >=0; i--) {
            while (!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                ps[i]=-1;
            }
            else{
                ps[i]=s.peek();
            }
            s.push(i);
        }
        return ps;
    }

    // NEXT LARGER NUMBER
    public static int[] getLargerNumberfromCurrentIndex(int arr[]){
        Stack<Integer> s=new Stack<>();
        int[] ps=new int[arr.length];
        System.out.println("\n");
        for (int i = arr.length-1; i >=0; i--) {
            while (!s.isEmpty() && arr[s.peek()]<=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                ps[i]=-1;
            }
            else{
                ps[i]=s.peek();
            }
            if(!(!s.isEmpty() && arr[s.peek()]>arr[i]))
            s.push(i);
        }
        return ps;
    }

}
