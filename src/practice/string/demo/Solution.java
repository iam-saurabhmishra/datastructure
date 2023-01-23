package practice.string.demo;

import java.sql.SQLOutput;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution {

    public String validIPAddress(String queryIP) {
        String queryIP1=queryIP.replace(":",".");
        String[] ip = queryIP1.split("\\.");
        System.out.println("lenght "+ip.length);
        Pattern p = Pattern.compile("[^A-Za-z0-9]");
        Matcher m = p.matcher(queryIP);

        if (ip.length == 4) {
            boolean b = m.find();
            if(b){
                System.out.println("saurabh mishra");
                return "Neither";
            }
            for(String token:ip){
                if(token.length()>1 && token.startsWith("0"))
                    return "Neither";
                else if (Integer.parseInt(token)>255 || Integer.parseInt(token)<0){
                    return "Neither";
                }
            }
            return "IPv4";
        } else if (ip.length == 8) {
            System.out.println("saurabh");
            for(String token:ip){
                if((token.length()>4 || token.length()<1) ){
                    System.out.println("Saurabh1");
                    return "Neither";
                }
                Matcher m1 = p.matcher(token);
                boolean isHexa= m1.find();
                if(isHexa){
                    System.out.println("Saurabh2");
                    return "Neither";
                }
            }
            System.out.println("Saurabh3");
            return "IPv6";
        } else
            System.out.println("Saurabh4");
            return "Neither";
    }

    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println(s.validIPAddress("172.16.254.1"));
    }
}
