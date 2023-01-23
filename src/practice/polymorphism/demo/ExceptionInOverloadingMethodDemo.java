package practice.polymorphism.demo;

import java.io.IOException;

public class ExceptionInOverloadingMethodDemo {
    public static void main(String[] args) {

        ParentDemo parentDemo=new ChildDemo();
        try {
            parentDemo.demoMethod();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class ParentDemo {

      public void demoMethod() throws Exception {
        System.out.println("Inside parent method");
    }
}

class ChildDemo extends ParentDemo{


    public void demoMethod() throws IOException{
        System.out.println("Inside child method");
    }
}