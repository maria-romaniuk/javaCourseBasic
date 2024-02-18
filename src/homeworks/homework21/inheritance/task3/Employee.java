package homeworks.homework21.inheritance.task3;


//Создайте класс Employee, содержащий общую информацию о сотрудниках компании. От него наследуйте классы
// Manager и Developer. В классе Manager добавьте список подчиненных - массив сотрудников
// (экземпляры класса Employee), а в классе Developer - список проектов, над которыми работает
// разработчик - массив String[].


public class Employee {
    private String name;
    private String lastname;
    private int salary;

    public Employee(String name, String lastname, int salary) {
        this.name = name;
        this.lastname = lastname;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", salary=" + salary +
                '}';
    }
}
