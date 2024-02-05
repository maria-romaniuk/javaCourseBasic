package lessons.lesson15;

public class Person {

    String persons;
    Departments departments;

    public Person(String persons) {
        this.persons = persons;
    }


    @Override
    public String toString() {
        return "Person{" +
                "persons='" + persons + '\'' +
                '}';
    }
}
