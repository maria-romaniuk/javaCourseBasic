package project.project02.entity;

// Создать классы Employee (с информацией о имени, фамилии, должности и отделе) и Department (с информацией
//    о названии отдела и списке сотрудников).


public class Employee {
    private String firstName;
    private String lastName;
    private String position;
    private Department department;

    public Employee(String firstName, String lastName, String position, Department department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.department = department;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPosition() {
        return position;
    }

    public Department getDepartment() {
        return department;
    }
    public void print() {
        System.out.println("Employee: " + firstName + " " + lastName + ", Position: " + position + ", Department: " + department.getName());
    }
    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", position='" + position + '\'' +
                ", department=" + department +
                '}';
    }
}
