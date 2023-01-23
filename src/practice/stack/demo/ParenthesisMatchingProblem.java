package practice.stack.demo;


import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ParenthesisMatchingProblem {
    public static void main(String[] args) {
        String equation="{";
        //   {([])}
        System.out.println(isParenthesisMatching(equation));
    }

    private static boolean isParenthesisMatching(String s){

        Stack<Character> stack=new Stack<>();
        List<Character> opening= Arrays.asList(new Character[]{'[','(','{'});
        List<Character> closing= Arrays.asList(new Character[]{']',')','}'});

        for (int i = 0; i < s.length(); i++) {
            if(!opening.contains(s.charAt(i)) && !closing.contains(s.charAt(i)))
                continue;
            else if(opening.contains(s.charAt(i))){
                stack.push(s.charAt(i));
            }
            else if(stack.isEmpty()){
                return false;
            }
            else if (closing.contains(s.charAt(i)) && isMatching(s.charAt(i),stack.peek())){
                stack.pop();
            }
            else //if (closing.contains(s.charAt(i)) && s.charAt(i)!=stack.peek()){
                return false;
            }
        return stack.isEmpty();

        }

        private static boolean isMatching(char a,char b){
            return (a=='}' && b=='{') || (a==')' && b=='(') || (a==']' && b=='[');
        }



}
