package project.project02.service;

import project.project02.entity.Employee;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        // Сравниваем сотрудников по фамилии
        int result = o1.getLastName().compareTo(o2.getLastName());
        // Если фамилии одинаковы, сравниваем по имени
        if (result == 0) {
            result = o1.getFirstName().compareTo(o2.getFirstName());
        }
        return result;
    }
}
