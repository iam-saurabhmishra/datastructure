package practice.string.demo;

/**
 * Given a string s, return the number of palindromic substrings in it.
 *
 * A string is a palindrome when it reads the same backward as forward.
 *
 * A substring is a contiguous sequence of characters within the string.
 *
 * Input: s = "abc"
 * Output: 3
 * Explanation: Three palindromic strings: "a", "b", "c".
 *
 */
public class CountPalindromicSubstrings {
    public static void main(String[] args) {
        System.out.println(countSubstrings("qrrc"));
    }

    public static int countSubstrings(String s) {
        boolean dp[][]=new boolean[s.length()][s.length()];
        int count=0;
        String largerstPalindrom=String.valueOf(s.charAt(0));
        for (int g = 0; g < s.length(); g++) {
            for (int i = 0,j=g;j<s.length(); i++,j++) {
                if(g==0){
                    dp[i][j]=true;
                }
                else if(g==1){
                    dp[i][j]=(s.charAt(i)==s.charAt(j));
                }
                else {
                    if(s.charAt(i)==s.charAt(j)){
                        dp[i][j]=dp[i+1][j-1];
                    }else{
                        dp[i][j]=false;
                    }

                }
                if(dp[i][j]==true){
                    count++;
                    String temp=s.substring(i,j+1);
                    if(temp.length()>largerstPalindrom.length())
                        largerstPalindrom=s.substring(i,j+1);
                }
            }
        }
        System.out.println("Substring: "+largerstPalindrom);
        //System.out.println("Length : "+(largerstPalindrom.length()+1));
        return count;
    }
}
