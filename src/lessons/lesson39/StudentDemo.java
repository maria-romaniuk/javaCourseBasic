package lessons.lesson39;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentDemo {
    public static void main(String[] args) {
        Student student1 = new Student("Vova", 21);
        Student student2 = new Student("Olga", 12);
        Student student3 = new Student("Alex", 32);

        List<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);

        list.sort((o1, o2) -> o2.name.compareTo(o1.name));
        System.out.println(list);
        list.sort((o1, o2) -> o2.age-o1.age);
        System.out.println(list);

    }
}
