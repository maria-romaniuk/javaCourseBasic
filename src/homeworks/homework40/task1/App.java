package homeworks.homework40.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 18, 4.8));
        students.add(new Student("Nick", 22, 4.6));
        students.add(new Student("Marley", 25, 3.9));
        students.add(new Student("Olga", 19, 3.7));

        List<Student> filteredStudents = students.stream()
                .filter(student -> student.getAge() >= 21)
                .filter(student -> student.getAvgGrade() > 4.5)
                .collect(Collectors.toList());
//                .toList(); тоже самое что и выще


        filteredStudents.forEach(System.out::println);
    }
}

