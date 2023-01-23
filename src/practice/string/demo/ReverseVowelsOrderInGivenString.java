package practice.string.demo;

public class ReverseVowelsOrderInGivenString {

    public static void main(String[] args) {
        System.out.println(reverseVowelsOrderInGivenString("equation"));
    }

    public static String reverseVowelsOrderInGivenString(String str){
        int start=0;
        int end=str.length()-1;
        char[] arr=str.toCharArray();


        while (start<=end){
            if(!isVovel(arr[start])){
                start++;
                continue;
            }
            if(!isVovel(arr[end])){
                end--;
                continue;
            }
            if(isVovel(arr[start]) && isVovel(arr[end]) ){
                char temp=arr[end];
                arr[end]=arr[start];
                arr[start]=temp;
                start++;
                end--;
            }

        }

        return String.valueOf(arr);
    }

    private static boolean isVovel(char c) {
        return c=='a' ||c=='e' ||c=='i' ||c=='o' ||c=='u' ||c=='A' ||c=='E' ||c=='I' ||c=='O' ||c=='U' ;
    }
}
