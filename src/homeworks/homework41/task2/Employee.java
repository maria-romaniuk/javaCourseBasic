package homeworks.homework41.task2;

//Задача 2: Группировка элементов и подсчёт количества
//
//Задание: Дан список объектов сотрудников (Employee), где каждый объект содержит имя и отдел, в котором работает
// сотрудник. Необходимо сгруппировать сотрудников по отделам и подсчитать количество сотрудников в каждом отделе.

public class Employee {
    private String name;
    private String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
