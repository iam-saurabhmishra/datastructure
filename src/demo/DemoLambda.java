package demo;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DemoLambda {
    public static void main(String[] args) {
        Employee1 emp1= new Employee1("1","Saurabh","Sales",28,3000000);
        Employee1 emp2= new Employee1("2","Harish","IT",25,1500000);
        Employee1 emp3= new Employee1("3","Suresh","Operation",31,1000000);
        Employee1 emp4= new Employee1("4","Ramesh","IT",25,500000);

        List<Employee1> list =new ArrayList<Employee1>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        Comparator<Employee1> c=((e1,e2)->(e1.getSalary()>e2.getSalary()?1:e1.getSalary()<e2.getSalary()?-1:0));
        List<Employee1> sortedList=list.stream().sorted(c).collect(Collectors.toList());
        //Map<String,Employee1> map=list.stream().sorted(c).collect(Collectors.toMap(Employee1::getDepartment, Function.identity()));
        Map<String, List<Employee1>> map=list.stream().sorted(c).collect(Collectors.groupingBy(Employee1::getDepartment));
       // System.out.println(map);
        //sortedList.stream().forEach((System.out::println));

        //streams with map
        Map<String,Employee1> empMap=new HashMap<>();
        empMap.put(emp1.getId(),emp1);
        empMap.put(emp2.getId(),emp2);
        empMap.put(emp3.getId(),emp3);
        empMap.put(emp4.getId(),emp4);

        List<Employee1> empList=empMap.entrySet().stream().filter(e->e.getValue().getAge()>18)
                .collect(Collectors.toList()).stream().map(e->e.getValue()).collect(Collectors.toList());

        //System.out.println(empList);
        IntStream.range(1,11).forEach(System.out::println);

        Employee1 eMinSal=list.stream().collect(Collectors.minBy(Comparator.comparingDouble(Employee1::getSalary))).get();
        Employee1 eMaxsal=list.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee1::getSalary))).get();
        System.out.println(eMinSal);
        System.out.println(eMaxsal);

        Map<String, Optional<Employee1>> mDepartWithHighSal = list.stream().
                collect(Collectors.groupingBy(Employee1::getDepartment, Collectors.
                        maxBy(Comparator.comparingDouble(Employee1::getSalary))));

        System.out.println(mDepartWithHighSal);

        double l=list.stream().filter((e)->e.getDepartment().equalsIgnoreCase("IT")).collect(Collectors.toList()).stream().
                map(e->e.getSalary()).collect(Collectors.toList())
                .stream().reduce(0.0d,(e1,e2)->e1+e2);
        System.out.println(l);


        Employee1 sa = list.stream().max(c).get();
        System.out.println("sasasasasas "+sa);
}

public static Boolean filterByAge(Employee1 e){
        if(e.getAge()>18){
            return true;
        }
        else
            return false;
}


}

class Employee1{

    private String id;
    private String name;
    private String department;
    private int age;
    private double salary;

    public Employee1() {
    }

    public Employee1(String id, String name, String department, int age, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.age = age;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Eomployee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}