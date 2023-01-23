package practice.collection.demo;


import practice.collection.demo.model.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class MapSortDemo  {
    public static void main(String[] args) {
        //Salary in LPA
        Employee employee1=new Employee("Ramesh","1120","12-JUL-2021",12);
        Employee employee2=new Employee("Suresh","942","12-JUL-2021",14);
        Employee employee3=new Employee("Amit","1101","12-JUL-2021",9);
        Employee employee4=new Employee("Rahul","1100","12-JUL-2021",16);
        List<Employee> empList=new LinkedList<>();
        empList.add(employee1);
        empList.add(employee2);
        empList.add(employee3);
        empList.add(employee4);
        //Comparator<Employee> c=(e1,e2)->(e1.getSalary()>e2.getSalary()?1:e1.getSalary()<e2.getSalary()?-1:0);
        Collections.sort(empList);
        //empList.stream().forEach(System.out::println);
        Map<String,Employee> myMap=empList.stream().collect(Collectors.toMap(Employee->Employee.getEmpId(), Employee->Employee));
        empList.stream().forEach((k)->{System.out.println(myMap.get(k.getEmpId()));});
        //myMap.keySet().stream().forEach(System.out::println);
    }

}
