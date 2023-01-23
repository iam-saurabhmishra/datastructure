package practice.stack.demo;

import java.awt.*;
import java.util.LinkedList;
import java.util.List;

public



class MyStackL {

    List<Integer> ll;
    int top;

    public MyStackL() {
        this.top=-1;
        this.ll = new LinkedList<>();
    }

    public void push(int data){
        top++;
        ll.add(data);
    }

    public int pop() throws Exception {
        if (top == -1) {
            throw new Exception("Stack is blank");
        }
        int val = ll.get(top);
        top--;
        return val;
    }

    public int peek() throws Exception {
        if (top == -1) {
            throw new Exception("Stack is blank");
        }
        return ll.get(top);
    }

    public boolean isEmpty() {
        return top == -1;
    }

}