package project.project01.task2;

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
//Реализуйте класс StudentsSortDemo для демонстрации работы программы.


import java.util.Arrays;

public class StudetsSortDemo {
    public static void main(String[] args) {
        StudentService service = new StudentService();


        Student[] studentsArray = service.createStudentsArrayFromUserInput();

        service.fillStudentsArrayFromUserInput(studentsArray);
        System.out.println(Arrays.toString(studentsArray));

        service.printStudentsInfo(studentsArray);


        Student[] sortedArray = service.sortStudentsByLastname(studentsArray);
        service.printStudentsInfo(sortedArray);



    }
}
