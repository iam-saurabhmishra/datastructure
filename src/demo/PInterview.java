package demo;


import java.util.*;

public class PInterview {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] res=reverseArray(arr,3);
        for(int e:res){
            System.out.print(" "+e);
        }

    }

    public static int[] reverseArray(int[] arr,int k){
        int[] res;
        Stack<Integer> s=new Stack<>();
        int target=k;
        int count=0;
        int len=arr.length;
        if(arr.length%k!=0){
            System.out.println("Number is not reversable updating size");
            len=len-(len%k);
            res= new int[len];
        }
        else{
            res=new int[arr.length];
        }
        for (int i =0; i <len ; i++) {

            if(i+1==k){
                s.push(arr[i]);
                while (!s.isEmpty()){
                    // System.out.println("Peek "+s.peek());
                    res[count]=s.pop();
                    count++;
                }
                k=k+target;
            }
            else{
                s.push(arr[i]);
            }

        }

        return res;

    }

    public static boolean checkMove(int[][] arr){
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j]==1){
                    if(!isValidMove(arr,i,j)){
                       return false;
                    }
                }
            }
        }
        return true;
    }

    public static boolean isValidMove(int[][] arr, int r,int c){
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i][c]==1){
                return false;
            }
        }
        for (int i = 0; i <arr[0].length ; i++) {
            if(arr[r][i]==1){
                return false;
            }
        }

        for (int i = r,j=c; i >0 && j<arr[0].length ; i--,j++) {
            if(arr[i][j]==1){
                return false;
            }
        }
        for (int i = r,j=c; i <arr.length && j>0 ; i++,j--) {
            if(arr[i][j]==1){
                return false;
            }
        }

        for (int i = r,j=c; i >0 && j<0 ; i--,j--) {
            if(arr[i][j]==1){
                return false;
            }
        }
        for (int i = r,j=c; i <arr.length && j>arr[0].length ; i++,j++) {
            if(arr[i][j]==1){
                return false;
            }
        }

        return true;
    }


}









