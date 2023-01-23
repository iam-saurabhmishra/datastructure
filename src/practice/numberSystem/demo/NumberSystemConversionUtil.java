package practice.numberSystem.demo;

public class NumberSystemConversionUtil {

    public static void main(String[] args) {
        System.out.println(getBinaryFromDecimal(25));
        System.out.println(getDecimalFromBinary("11001"));
        System.out.println(getHexaDecimalFromDecimal(59));

    }
    //DECIMAL TO BINARY
    private static String getBinaryFromDecimal(int number) {
        String binary="";
        while(number!=0){
            binary=number%2+binary;
            number=number/2;
        }
        return binary.length()!=0?binary:"Invalid Input";
    }

    //DECIMAL TO BINARY
    private static int getDecimalFromBinary(String binaryString) {

        int number=Integer.parseInt(binaryString);
        int decimal=0;
        int pow=0;
        while (number>0){
            int rem=number%10;
            decimal=decimal+ (int)(rem*Math.pow(2,pow));
            pow++;
            number=number/10;
        }
        return decimal;
    }

    //DECIMAL TO HEXADECIMAL
    private static String getHexaDecimalFromDecimal(int number) {
        String hexaDecimalNumber="";
        char[] hexa={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while(number>0){
            int rem=number%16;
            hexaDecimalNumber=String.valueOf(hexa[rem])+hexaDecimalNumber;
            number=number/16;
        }
        return hexaDecimalNumber.length()!=0?hexaDecimalNumber:"Invalid Input";
    }
}
