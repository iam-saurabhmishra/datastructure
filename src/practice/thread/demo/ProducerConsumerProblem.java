package practice.thread.demo;

import java.util.ArrayList;
import java.util.List;

public class ProducerConsumerProblem {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Thread p = new Producer(list);
        Thread c = new Consumer(list);
        c.start();
        p.start();

        System.out.println("Main Thread");
    }

}

class Producer extends Thread {

    List<String> list;

    Producer(List<String> list) {
        this.list = list;
    }

    @Override
    public void run() {

        synchronized (list) {
            while (true) {
                System.out.println("Producer");
                String s="Item" + (int)Math.abs(Math.random()*100);
                list.add(s);
                //System.out.println("Item added "+s);
                list.notify();
            }
        }

    }

}

class Consumer extends Thread {

    List<String> list;

    Consumer(List<String> list) {
        this.list = list;
    }

    @Override
    public void run() {
        synchronized (list) {
            while (true) {
                try {
                    System.out.println("Consumerrrrrrrrr");
                    if (list.isEmpty()) {
                        list.wait();
                    } else{
                        System.out.println("Consumer consumes : "+list.get(list.size() - 1));
                        list.remove(list.get(list.size() - 1));
                    }

                }
                catch (InterruptedException e){
                   e.printStackTrace();
                }
            }
        }
    }
}

