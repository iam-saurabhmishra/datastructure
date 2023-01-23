package demo.interview.problem;


import java.util.LinkedList;
import java.util.Queue;

public class StackImplementationUsingQueue {

    public static void main(String[] args) {

        MyCustomStack myCustomStack=new MyCustomStack();
        myCustomStack.push(10);
        myCustomStack.push(20);
        myCustomStack.push(30);
        myCustomStack.push(40);
        myCustomStack.pop();
        myCustomStack.pop();
        myCustomStack.push(60);



    }
}

class MyCustomStack{


    Queue<Integer> q1=new LinkedList<>();
    Queue<Integer> q2 =new LinkedList<>();

    public void push(int data){
        System.out.println("Item pushed "+data);
        //q2.add(data);
        while (!q1.isEmpty()){
            q2.add(q1.poll());
        }
        q1.add(data);
        while (!q2.isEmpty()){
            q1.add(q2.poll());
        }
    }

    public void pop(){
       if(!q1.isEmpty()){
           System.out.println("     Item polled "+q1.poll());
       }

    }




}






