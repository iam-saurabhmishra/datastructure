package practice.thread.demo;

public class DemoJoinYeildSleep {
    public static void main(String[] args) throws InterruptedException{
      Thread t=new MyThread();
      t.start();
        t.join();
      System.out.println("Total :"+ MyThread.total);

    }


}


class MyThread extends Thread{

    static int total;

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
         total=total+i;
            //System.out.println("After Yeild");
        }
    }
}
