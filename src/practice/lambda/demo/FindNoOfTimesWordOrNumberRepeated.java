package practice.lambda.demo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindNoOfTimesWordOrNumberRepeated {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,3,4,1,3,7,2,9,9,4);
        List<String> sList=Arrays.asList("Amanda","Rob","Sunny","Amanda","Sunny");
        Map<Integer, Long> map=list.stream().collect(Collectors.groupingBy(Integer::intValue,Collectors.counting()));
        //System.out.println(map);
        Map<String,Long> sMap=sList.stream().filter((e)->null!=e).collect(Collectors.groupingBy(String::toString,Collectors.counting()));
        //System.out.println(sMap);

        String s="Saurabh";
        s.chars().forEach(System.out::println);
    }
}
