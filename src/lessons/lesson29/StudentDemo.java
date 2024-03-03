package lessons.lesson29;

import java.util.*;

public class StudentDemo {

    public static void main(String[] args) {


        Map<Subject, Integer> gradesMap = new HashMap<>();

        Map<Student, Map<Subject, Integer>> studentMap = new HashMap<>();


        Student student1 = new Student("Lenny");
        Student student2 = new Student("John");
        Student student3 = new Student("Barry");
        Student student4 = new Student("Lukas");


        Subject math = new Subject("math");
        Subject philosophie = new Subject("philosophie");
        Subject history = new Subject("history");

        gradesMap.put(math, 2);
        gradesMap.put(philosophie, 4);
        gradesMap.put(history, 5);
        studentMap.put(student1, gradesMap);

        System.out.println(studentMap);
    }
}
