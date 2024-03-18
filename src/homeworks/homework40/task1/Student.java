package homeworks.homework40.task1;

// Фильтрация списка студентов по возрасту и со средним баллом больше 4.5 Student { String name; int age; double avgGrade; }

public class Student {
    private String name;
    private int age;
    private double avgGrade;

    public Student(String name, int age, double avgGrade) {
        this.name = name;
        this.age = age;
        this.avgGrade = avgGrade;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", avgGrade=" + avgGrade +
                '}';
    }
}
