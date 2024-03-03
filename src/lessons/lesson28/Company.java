package lessons.lesson28;

import java.util.ArrayList;

public class Company {

    public static void main(String[] args) {


        Employee employee1 = new Employee("Jonny", "WE-1200");
        Employee employee2 = new Employee("Linda", "WE-1201");
        Employee employee3 = new Employee("Larry", "WE-1202");
        Employee employee4 = new Employee("Kevin", "WE-1203");
        Employee employee5 = new Employee("Kris", "WE-1204");
        Employee employee6 = new Employee("Bilbo", "WE-1205");

        Department accounting = new Department("accounting");

        accounting.addEmployee(employee1);
        accounting.addEmployee(employee2);
        accounting.addEmployee(employee3);


        System.out.println(accounting);


        Department IT = new Department("IT");

        IT.addEmployee(employee4);
        IT.addEmployee(employee5);
        IT.addEmployee(employee6);


        ArrayList<Department> departments = new ArrayList<>();
        departments.add(accounting);
        departments.add(IT);

        System.out.println(departments);


    }
}
