package demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

public class ReflectionAPI {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {

       Test test=new Test();
       Class cl=test.getClass();
        System.out.println(cl.getName());
        Constructor constructor=cl.getConstructor();
        Method[] methodList = cl.getMethods();
        for(Method s:methodList){
            System.out.println(s.getName());
        }

        // creates object of desired method by providing the
        // method name and parameter class as arguments to
        // the getDeclaredMethod
        Method m=cl.getDeclaredMethod("method2",int.class);
        m.invoke(test,12);

    }
}

class Test
{
    // creating a private field
    private String s;

    // creating a public constructor
    public Test()  {  s = "GeeksforGeeks"; }

    // Creating a public method with no arguments
    public void method1()  {
        System.out.println("The string is " + s);
    }

    // Creating a public method with int as argument
    public void method2(int n)  {
        System.out.println("The number is " + n);
    }

    // creating a private method
    private void method3() {
        System.out.println("Private method invoked");
    }
}
