package practice.map.demo;

import java.util.HashMap;
import java.util.Map;

public class DemoHashMap {
    public static void main(String[] args) {
        Map<Integer,Integer> map= new HashMap<Integer, Integer>();
        map.put(1,1);
        map.put(2,2);
        int count=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()%2==0)
                count=count+entry.getValue()/2;
        }
    }
}
