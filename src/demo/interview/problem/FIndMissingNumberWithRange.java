package demo.interview.problem;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * We have to find the missing number from a given list/array .
 * Array is sorted
 * If missing no is continuous i.e. more than 2 digit we have to print (e.g. )
 * List [1,3,4,5,10]
 * O/P : [2,6-9]
 */
public class FIndMissingNumberWithRange {
    public static void main(String[] args) {
        Integer[] arr={1,3,4,5,10};
        printMissingNumberAndRange(arr);

    }

    static void printMissingNumberAndRange(Integer[] arr){
        Map<String,Integer> map=new HashMap<>();
        int count=arr[0];
        int end=arr[arr.length-1];
        boolean isFull=false;
        String result="";
        while (count<=end){

            isFull=(map.get("end")==null?false:true);

            if(isPresent(count,arr)){
                if(map.get("start")!=null){

                }
            }


            count++;
        }
        System.out.println("Saurabh "+result);


    }

    static boolean isPresent(int count,Integer[] arr){
         return Arrays.stream(arr).anyMatch((i)->i==count);
    }
}
