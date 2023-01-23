package demo.interview.problem;

import java.util.HashMap;
import java.util.UUID;

public class Employee {private String empName;
    private UUID id;
    // Getters and setters
    // constructor, parameterized constructor


    public Employee(String empName, UUID id) {
        this.empName = empName;
        this.id = id;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((empName == null) ? 0 : empName.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        Employee other = (Employee) obj;
        if (empName == null) {
            if (other.empName != null)	return false;
        } else if (!empName.equals(other.empName))
            return false;
        if (id == null) {
            if (other.id != null) 	return false;
        } else if (!id.equals(other.id)){
            return false; }
        return true;
    }
    public static void main(String[] args) {
        Employee emp1 = new Employee("Emp1", UUID.randomUUID());

        HashMap<Employee, String> empMap = new HashMap<Employee, String>();

        empMap.put(emp1, "Test1");

        emp1.setEmpName("Changed to Emp2");

        System.out.println(empMap.get(emp1));
    }
}