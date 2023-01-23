package practice.string.demo;

import java.util.*;

public class ReverseStringWithoutChangingPunctuation {

    public static void main(String[] args) {
        reverseString("Hello World! My Name is Saurabh.");
                     //Saurabh is! Name My World Hello.
    }

    public static void reverseString(String string){
        Queue<HashMap<Integer,String>> queue=new LinkedList<>();
        Stack<String> stack=new Stack<>();
        List<String> list=Arrays.asList(".","!",",",":");
        String str[]=string.split(" ");
        int count=0;
        for(String s:str){
            String pun=isStringContainsPunctuation(s,list);
            if(pun!=null){
                HashMap<Integer,String> map=new HashMap<>();
                map.put(count,pun);
                queue.add(map);
            }
            stack.push(pun!=null?s.substring(0,s.length()-1):s);
            count++;
        }
        String result="";
        int counter=0;
        while (!stack.isEmpty()){
            result+=stack.pop();
            if(!queue.isEmpty()){
                HashMap<Integer,String> m=queue.peek();
                String ex=null!=m.get(counter)?m.get(counter):"";
                result=result+ex;
                if(ex!="")
                    queue.poll();
            }
            counter++;
            result=result+" ";
        }
        System.out.println(result);
    }

    private static String isStringContainsPunctuation(String str, List<String> list) {
        for(String s:list){
            if(str.contains(s)){
                return s;
            }
        }
        return null;
    }



}
