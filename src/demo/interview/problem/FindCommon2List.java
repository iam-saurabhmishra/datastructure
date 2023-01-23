package demo.interview.problem;

import java.util.ArrayList;
import java.util.Collections;


public class FindCommon2List {
    public static void main(String[] args) {

    }

    public static ArrayList<Integer> common_element(ArrayList<Integer>v1, ArrayList<Integer>v2)
    {
        ArrayList<Integer> s=new ArrayList();

        if(v2.containsAll(v1)){
            Collections.sort(v2);
            return v2;}
        if(v1.containsAll(v2)){
            Collections.sort(v1);
            return v1;}
        for(Integer item:v1)
        {
            if(v2.contains(item)){
                s.add(item);
            }
        }
        Collections.sort(s);
        return s;

    }


}
