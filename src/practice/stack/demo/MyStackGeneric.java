package practice.stack.demo;

import java.util.ArrayList;
public class MyStackGeneric {
    public static void main(String[] args) throws Exception {
        MStack<String> ms=new MStack<>();
        MStack<Integer> ms1=new MStack<>();
        ms1.push(10);
        ms1.push(20);
        ms1.push(30);
        ms1.push(40);
        System.out.println(ms1);
        System.out.println(ms1.isEmpyt());
        /*ms.push("10");
        ms.push("20");
        System.out.println(ms.isEmpyt());
        ms.push("30");
        ms.push("40");

        System.out.println(ms );

        System.out.println(ms.pop());
        System.out.println(ms.top);
        System.out.println(ms.pop());
        System.out.println(ms.top);
        System.out.println(ms.pop());
        System.out.println(ms.top);
        System.out.println(ms.pop());
        System.out.println(ms.top);
        System.out.println(ms.isEmpyt());*/
    }
}


class MStack<T> {
    ArrayList<T> list=new ArrayList<>();
    int top;

    public MStack() {
        this.top=-1;
    }

    void push(T data){
        top++;
        list.add(top, data);
    }

    T pop() throws Exception {
        if(top==-1){
            throw new Exception("Stack is empty");
        }
        T temp=list.get(top);
        top--;
        return temp;
    }

    T peek() throws Exception {
        if(top==-1){
            throw new Exception("Stack is empty");
        }
        return list.get(top);
    }

    boolean isEmpyt(){
        return top==-1;
    }

    @Override
    public String toString() {
        return "MStack{"
                + list +
                '}';
    }
}
