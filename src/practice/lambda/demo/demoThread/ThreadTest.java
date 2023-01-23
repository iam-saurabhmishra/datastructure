package practice.lambda.demo.demoThread;

public class ThreadTest {
    public static void main(String[] args) {
        MyRunnable myRunnable= new MyRunnable();
        Runnable r=()->{
            for (int i = 0; i < 10; i++) {
                System.out.println("THREAD NEW");
            }
        };
        Thread t=new Thread(myRunnable);
        Thread t1=new Thread(r);
        t.start();
        t1.start();
        for (int i = 0; i <10; i++) {
            System.out.println("Main Thread");
        }
    }
}
