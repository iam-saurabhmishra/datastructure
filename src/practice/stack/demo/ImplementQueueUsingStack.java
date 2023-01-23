package practice.stack.demo;

import java.util.Stack;

public class ImplementQueueUsingStack {
    public static void main(String[] args) {
        MyQueueUsingStack myQueueUsingStack=new MyQueueUsingStack();
        myQueueUsingStack.push(10);
        myQueueUsingStack.push(20);
        myQueueUsingStack.push(30);
        myQueueUsingStack.push(40);
        myQueueUsingStack.push(50);
        System.out.println(myQueueUsingStack.pop());
    }

}

class MyQueueUsingStack{
    Stack<Integer> s1=new Stack<>();
    Stack<Integer> s2=new Stack<>();

    void push(int data){
        s1.push(data);
    }

    int pop(){
        while (!s1.isEmpty()){
            s2.push(s1.pop());
        }
        int data=s2.pop();
        while (!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return data;
    }
}
