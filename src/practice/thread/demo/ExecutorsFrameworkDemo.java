package practice.thread.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ExecutorsFrameworkDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        List<MyCallable> myCallableList = new ArrayList<>();
        myCallableList.add(new MyCallable("Saurabh", 10));
        myCallableList.add(new MyCallable("Ramesh", 5));
        myCallableList.add(new MyCallable("Vaibhav", 2));
        myCallableList.add(new MyCallable("Pandey", 4));
        //
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        for (MyCallable c : myCallableList) {
            Future f = executorService.submit(c);
            System.out.println(f.get());
        }
        executorService.shutdown();
    }

}

class MyCallable implements Callable{

    String name;
    int count;
    MyCallable(String name,int count ){
        this.name=name;
        this.count=count;
    }

    @Override
    public Object call() throws Exception {
        int sum=0;
        for (int i = 1; i <= count; i++) {
            sum+=i;
        }
        return name+" total sum is : "+sum;
    }
}



