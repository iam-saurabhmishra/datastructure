package practice.thread.demo;

public class PrintOddEven {
    public static void main(String[] args) {
        PrintOddEven p=new PrintOddEven();

        Runnable r1=()->{
            p.printEven();
        };

        Runnable r2=()->{
            p.printOdd();
        };

        Thread t1=new Thread(r1);
        Thread t2=new Thread(r2);
        t1.start();
        t2.start();
    }

    synchronized void  printEven(){
        for (int i = 1; i <= 10; i++) {
            try{
                if((i & 1) !=0){
                    wait();
                }
            else {
                    System.out.println("Even "+i);
                    notify();
                }}catch (Exception e){
                System.out.println(e.getCause());
            }
        }
    }

    synchronized void  printOdd() {
        for (int i = 1; i <= 10; i++) {
            try{
                if((i&1)==0){
                    wait();
               }
            else{
                    System.out.println("odd "+i);
                    notify();
                }
            }catch (Exception e){
                System.out.println(e.getCause());
            }
        }
    }
}
