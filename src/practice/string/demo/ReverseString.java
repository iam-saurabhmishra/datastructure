package practice.string.demo;

public class ReverseString {
    /**
     * Write a function that reverses a string. The input string is given as an array of characters s.
     *
     * You must do this by modifying the input array in-place with O(1) extra memory.
     * @param args
     */
    public static void main(String[] args) {
        char[] arr={'h','e','l','l','0'};
        reverseString(arr);
    }

    public static void reverseString(char[] s) {

        int start=0;
        int end=s.length-1;

        while (start<=end){
            char c=s[start];
            s[start]=s[end];
            s[end]=c;
            start++;
            end--;
        }

    }
}
