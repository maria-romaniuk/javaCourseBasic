package homeworks.homework40.task4;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//В списке студентов - выбрать тех трех кто имеет самые высокие оценки и отсортировать по году поступления
//5- из списка студентов сгруппировать данные по году поступления
public class App {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 2004, 4.8));
        students.add(new Student("Nick", 2002, 4.6));
        students.add(new Student("Marley", 2012, 4.3));
        students.add(new Student("Olga", 2020, 3.7));
        students.add(new Student("Max", 2015, 4.7));
        students.add(new Student("Maria", 2007, 4.5));

        List<Student> filteredStudents = students.stream()
                .filter(student -> student.getAvgGrade() > 4.2)
                .filter(student -> student.getYear() > 2010)
                .toList();

        Map<Integer, List<Student>> studentsByYear = students.stream()
                .collect(Collectors.groupingBy(Student::getYear));

        System.out.println(filteredStudents);

        studentsByYear.forEach((year, studentList) -> {
            System.out.println("Year: " + year + ": " + studentList);
        });
    }
}
