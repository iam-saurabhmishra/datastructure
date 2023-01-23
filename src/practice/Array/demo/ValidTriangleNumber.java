package practice.Array.demo;

public class ValidTriangleNumber {
    public static void main(String[] args) {
        int a[]=triangleNumber(new int[]{1, 2, 2, 4});
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static int[] triangleNumber(int[] nums) {
        int[] count=new int[nums.length-2];
        for (int i = 0; i <nums.length-2 ; i++) {
            int a=nums[i];
            int b=nums[i+1];
            int c=nums[i+2];
            System.out.println(a +" "+b+" "+c);
            if(a+b>c && b+c>a && a+c>b){
                count[i]=1;
            }
            else{
                count[i]=0;
            }
        }
        return count;

    }

}
