package practice.queue.demo.implementation;

import practice.stack.demo.MyStackA;

import java.util.Stack;

public class QueueImplementationUsing2Stack {
    public static void main(String[] args) {
        MyQueue<String> q=new MyQueue<>();
        q.add("Saurabh");
        q.add("Shubham");
        q.add("Ravi");
        q.add("Ramesh");
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q);
        q.add("sasas");
        System.out.println(q);
    }
}

class MyQueue<T>{

    private Stack<T> s1=new Stack<>();
    private Stack<T> s2=new Stack<>();

    public void add(T data){
        s1.add(data);
    }

    public T poll(){
        while (!s1.isEmpty()){
            s2.add(s1.pop());
        }
        T temp=s2.pop();
        while (!s2.isEmpty()){
            s1.add(s2.pop());
        }
        return temp;
    }

    public T peek(){
        while (!s1.isEmpty()){
            s2.add(s1.pop());
        }
        T temp=s2.peek();
        while (!s2.isEmpty()){
            s1.add(s2.pop());
        }
        return temp;
    }

    @Override
    public String toString() {
        return "MyQueue{"  + s1 +
                '}';
    }
}
