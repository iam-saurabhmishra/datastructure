package practice.lambda.demo;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOnString {
    public static void main(String[] args) {
        //Find the vowel counts****************************
        String input="hello hello";
        long vowelCount= input.chars().filter((k)-> (k=='a' ||k=='e' ||k=='i' ||k=='o' ||k=='u')).count();
        System.out.println(vowelCount);

        //Create a map with occurance count

        Map<Object, Long> map=input.chars().mapToObj((c)->(char)c).collect(Collectors.groupingBy(Object::toString,Collectors.counting()));
        System.out.println(map);


        int[] arr={5,3,4,1,3,7,2,9,9,4};
        Map<Integer, Long> mapCount =Arrays.stream(arr).mapToObj((k)->k).collect(Collectors.groupingBy(Integer::intValue,Collectors.counting()));
        System.out.println(mapCount);

        List<String> list=Arrays.asList("Saurabh","Mahesh","Lal","Ramesh","Ramesh");
        Map<String, Long> stringMap1 = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Map<String, Long> stringMap = list.stream().collect(Collectors.groupingBy(String::toString, Collectors.counting()));
        System.out.println(stringMap);
    }
}