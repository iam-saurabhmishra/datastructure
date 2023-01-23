package practice.stack.demo;

import java.util.Stack;

/**
 * Given two integer arrays pushed and popped each with distinct values, return true if this could have been
 * the result of a sequence of push and pop operations on an initially empty stack, or false otherwise.
 * Input: pushed = [1,2,3,4,5], popped = [4,5,3,2,1]
 * Output: true
 * Explanation: We might do the following sequence:
 * push(1), push(2), push(3), push(4),
 * pop() -> 4,
 * push(5),
 * pop() -> 5, pop() -> 3, pop() -> 2, pop() -> 1
 */

public class ValidateStackSequences {

    public static void main(String[] args) {
        int[] pushed = {1,0};
        int[] popped = {1,0};

        System.out.println(validateStackSequences(pushed,popped));

    }

    public static boolean validateStackSequences(int[] pushed, int[] popped) {

        Stack<Integer> stack=new Stack<>();

        int popCounter=0;
        for (int i = 0; i < pushed.length; i++) {
            stack.push(pushed[i]);

            while (popCounter<popped.length && !stack.isEmpty() && stack.peek()==popped[popCounter]){
                stack.pop();
                popCounter++;
            }
        }

        return stack.isEmpty();
    }
}
