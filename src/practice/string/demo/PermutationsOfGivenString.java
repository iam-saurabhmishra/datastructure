package practice.string.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a string S. The task is to print all permutations of a given string in lexicographically sorted order.
 *
 * Input: ABC
 * Output:
 * ABC ACB BAC BCA CAB CBA
 * Explanation:
 * Given string ABC has permutations in 6
 * forms as ABC, ACB, BAC, BCA, CAB and CBA .
 */
public class PermutationsOfGivenString {
    public static void main(String[] args) {
        String s="ABC";
        System.out.println("Substring : "+s.substring(3));
        //System.out.println(find_permutation("ABC"));
    }

    public static List<String> find_permutation(String S) {

        List<String> list=new ArrayList<>();
        permutation(S,"",list);
        return list;

    }

    public static void permutation(String str,String psf,List<String> list) {


        if(str.length()==0){
            list.add(psf);
            return;
        }

        for (int i = 0; i <str.length() ; i++) {
            char c=str.charAt(i);
            String remaining=str.substring(0,i) +str.substring(i+1);
            permutation(remaining,c+psf,list);
        }
    }

}
