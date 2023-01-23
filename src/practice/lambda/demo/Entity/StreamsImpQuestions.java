package practice.lambda.demo.Entity;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamsImpQuestions {
    private Employee emp1;

    public static void main(String[] args) {

        Employee emp1= new Employee("1","Saurabh","Sales",28,3000000);
        Employee emp2= new Employee("2","Harish","IT",25,1500000);
        Employee emp3= new Employee("3","Suresh","Operation",31,1000000);
        Employee emp4= new Employee("4","Ramesh","IT",25,500000);

        List<Employee> list = Arrays.asList(emp1,emp2,emp3,emp4);
        Comparator<Employee> comparator=(o1, o2) -> (o1.getSalary() > o2.getSalary() ? 1 : ((o1.getSalary() == o2.getSalary() ? 0 : -1)));
        //Max sal Employee
        Employee maXSalEmp = list.stream().max(comparator).get();
        System.out.println(maXSalEmp);
        //Max sal Employee
        Employee minSalEmp = list.stream().max((o1, o2) -> (o1.getSalary() > o2.getSalary() ? -1 : ((o1.getSalary() == o2.getSalary() ? 0 : 1)))).get();
        System.out.println(minSalEmp);

        Map<String, Optional<Employee>> maXSalEmpDepWise = list.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.maxBy(comparator)));
        System.out.println(maXSalEmpDepWise);

        //Employee Count working in each department

        Map<String, Long> empCountDeptWise = list.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println(empCountDeptWise);


    }


}
