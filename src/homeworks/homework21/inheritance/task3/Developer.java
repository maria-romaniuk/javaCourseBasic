package homeworks.homework21.inheritance.task3;

import java.util.Arrays;

public class Developer extends Employee{
    private String [] toDoList;

    public Developer(String name, String lastname, int salary, String[] toDoList) {
        super(name, lastname, salary);
        this.toDoList = toDoList;
    }

    public String[] getToDoList() {
        return toDoList;
    }

    public void setToDoList(String[] toDoList) {
        this.toDoList = toDoList;
    }
    public void printInfo(){
        System.out.println("==================");
        System.out.println("Developer: " + getName()+ " "+ getLastname());
        System.out.println("Salary: " + getSalary());
        System.out.println("To-do List: " + Arrays.toString(toDoList));
    }
}
