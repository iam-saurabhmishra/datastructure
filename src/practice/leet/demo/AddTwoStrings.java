package practice.leet.demo;

public class AddTwoStrings {
    public static void main(String[] args) {

        System.out.println(addStrings("12","123"));
    }

    public static String addStrings(String num1, String num2) {

       int i=num1.length()-1;
       int j=num2.length()-1;
       int carry=0;
       StringBuilder sb=new StringBuilder();

       while (i>=0 || j>=0){
           int a=(i>=0)?num1.charAt(i)-'0':0;
           int b=(j>=0)?num2.charAt(j)-'0':0;
           int sum=a+b+carry;
           sb=sb.append(sum%10);

           carry=sum/10;
           i--;
           j--;
       }
       if(carry>0){
           sb.append(carry);
       }

       return sb.reverse().toString();

    }
}
