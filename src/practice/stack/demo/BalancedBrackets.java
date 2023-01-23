package practice.stack.demo;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {

        System.out.println(areBracketsBalanced("}(){"));
    }

    public static boolean areBracketsBalanced(String str){

        List<Character> oBrkts= Arrays.asList('{','(','[');
        List<Character> cBrkts= Arrays.asList('}',')',']');
        Stack<Character> stack=new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            char c=str.charAt(i);
            if(oBrkts.contains(c)){
                stack.push(c);
            }
            if(cBrkts.contains(c) && !stack.isEmpty() && isClosingBracket(c,stack.peek())){
                stack.pop();
            }
        }

        return (!stack.isEmpty()?false:true);
    }

    private static boolean isClosingBracket(char c, Character peek) {
        return (c ==')' && peek=='(') || (c =='}' && peek=='{') || (c ==']' && peek=='[');
    }
}
