package practice.Array.demo;

public class CountingBits {
    public static void main(String[] args) {
        int[] bits=countBits(5);
        for(int n:bits){
            System.out.print(" "+n);
        }
    }

    public static int[] countBits(int n) {
        int[] bits=new int[n+1];

        for (int i = 0; i <=n ; i++) {
            bits[i]=Integer.bitCount(i);
        }
        return bits;
    }

    public static String getBinary(int num){

        int n=num;
        String binary="";
        if(n==0){
            return "0";
        }
        while (n>0){
            binary=(n%2)+binary;
            n=n/2;
        }

        return binary;
    }
}
