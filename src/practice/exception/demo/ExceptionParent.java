package practice.exception.demo;

import java.io.EOFException;


public class ExceptionParent {
    public void demoCheck() throws EOFException {
        System.out.println("Parent Method");
    }

}

class ExceptionChild extends ExceptionParent{

    @Override
    public void demoCheck()  {
        System.out.println("Hello");
    }
}
