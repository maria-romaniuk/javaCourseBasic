package homeworks.homework40.task4;

public class Student {
    private String name;
    private int year;
    private double avgGrade;

    public Student(String name, int year, double avgGrade) {
        this.name = name;
        this.year = year;
        this.avgGrade = avgGrade;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", avgGrade=" + avgGrade +
                '}';
    }
}
