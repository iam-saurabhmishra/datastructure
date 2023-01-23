package practice.string.demo;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class RemoveDuplicateLetters {
    public static void main(String[] args) {
        //System.out.println(removeDuplicateLetters("cbacdcbc"));
        System.out.println(removeDuplicateLetters("bcabc"));
    }

    /**
     * Given a string s, remove duplicate letters so that every letter appears once and only once.
     * You must make sure your result is the smallest in lexicographical order among all possible results.
     * Input: s = "bcabc"
     * Output: "abc"
     */

    public static String removeDuplicateLetters(String s) {
        String result="";

        SortedSet<Character> set=new TreeSet<>();

        for (int i = 0; i <s.length() ; i++) {
            if(set.contains(s.charAt(i))){
                String str2=result.replace(s.charAt(i)+"","").concat(s.charAt(i)+"");
                if(result.compareTo(str2)>0){
                    result=str2;
                }
            }
            else {
                result = result.concat(s.charAt(i)+"");
                set.add(s.charAt(i));
            }
        }



        return result;
    }
}
