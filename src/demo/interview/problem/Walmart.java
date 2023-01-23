package demo.interview.problem;

import java.util.HashMap;
import java.util.Map;

public class Walmart {
    public static void main(String[] args) {


       /* Input: Walmart International Tech

        W-1 a-4 l-2 m-1 r-2 I—2 n-3 t—4 e-2 o-1 c-1 h1

        Output: atnLrIewmoch*/

        String str="Walmart International Tech";
        printString(str);

    }

    public static void printString(String s){
        String str=s.replaceAll(" ","").toLowerCase();
        Map<Character,Integer> map=new HashMap<>();
        for (int i = 0; i < str.length()-1; i++) {
            if(map.get(str.charAt(i))!=null){
                int val=map.get(str.charAt(i))+1;
                map.put(str.charAt(i),val);
            }
            else{
                map.put(str.charAt(i),1);
            }
        }
        //for(Character c:)
        System.out.println(map);
    }
}
