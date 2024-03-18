package lessons.lesson41.task7;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Task7Example{
    /*
Студент записывает книги которые прочитал,
задача вывести все прочитанные книги у всех студентов
(в качестве дополнения, применить фильтр на тему: найти книги которые не содержат HTML)
 */

    public static void main(String[] args) {
        Student student1 = new Student("Alex");
        student1.addBook("Java 8 vs Java 21");
        student1.addBook("Spring Boot in Action");
        student1.addBook("Effective Java");

        Student student2 = new Student("Thomas");
        student2.addBook("HTML introducing");
        student2.addBook("Effective Java");

        List<Student> students = new ArrayList<>();

        students.add(student1);
        students.add(student2);


        Set<String> allBooks = students.stream()
                .flatMap(student -> student.getBook().stream())
                .collect(Collectors.toSet());

        allBooks.forEach(System.out::println);


        for (Student student: students){
            for (String book: student.getBook()){
//                System.out.println(book);
            }
        }
        List<String> books = students.stream()
                .flatMap(student -> student.getBook().stream())
                .filter(book -> !book.toLowerCase().contains("html"))
                .toList();

        System.out.println(books);



    }
}
