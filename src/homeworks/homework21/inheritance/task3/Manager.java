package homeworks.homework21.inheritance.task3;

import java.util.Arrays;

public class Manager extends Employee{
    private Employee[] employeesList;

    public Manager(String name, String lastname, int salary, Employee[] employeesList) {
        super(name, lastname, salary);
        this.employeesList = employeesList;
    }

    public Employee[] getEmployeesList() {
        return employeesList;
    }

   public void printInfo(){
       System.out.println("==================");
       System.out.println("Manager: " + getName()+ " "+ getLastname());
       System.out.println("Salary: " + getSalary());
       System.out.println("Department coworkers: ");
       for (int i = 0; i < employeesList.length; i++) {
            System.out.println("Employee's Name: " + employeesList[i].getName());
            System.out.println("Employee's Lastname: " + employeesList[i].getLastname());
            System.out.println("Employee's Salary: " + employeesList[i].getSalary() ) ;
           System.out.println("---------");

       }
   }
}
