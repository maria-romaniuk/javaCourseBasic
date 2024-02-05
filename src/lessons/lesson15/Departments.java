package lessons.lesson15;

public class Departments {
    String department;

    Person person;

    public Departments(String department, Person person) {
        this.department = department;
        this.person = person;
    }


    @Override
    public String toString() {
        return "Departments{" +
                "department='" + department + '\'' +
                ", person=" + person +
                '}';
    }
}
