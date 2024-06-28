package core_java.java8;

import java.util.*;

class Department{
    private String name;
    private int em_no;
    private String location;

    public Department(String name, int em_no, String department_name){

        this.name=name;
        this.em_no=em_no;
        this.location=department_name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEm_no() {
        return em_no;
    }

    public void setEm_no(int em_no) {
        this.em_no = em_no;
    }

    public String getDepartment_name() {
        return location;
    }

    public void setDepartment_name(String department_name) {
        this.location = department_name;
    }

    public String toString() {
        return "{name=" + this.name + " emp_no = " + em_no + " location = " + this.location + "}";
    }
}
public class MapSortingDemo {
    public static void main(String[] args) {
        Map<Integer, Department> map = new HashMap<>();
        map.put(1, new Department("IT", 10, "Bangalore"));
        map.put(2, new Department("Finance", 5, "Hyderabad"));
        map.put(3, new Department("Procurement", 48, "Vizag"));
        map.put(4, new Department("Infra", 25, "Chennai"));

        List<Map.Entry<Integer, Department>> list = new LinkedList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer,Department>>(){

            @Override
            public int compare(Map.Entry<Integer, Department> o1, Map.Entry<Integer, Department> o2) {
                return   o1.getValue().getDepartment_name().compareTo(o2.getValue().getDepartment_name());
            }
        });

        list.forEach(l -> System.out.println("Key = " + l.getKey() + "Value = " + l.getValue()));

    }
}
