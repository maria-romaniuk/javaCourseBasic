package homeworks.homework29.list;



//Управление списком студентов:
//
//Создайте ArrayList для хранения имен студентов.
//Добавьте в список пять имен студентов.
//Выведите список студентов в обратном порядке.
//Удалите студента из списка по индексу и выведите обновленный список.


import lessons.lesson29.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Max"));
        students.add(new Student("Lana"));
        students.add(new Student("John"));
        students.add(new Student("Jake"));
        students.add(new Student("Opheli"));

        System.out.println(students);


//        for (int i =  students.size()-1; i>=0; i--) {
//            System.out.println(students.get(i));
//        }
        
        
        Collections.reverse(students);  // встроеннвя функция коллекций
        System.out.println(students);

    }
}
