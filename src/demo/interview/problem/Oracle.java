package demo.interview.problem;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Oracle {
    public static void main(String[] args) {
        //System.out.println(getTime("ZNMD"));
        System.out.println(getArraySum(Arrays.asList(new Integer[]{1,2,5,6,8,9})));
    }

    //Rotate an array from given index n


    //Circular Array Rotation

    public static int getTime(String str){
        int result=0;
        int start='A';
        int end='Z';
        char cLoc='A';
        Map<Character,Integer> map=new HashMap<>();
        for (int i = start; i <= end ; i++) {
            map.put((char)i,i);
        }
        for (int i = 0; i <str.length() ; i++) {
            int steps=Math.abs (map.get(str.charAt(i))-map.get(cLoc)) ;
            result=result+Math.min(steps,26-steps);
            cLoc=str.charAt(i);

        }
        return result;
    }

    public static int getArraySum(List<Integer> ar){
        //int sum=0;
        return ar.stream().mapToInt(i->i.intValue()).sum();
    }

}
