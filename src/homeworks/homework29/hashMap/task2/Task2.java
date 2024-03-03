package homeworks.homework29.hashMap.task2;

//Отслеживание оценок студентов:
//
//Создайте HashMap, где ключом является имя студента, а значением - его средний балл.
//Добавьте данные пяти студентов.
//Найдите и выведите имя студента с наивысшим средним баллом.
//Измените средний балл одного из студентов и выведите обновленные данные.

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        Map<Student, Double> students = new HashMap<>();

        students.put( new Student("Max", "Levis"), 4.2);
        students.put( new Student("Jack", "London"), 4.8);
        students.put( new Student("Lera", "Mini"), 4.1);
        students.put( new Student("Varus", "Popolli"), 3.6);
        students.put( new Student("Diana", "Queen"), 5.0);


        printData(students);


        System.out.println("=================");
        Student name = highestGrade(students);
        System.out.println(name.getLastName() +" "+ name.getName() + " has the highest grade in college");
        System.out.println("=================");

        Student student = new Student("Lera", "Mini");

        students.put(student, 4.5);

        printData(students);




    }


    public static Student highestGrade(Map<Student, Double> list){
        Student highestStudentName = null;
        double highestGrade = Double.MIN_VALUE;

        for (Map.Entry<Student, Double> entry : list.entrySet()) {
            if (entry.getValue() > highestGrade) {
                highestGrade = entry.getValue();
                highestStudentName = entry.getKey();
            }
        }
        return highestStudentName;
    }

    public static void printData(Map<Student, Double> list){
        System.out.println("-----------------");
        for (Map.Entry<Student, Double> entry : list.entrySet()){
            System.out.println(entry.getKey().getLastName()+" "+entry.getKey().getName() +" has average grade: " + entry.getValue());
        }
    }
}
