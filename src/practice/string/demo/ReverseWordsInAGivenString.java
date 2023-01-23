package practice.string.demo;

import java.util.Stack;

/**
 * Given a String S, reverse the string without reversing its individual words. Words are separated by dots.
 * Input:
 * S = i.like.this.program.very.much
 * Output: much.very.program.this.like.i
 * Explanation: After reversing the whole
 * string(not individual words), the input
 * string becomes
 * much.very.program.this.like.i
 */
public class ReverseWordsInAGivenString {
    public static void main(String[] args) {
        String S = "i.like.this.program.very.much";
        System.out.println(reverseWords(S));
    }

    public static String reverseWords(String S)
    {
       String result="";
        Stack<String> stack=new Stack<>();

        String[] str=S.split("\\.");

        for(String s:str){
            stack.add(s);
        }

        while (!stack.isEmpty()){
            result=result+stack.pop()+".";
        }
       return result.substring(0,result.length()-1);
    }
}
