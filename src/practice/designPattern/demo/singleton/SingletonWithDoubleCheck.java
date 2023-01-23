package practice.designPattern.demo.singleton;

public class SingletonWithDoubleCheck {

    private static SingletonWithDoubleCheck instance;

    private SingletonWithDoubleCheck(){
        //private constructor
    }

    public SingletonWithDoubleCheck getInstance(){

        if(instance==null){

            synchronized(this){
                if(instance==null){
                    instance=new SingletonWithDoubleCheck();
                }
            }
        }
        return instance;
    }


}
