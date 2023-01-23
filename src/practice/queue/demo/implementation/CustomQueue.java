package practice.queue.demo.implementation;

public class CustomQueue<T> {

    private Node front;
    private Node rear;
    private static int size=0;

    public void enqueue(T data) {
        Node newNode = new Node(data);
        if (front == null) {
            rear  = newNode;
            front = newNode;
            size++;
            return;
        }
        rear.next=newNode;
        size++;
        rear=rear.next;
    }

    public T dequeue() throws Exception{
        if(front==null){
            throw new Exception("Queue is Empty");
        }
        T data=(T) front.data;
        front=front.next;
        size--;
        return data;

    }

    public int size(){
        return size;
    }
}

//Node Class
class Node<T> {

    T data;
    Node next;

    //Constructor
    public Node(T data) {
        this.data = data;
        this.next = null;
    }

}
