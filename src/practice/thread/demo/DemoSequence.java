package practice.thread.demo;

import java.util.ArrayList;
import java.util.List;

public class DemoSequence {


    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        Display d=new Display();
        Thread p=new Thread(()->{
          d.produce(list);
        });
        Thread c=new Thread(()->{
            d.consume(list);
        });

        p.start();
        c.start();

    }
}

class Display {

    public synchronized void produce(List<Integer> list){
        while (true){
        if(list.isEmpty()){
            list.add(1);
            System.out.println("Producer produces "+1);
            notifyAll();
        }
        else {
            int index=list.size()-1;
            int value=list.get(index)+1;
            list.add(value);
            System.out.println("Producer produces "+value);
            notifyAll();
        }
    }}

    public synchronized void consume (List<Integer> list) {
        while (true) {
            if (list.isEmpty()) {
                try {
                    //wait();
                    System.out.println("");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("Producer produces " + list.get(list.size() - 1));
                int index=list.size()-1;
                list.remove(index);
            }
        }
    }
}
