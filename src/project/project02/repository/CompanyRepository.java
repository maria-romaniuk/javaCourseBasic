package project.project02.repository;

import project.project02.entity.Department;
import project.project02.entity.Employee;

public interface CompanyRepository {
    // Операции CRUD для сотрудников
    void addEmployee(Employee employee);
    Employee findEmployee(String firstName, String lastName);
    boolean removeEmployee(Employee employee);



    // Операции CRUD для отделов
    void addDepartment(Department department);
    Department findDepartment(String name);
    void removeDepartment(Department department);

}
