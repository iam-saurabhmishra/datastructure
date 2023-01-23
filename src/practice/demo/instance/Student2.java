package practice.demo.instance;

public class Student2 implements Functionality {

    @Override
    public int getSquare(int i) {
        return i*i;
    }

    @Override
    public String getGreeting(String name) {
        System.out.println("Hey I am Student 2 ");
        return "Hello "+name +" !!";
    }
}
