package practice.string.demo;

/**
 * Easy
 * Given a string s, return true if the s can be palindrome after deleting at most one character from it.
 *
 * Input: s = "aba"
 * Output: true
 */
public class ValidPalindrome2 {
    public static void main(String[] args) {

        System.out.println(validPalindrome("abac"));
    }

    public static boolean validPalindrome(String str) {
        int count=0;
       // boolean flag=false;
        if(isPalindrone(str)){
            return true;
        }
        while (count<str.length()){
            String s=str.substring(0, count) + str.substring(count + 1);
            System.out.println("Cheak for String :"+s);
            if(isPalindrone(s)){
                return true;
            }
            else {
                count++;
            }
        }

       return false;
    }

    public static boolean isPalindrone(String str){

        int s=0;
        int e=str.length()-1;

        while (s<=e){
            if(str.charAt(s)!=str.charAt(e)){
                return false;
            }
            s++;
            e--;
        }
        return true;
    }
}
