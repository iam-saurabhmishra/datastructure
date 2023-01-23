package demo;


import java.util.*;

public class DemoCount {
    public static void main(String[] args) {

    List<Integer> list=new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    System.out.println(list);


        }

   public static Iterator<Integer> reverse(List<Integer> list){
       Collections.reverse(list);
       return list.iterator();
   }

}




