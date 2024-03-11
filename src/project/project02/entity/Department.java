package project.project02.entity;

import java.util.ArrayList;
import java.util.List;

//Department (с информацией о названии отдела и списке сотрудников).
public class Department {
    private String name;
    private final List<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }
    public void addEmployee( Employee employee){
        employees.add(employee);
    }
    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }
    public void print() {
        System.out.println("Department: " + name);
    }
    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", employees=" + employees +
                '}';
    }
}
