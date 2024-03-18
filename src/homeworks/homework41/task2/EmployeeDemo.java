package homeworks.homework41.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeDemo {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Nick", "HR"));
        employees.add(new Employee("Olga","Marketing"));
        employees.add(new Employee("Jan","IT"));
        employees.add(new Employee("Artur","Marketing"));
        employees.add(new Employee("Olivia","IT"));
        employees.add(new Employee("Maria","IT"));
        employees.add(new Employee("Viktor","HR"));

        //сгруппировать сотрудников по отделам и подсчитать количество сотрудников в каждом отделе.
        Map<String, Long> employeesInDepartment= employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting())); //.counting() возвращает значение типа Long


        //employees.stream(): Преобразует список сотрудников в поток элементов.
        //.collect(...): Собирает результаты обработки потока.
        //Collectors.groupingBy(Employee::getDepartment, Collectors.counting()): Это комбинация двух коллекторов:
        //Collectors.groupingBy(Employee::getDepartment, ...): Группирует элементы по значению, возвращаемому функцией Employee::getDepartment. Это создает Map<String, List<Employee>>, где ключ - это отдел, а значение - список сотрудников в этом отделе.
        //Collectors.counting(): Подсчитывает количество элементов в каждой группе. Возвращает значение типа Long, представляющее количество элементов в каждой группе.

        employeesInDepartment.forEach((department, count) -> System.out.println("People in " + department + ": " + count));
    }
}
