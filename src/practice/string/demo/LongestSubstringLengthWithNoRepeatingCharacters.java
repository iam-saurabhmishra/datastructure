package practice.string.demo;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringLengthWithNoRepeatingCharacters {
    public static void main(String[] args) {
        System.out.println(getLongestSubstringLengthWithNoRepeatingCharacters("abcadbc"));

    }

    public static int getLongestSubstringLengthWithNoRepeatingCharacters(String s){
        int maxLength=Integer.MIN_VALUE;
        int start,end;
        start=end=0;
        Map<Character,Integer> map=new HashMap<>();
        if(null==s || s.length()==0){
            return -1;
        }
        while (end<s.length()){
            char cc=s.charAt(end);
            if(map.containsKey(cc)){
                start=Math.max(start,map.get(cc)+1);

            }
            map.put(cc,end);
            maxLength=Math.max(maxLength,end-start+1);
            end++;
        }


        return maxLength;
    }
}
