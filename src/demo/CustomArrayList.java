package demo;

import java.util.Arrays;

public class CustomArrayList {

    public static void main(String[] args) {
        MyArrayList list=new MyArrayList();
        list.add("sa");
        System.out.println(list.getSize());
    }


}

class MyArrayList {

    static Object[] element=new Object[10];
    int size;


    public void add(Object s){
       if(element.length==0)
           element[0]=s;
       else {
           int index=getIndex(element);
           if(index<0){
               int size=element.length*2;
               Object[] element=new Object[size];
           }
           else
               element[index]=s;
       }
    }

    public int getIndex(Object[] element){
        for(int i=0;i<element.length;i++){
            if(element[i]==null){
                return i;
            }
        }
        return -1;
    }
    public long getSize(){
        return Arrays.stream(element).filter((s)->null!=s).count();
       // return element.length;
    }


}


