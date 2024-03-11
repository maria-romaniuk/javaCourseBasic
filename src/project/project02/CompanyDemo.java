package project.project02;

import project.project02.entity.Department;
import project.project02.entity.Employee;
import project.project02.service.Company;
import project.project02.service.EmployeeComparator;

import java.util.Collections;
import java.util.List;

public class CompanyDemo {
    public static void main(String[] args) {
        Department IT = new Department("IT");
        Department marketing = new Department("Marketing");
        Department finance = new Department("Finance");



        Employee employee1 = new Employee("John" ,"Lebovsky", "manager", marketing);
        Employee employee2 = new Employee("Alice", "Luna", "Manager", finance);
        Employee employee3 = new Employee("Sheldon", "Cooper", "Designer", IT);
        Employee employee4 = new Employee("Nick", "Volovitzh", "Analyst", finance);
        Employee employee5 = new Employee("Michael", "Winston", "Engineer", IT);
        Employee employee6 = new Employee("Anna", "Taylor", "Assistant", marketing);
        Employee employee7 = new Employee("David", "Beckham", "Coordinator", marketing);


        Company company = new Company();

        company.addDepartment(IT);
        company.addDepartment(marketing);
        company.addDepartment(finance);


        company.addEmployee(employee1);
        company.addEmployee(employee2);
        company.addEmployee(employee3);
        company.addEmployee(employee4);
        company.addEmployee(employee5);
        company.addEmployee(employee6);
        company.addEmployee(employee7);

//        company.printAllEmployees();

        List<Employee> financeEmployees = company.getEmployeesByDepartment(finance);
        financeEmployees.sort(new EmployeeComparator());

        company.printEmployeesByDepartment(finance);

        company.removeEmployee(employee4);
        company.printAllEmployees();

    }
}
