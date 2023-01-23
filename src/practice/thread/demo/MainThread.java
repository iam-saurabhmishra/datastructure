package practice.thread.demo;

public class MainThread {

    public static void main(String[] args) {
        DemoThread1 demoThread1=new DemoThread1();
        Thread thread=new Thread(demoThread1);
        thread.start();
        System.out.println("Inside main thread");
    }
}
