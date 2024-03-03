package lessons.lesson28;

public class Employee {

    private String name;
    private String EmployeeID;

    private  Department department;

    public Employee(String name, String employeeID) {
        this.name = name;
        EmployeeID = employeeID;

        department.addEmployee(this);
    }

    public String getName() {
        return name;
    }

    public String getEmployeeID() {
        return EmployeeID;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", EmployeeID='" + EmployeeID + '\'' +
                '}';
    }
}
