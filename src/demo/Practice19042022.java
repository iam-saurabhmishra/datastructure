package demo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Practice19042022 {
    public static void main(String[] args) {
        //  4 3 2 1
      /*  Comparator<Integer> c=(n1,n2)->n2.compareTo(n1);
        Integer[] arr={1,4,3,2};
        Arrays.sort(arr,c);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }*/

        //System.out.println(method());

        Test1<String> test1=new Test1<>("Saurabh");
        Test1<Integer> test2=new Test1<>(123);
        System.out.println(test1.getValue());
        System.out.println(test2.getValue());

        Set<? extends IOException> set=new TreeSet<FileNotFoundException>();

        Runnable r=new Runnable() {
            @Override
            public void run() {

            }
        };

        int sum=Arrays.stream(new int[]{1,2,3,4,5}).filter(i->i%2==0).map(i->i*2).sum();
        System.out.println(sum);

        Integer number=10;
        number++;
        assert number==null && number>=0;
        System.out.println(number);
        int a=10;
        int b=20;
        String res=String.valueOf((a+b));
    }

    private static Object method(){
        try {
            int i = 10 / 0;
            return i;
        }
        catch (ArithmeticException e){
            return "catch";
        }
        finally {
            return "finally";
        }
    }



}


class Test1<T>{

    T value;

    public Test1(T value){
        this.value=value;
    }
    public T getValue(){
        return value;
    }

}
