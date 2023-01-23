package practice.lambda.demo;

import java.util.Arrays;
import java.util.OptionalInt;

public class MultiplyArrayElements {

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        OptionalInt optional=Arrays.stream(arr).reduce((a, b)->a*b);
        if(optional.isPresent()){
            System.out.println(optional.getAsInt());
        }

    }
}
