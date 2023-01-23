package practice.stack.demo;


//STACK implementation using array
public class MyStackA {

    int capacity;
    int top;
    int[] arr;

    public MyStackA(int capacity) {
        this.capacity = capacity;
        this.top = -1;
        this.arr = new int[capacity];
    }

    public void push(int data) throws Exception {
        if (top == capacity - 1) {
            throw new Exception("Stack is already full");
        }
        top++;
        arr[top] = data;
    }

    public int pop() throws Exception {
        if (top==-1){
            throw new Exception("Stack is blank");
        }
        int val=arr[top];
        arr[top]=0;
        top--;
        return val;
    }

    public int peek() throws Exception {
        if (top==-1){
            throw new Exception("Stack is blank");
        }
        return arr[top];
    }

    public boolean isEmpty(){
        return top==-1;
    }

}
