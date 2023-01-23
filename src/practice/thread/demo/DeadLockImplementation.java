package practice.thread.demo;

public class DeadLockImplementation {

    String s1="Saurabh";
    String s2="Mishra";

    Thread t1=new Thread(new Runnable() {
        @Override
        public void run() {
            synchronized (s1){
                System.out.println(Thread.currentThread().getName()+" locked "+s1);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (s2){
                    System.out.println(s1+s2);
                }
            }

        }
    });

    Thread t2=new Thread(new Runnable() {
        @Override
        public void run() {
            synchronized (s2){
                System.out.println(Thread.currentThread().getName()+" locked "+s2);
                synchronized (s1){
                    System.out.println(s1+s2);
                }
            }

        }
    });

    public static void main(String[] args) {
        DeadLockImplementation n=new DeadLockImplementation();
        n.t1.start();
        n.t2.start();
        System.out.println("Main thread");
    }
}
