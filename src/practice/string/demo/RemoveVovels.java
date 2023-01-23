package practice.string.demo;

import java.util.Arrays;
import java.util.List;

public class RemoveVovels {
    public static void main(String[] args) {

        String s="Apple";
        //System.out.println(removeVovel(s));
        System.out.println(finalValueAfterOperations(new String[]{"--X","X++","X++"}));
    }
    /**
     * REMOVE VOVEL'S FROM GIVEN STRING
     * @param str
     * @return
     */
    public static String removeVovel(String str){
        List<Character> list= Arrays.asList('a','e','i','o','u','A','E','I','O','U');
        String result="";
        for (int i = 0; i <str.length() ; i++) {
            if(!list.contains(str.charAt(i))){
                result=result+str.charAt(i);
            }
        }

        int i=0;
        System.out.println(++i+" "+ i++);
        return result;
    }

    /**
     * There is a programming language with only four operations and one variable X:
     *
     * ++X and X++ increments the value of the variable X by 1.
     * --X and X-- decrements the value of the variable X by 1.
     * Initially, the value of X is 0.
     */
    public static int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("++X") || operations[i].equals("X++")){
                x=x+1;
            }
            else if(operations[i].equals("--X") || operations[i].equals("X--")){
                x=x-1;
            }
        }
        return x;
    }

    public static int mostWordsFound(String[] sentences) {
        int max=0;
        for (int i = 0; i < sentences.length; i++) {
            int count=sentences[i].split(" ").length;
            if(max<count)
                max=count;
        }
        return max;
    }
}
