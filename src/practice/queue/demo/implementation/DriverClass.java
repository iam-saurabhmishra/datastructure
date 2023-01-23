package practice.queue.demo.implementation;

public class DriverClass {
    public static void main(String[] args) throws Exception{
        CustomQueue<String> queue=new CustomQueue<>();
        System.out.println("Queue size is : "+queue.size());
        queue.enqueue("first");
        queue.enqueue("second");
        queue.enqueue("third");
        queue.enqueue("fourth");
        queue.enqueue("fifth");
        System.out.println("Queue size is : "+queue.size());
        System.out.println("Element removed from queue is :"+queue.dequeue());
        System.out.println("Element removed from queue is :"+queue.dequeue());
        System.out.println("Queue size is : "+queue.size());
    }
}
