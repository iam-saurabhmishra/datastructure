package practice.Array.demo;

import java.util.HashMap;
import java.util.Map;

public class ConcatenateTwoNumbers {
    public static void main(String[] args) {
        int N = 4;
        int numbers[] = {1, 212, 12, 12};
        int X = 1212;

        System.out.println(countPairs(N,X,numbers));
        String[] nums= {"9","93","9","2","32","32"};
        String target="932";
        //System.out.println(countPairs1(nums,target));
    }

    public static long countPairs(int N, int X, int numbers[])
    {
        int result=0;
        int target=X;
        Map<String,Integer> map=new HashMap<>();
        for (int i = 0; i <numbers.length ; i++) {
            map.put(numbers[i]+"",map.getOrDefault(numbers[i]+"",0)+1);
        }

        for (int i = 0; i < numbers.length; i++) {
            if(!(String.valueOf(numbers[i]).length()>String.valueOf(target).length()) && String.valueOf(target).startsWith(String.valueOf(numbers[i]))){
                String remKey=String.valueOf(target).substring(String.valueOf(numbers[i]).length(),String.valueOf(target).length());
                if(map.containsKey(remKey)){
                    result=result+map.get(remKey);
                    System.out.println("Num "+numbers[i] + "  RemKey "+remKey+" Result "+result);
                   if(remKey.equals(String.valueOf(numbers[i]))){
                       result--;
                       System.out.println("Num "+numbers[i] + "  RemKey "+remKey+" Updated Result "+result);
                   }
                }
            }
        }
        System.out.println(map);

        return result;
    }


    public static long countPairs1(String[] nums, String target)
    {
        int result=0;
        Map<String,Integer> map=new HashMap<>();
        for (int i = 0; i <nums.length ; i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        for (int i = 0; i < nums.length; i++) {
            if(!(nums[i].length()>target.length()) && target.startsWith(nums[i])){
                String remKey=target.substring(nums[i].length(),target.length());
                if(map.containsKey(remKey)){
                    result=result+map.get(remKey);
                    System.out.println("Num "+nums[i] + "  RemKey "+remKey+" Result "+result);
                    if(remKey.equals(nums[i])){
                        result--;
                    }
                }
            }
        }
        System.out.println(map);

        return result;
    }
}
