package practice.lambda.demo;

import java.util.function.BiFunction;
import java.util.function.DoubleFunction;
import java.util.function.Function;

public class DemoFunctionalInterface {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> function=(a, b)->(a+b);
        //DoubleFunction
        DoubleFunction<Double> df=(a)->(a*+10.5);
        System.out.println(function.apply(10,10));
    }
}
