package core_java.java8;

import java.util.ArrayList;
import java.util.List;

class Employee {
    private int empId;
    private String name;
    private String city;

    public Employee(int empId, String name, String city) {
        this.empId = empId;
        this.name = name;
        this.city = city;
    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String toString() {
        return this.empId + " " + this.name + " " + this.city;
    }


}
public class SortingApisLambda {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(10, "Abhishek", "Bangalore"));
        employees.add(new Employee(60, "Anurag", "Kanpur"));
        employees.add(new Employee(20, "Anju", "Vishakhapatnam"));
        employees.add(new Employee(40, "Vikas", "Lucknow"));

        //sorting list based on empid
        employees.sort((Employee e1, Employee e2) -> e1.getEmpId() - e2.getEmpId());

        //print sorted list based on empid
        System.out.println("SORTING LIST BASED ON EMP ID");
        System.out.println(employees);

        //sorting list based on name
        employees.sort((Employee e1, Employee e2) -> e1.getName().compareTo(e2.getName()));

        //printing based on emp name
        System.out.println("SORTING LIST BASED ON NAME");
        System.out.println(employees);

    }
}
