package practice.string.demo;

/**
 * Given a string s, find the longest palindromic subsequence's length in s.
 *
 * A subsequence is a sequence that can be derived from another sequence by deleting some
 * or no elements without changing the order of the remaining elements.
 *
 * Input: s = "bbbab"
 * Output: 4
 * Explanation: One possible longest palindromic subsequence is "bbbb".
 *
 *
 */
public class LongestPalindromicSubsequence {
    public static void main(String[] args) {
        System.out.println(longestPalindromeSubseq("bbbab"));
    }

    public static int longestPalindromeSubseq(String s) {

        int[][] dp=new int[s.length()][s.length()];

        for (int g = 0; g < s.length(); g++) {
            for (int i = 0,j=g; j <s.length() ; i++,j++) {

                if(g==0){
                    dp[i][j]=1;
                }
                else if(g==1){
                    dp[i][j]=(s.charAt(i)==s.charAt(j)?2:1);
                }
                else{
                    if(s.charAt(i)==s.charAt(j)){
                        dp[i][j]=2+dp[i+1][j-1];
                    }
                    else{
                        dp[i][j]=Math.max(dp[i][j-1],dp[i+1][j]);
                    }
                }
            }
        }

        return dp[0][s.length()-1];
    }

}
