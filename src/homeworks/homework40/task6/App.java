package homeworks.homework40.task6;

import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Max", 30, List.of("Java","JS")),
                new Person("Bob", 20, List.of("Python", "Java")),
                new Person("Charlie", 25, List.of("Java", "C++")),
                new Person("David", 28, List.of("C++")),
                new Person("Nick", 32, List.of("HTML", "CSS")),
                new Person("Loki", 25, List.of("Java"))
        );

        System.out.println(people);

        List<String> skills = people.stream().filter(person -> person.getAge() > 25).
                flatMap(person -> person.getSkill().stream())
                .distinct()
                .toList();

        System.out.println(skills);
    }

}
