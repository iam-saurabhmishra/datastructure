package practice.stack.demo;

import java.util.Stack;

public class MinRemoveToMakeValid {
    public static void main(String[] args) {
        System.out.println(minRemoveToMakeValid("))(("));
        //System.out.println(minRemoveToMakeValid("lee(t(c)o)de)"));
    }

    public static String minRemoveToMakeValid(String s) {
        StringBuilder sb=new StringBuilder(s);
        Stack<Integer> stack=new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='('){
                stack.push(i);
            }
            else if(s.charAt(i)==')'){
                if(stack.size()>0 && s.charAt(stack.peek())=='('){
                    stack.pop();
                }
                else
                stack.push(i);
            }
        }
        System.out.println(stack);
        while (!stack.isEmpty()){
            sb.deleteCharAt(stack.pop());
        }
        return sb.toString();
    }
}
