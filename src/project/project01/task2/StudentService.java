package project.project01.task2;

import lessons.lesson6.scanner.UserInput;

import java.util.Arrays;
import java.util.Comparator;

//Задание: Разработайте класс StudentService для управления
//списком студентов.
//
//Добавьте метод createStudentsArrayFromUserInput для чтения размера
//массива и его создания.
//Метод должен возвратить созданный массив как ссылку.
//
//Добавьте метод fillStudentsArrayFromUserInput для заполнения
//массива элементами Student.
//
//Добавьте метод createStudentFromUserInput для создания
//нового объекта Student на основе данных, введенных пользователем.
//Класс Student должен содержать основные атрибуты, такие как Фамилия, имя и возраст.
//
//Добавьте метод sortStudents, который сортирует массив студентов
//по алфавиту по полю Фамилия.
//
//Добавьте метод printStudents для вывода массива студентов (печать по одному элементу).
//
public class StudentService {

    private UserInput ui = new UserInput();
    private Student student;


//Добавьте метод createStudentFromUserInput для создания
//нового объекта Student на основе данных, введенных пользователем.
//Класс Student должен содержать основные атрибуты, такие как Фамилия, имя и возраст.
    public Student createStudentFromUserInput(){
        String name = ui.inputText("Enter student's Name:");
        String lastname = ui.inputText("Enter student's Lastname:");
        int age = ui.inputIntiger("Enter student's Age:");

        return new Student(name, lastname, age);
    }




//Добавьте метод createStudentsArrayFromUserInput для чтения размера
//массива и его создания.
//Метод должен возвратить созданный массив как ссылку.

    public Student[] createStudentsArrayFromUserInput(){
        int arrayLength = ui.inputIntiger("Enter your array length: ");
        Student[] array = new Student[arrayLength];

        return array;
    }

    //Добавьте метод fillStudentsArrayFromUserInput для заполнения
    //массива элементами Student.
    public Student[] fillStudentsArrayFromUserInput(Student[] array){
     for (int i = 0; i < array.length; i++) {
        array[i] = createStudentFromUserInput();
      }
     return array;
    }

//Добавьте метод sortStudents, который сортирует массив студентов
//по алфавиту по полю Фамилия.
    public Student[] sortStudentsByLastname(Student[] array){
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array.length; j++) {
//                if(array[i].getLastname().compareTo(array[j].getLastname())>0){
//                    Student temp = array[i];
//                    array[i] = array[j];
//                    array[j] = temp;
//
//                }
//            }
//        } works. variant 1

        Arrays.sort(array, Comparator.comparing(Student::getLastname)); //var2

//        Arrays.sort(array, (s1, s2) -> s1.getLastname().compareTo(s2.getLastname()));
//         было Идея исправила на вариант выше

        return array;

    }

    public void printStudentsInfo(Student[] array){
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.println("Student's Lastname " + array[i].getLastname());
            System.out.println("Student's Name " + array[i].getName());
            System.out.println("Student's Age " + array[i].getAge());
            System.out.println("===================");
            System.out.println();
        }
    }
}
