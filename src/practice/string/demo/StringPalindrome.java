package practice.string.demo;


public class StringPalindrome {
    public static void main(String[] args) {
        String str="saurabh";
        printReverse(str);
        System.out.println("");
        System.out.println(isPalindrome(str));
        System.out.println(isPalindromeWithRecursion(str));

    }

    public static void printReverse(String str){
        if(str.length()==1){
            System.out.print(str.charAt(0));
        }
        else{
            System.out.print(str.charAt(str.length()-1));
            printReverse(str.substring(0,str.length()-1));
        }
    }

    public static boolean isPalindrome(String str){
        String str1="";
        for(int i=str.length()-1;i>=0;i--){
            str1=str1+str.charAt(i);
        }
        if(str1.equals(str))
            return true;
        else
            return false;
    }

    public static boolean isPalindromeWithRecursion(String str){
        int start=0;
        int end=str.length()-1;
        while (start<=end){
            if(str.charAt(start)!=str.charAt(end)){
                return false;
            }
            else {
                start++;
                end--;
            }
        }
        return true;

    }
}
