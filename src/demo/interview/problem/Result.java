package demo.interview.problem;

import demo.interview.model.Person;

import java.util.*;
import java.util.stream.Collectors;

class Result {

     private void method(){
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        Result r=new child();
        r.method();
    }

}


class child extends Result{


    public void method(){
        System.out.println("Hello World");
    }
}