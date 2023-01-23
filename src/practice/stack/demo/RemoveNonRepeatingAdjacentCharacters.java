package practice.stack.demo;

import java.util.Stack;

public class RemoveNonRepeatingAdjacentCharacters {

    //Input - 2332904554713338
    //Output - 907138
    public static void main(String[] args) {
        System.out.println(removeDuplicateAdjecent1("aazybccbnnnkz"));
    }

    public static String removeDuplicateAdjecent(String str){

        boolean flag=true;

        while (flag){
            String result="";
            int counter=0;
            int swapCount=0;
            while (counter<str.length()-1){
                if(str.charAt(counter)==str.charAt(counter+1)){
                    swapCount++;
                    counter=counter+2;
                }
                else {

                    result = result + str.charAt(counter);
                    counter++;
                }
                flag=(swapCount>0)?true:false;
            }
            result = result + str.charAt(counter);
            str=result;
        }
        return str;

    }

    public static String removeDuplicateAdjecent1(String str){

        Stack<Character> s=new Stack<>();
        String res="";
        for (int i = 0; i < str.length(); i++) {
            if(!s.isEmpty() && str.charAt(i)==s.peek()){
                s.pop();
            }
            else{
                s.push(str.charAt(i));
            }
        }

        while (!s.isEmpty()){
            res=s.pop()+res;
        }

        return res;
    }

}
