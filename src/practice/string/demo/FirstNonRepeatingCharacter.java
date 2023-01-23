package practice.string.demo;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String str="aaabcccxytrre";
        System.out.println(printFirstNonRepeatingCharacter(str));
        System.out.println(getCountOfUniqueCharacter(str));
    }

    public static Character printFirstNonRepeatingCharacter(String str){

        int arr[] = new int[256];
        for (int i = 0; i < str.length(); i++) {
            int c = str.charAt(i);
            arr[c]++;
        }
        for (int i = 0; i < str.length(); i++) {

            int index = str.charAt(i);
            if (arr[index] == 1) {
                return str.charAt(i);
            }
        }
        return '_';
    }

    private static int getCountOfUniqueCharacter(String str) {
        int count=0;
        int arr[] = new int[256];
        for (int i = 0; i < str.length(); i++) {
            int c = str.charAt(i);
            arr[c]++;
        }
        for (int i = 0; i < str.length(); i++) {
            int index = str.charAt(i);
            if (arr[index] == 1) {
               count++;
            }
        }
        return count;
    }
}
