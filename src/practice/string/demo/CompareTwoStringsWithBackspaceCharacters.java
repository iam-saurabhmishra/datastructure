package practice.string.demo;

public class CompareTwoStringsWithBackspaceCharacters {
    public static void main(String[] args) {

    }

    public boolean compareTwoStringsWithBackspaceCharacters(String s1, String s2){

         int i=s1.length()-1;
         int j=s2.length()-1;

         while (i!=0 || j!=0){
             if(s1.charAt(i)!=s2.charAt(j)){
                 return false;
             }

             else if(s1.charAt(i)=='#'){

             }
         }

        return false;
    }
}
