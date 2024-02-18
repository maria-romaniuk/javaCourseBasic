package homeworks.homework21.inheritance.task3;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Luis", "Levis", 2560);
        Employee emp2 = new Employee("Harry", "Potter", 1890);
        Employee emp3 = new Employee("Anna", "Vivian", 1702);
        Employee emp4 = new Employee("John", "Lenon", 2002);
        Employee emp5 = new Employee("Alex", "Plesh", 800);

        Manager manager = new Manager("Max", "West", 4110 ,new Employee[]{emp1, emp2, emp3, emp4, emp5});
        manager.printInfo();

        Developer developer = new Developer("Nick", "Maggi", 5380, new String[]{"debug", "support-system","lunch","english couse"});
        developer.printInfo();

    }
}
