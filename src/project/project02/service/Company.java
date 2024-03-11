package project.project02.service;

import project.project02.entity.Department;
import project.project02.entity.Employee;
import project.project02.repository.CompanyRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Company implements CompanyRepository {
    private Map<Department, List<Employee>> departments;

    public Company() {
        this.departments = new HashMap<>();
    }
    public List<Employee> getEmployeesByDepartment(Department department) {
        return departments.get(department);
    }
    @Override
    public void addEmployee(Employee employee) {
        Department department = employee.getDepartment();  // чтобы найти отдел, к которому принадлежит сотрудник. через get получаем название department из класса Employee
        if(department != null){ //если нашли
            List<Employee> employees = departments.get(department);// существует ли уже такой список сотрудников (как в  lesson 37)
            if (employees == null) { //если такого нет, то создаем новый array сотрудников
                departments.put(department, new ArrayList<>());
            }
            assert employees != null; // идея подсказала. для добавления в конец списка. некоторые списки не добавляют нулевые что-то там
            employees.add(employee);//если уже есть, то добавляем сотрудника или добавляем его в новый, только что созданный arrayList
        }
    }

    @Override
    public Employee findEmployee(String firstName, String lastName) {
        for (List<Employee> employees : departments.values()) { //for-each по всем спискам сотрудников всех департаментов компании
            for (Employee employee : employees) { // for-each по всем пройтись сотрудникам отдела
                if (employee.getFirstName().equals(firstName) && employee.getLastName().equals(lastName)) { // проверяем совпадение на имена
                    return employee;
                }
            }
        }
            return null; // возвразаем нулл если ничего не найдено и совпадений нет
    }

    @Override
    public boolean removeEmployee(Employee employee) {
        Department department = employee.getDepartment(); // снова находим нужный нам отдел сотрукдника
        if (department != null) { // если такой есть
            List<Employee> employees = departments.get(department);//проверяем, существует ли список сотрудников для этого отдела
            if (employees != null) { // если он не пустой и employee удaляется
                return employees.remove(employee);
            }
        }
        return false; // employee не был найден или не был удален. введено не верно или не удалено
    }


    @Override
    public void addDepartment(Department department) {
        departments.putIfAbsent(department, new ArrayList<>());
        //putIfAbsent() является частью интерфейса Map и используется для добавления значения в карту только в том
        // случае, если ключ отсутствует в карте или ассоциированное с ключом значение равно null.
        // Если ключ уже существует в карте и ему уже ассоциировано некоторое значение, метод putIfAbsent() не будет
        // изменять карту и вернет текущее значение, связанное с этим ключом.
    }

    @Override
    public Department findDepartment(String name) {
        for (Department department : departments.keySet()) { // просто проходимся for-each пщ Map и сравниваем названия department
            if (department.getName().equals(name)) {
                return department;
            }
        }
        return null;
    }

    @Override
    public void removeDepartment(Department department) {
        departments.remove(department);
    }

    @Override
    public String toString() {
        return "Company{" +
                "departments=" + departments +
                '}';
    }

    public void printAllEmployees() {
        System.out.println("All Employees in company:");
        for (List<Employee> employees : departments.values()) {
            for (Employee employee : employees) {
                employee.print();
            }
        }
    }
    public void printEmployeesByDepartment(Department department) {
        System.out.println("Employees in " + department.getName() +" department:");
        List<Employee> employees = departments.get(department);
        if (employees != null) {
            for (Employee employee : employees) {
                employee.print();
            }
        }
    }
}
