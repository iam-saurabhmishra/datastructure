package practice.oops.demo;



public abstract class InterfaceDemo implements MyInterface{

    public void run(){
        System.out.println("run");
    }
}


interface MyInterface{
    public void run();
    public void play();

}
