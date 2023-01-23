package practice.string.demo;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringLengthWithKDistinctCharacters {
    public static void main(String[] args) {
        System.out.println(getLongestSubstringLengthWithKDistinctCharacters("bccbabbabd",2));
    }


    public static int getLongestSubstringLengthWithKDistinctCharacters(String str,int k){
        int maxLength= Integer.MIN_VALUE;
        int start,end;
        start=end=0;
        Map<Character,Integer> map=new HashMap<>();

        if(str==null || str.length()==0 || k<=0 || k>str.length()){
            return -1;
        }

        while (end<str.length()){
            char cc=str.charAt(end);
            map.put(cc,map.getOrDefault(cc,0)+1);
            while (map.size()>k){
                char startChar=str.charAt(start);
                map.put(startChar,map.getOrDefault(startChar,0)-1);
                if(map.get(startChar)==0){
                    map.remove(startChar);
                }
                start++;
            }
            maxLength=Math.max(maxLength,end-start+1);
            end++;
        }
        return maxLength;
    }
}
