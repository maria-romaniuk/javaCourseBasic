package homeworks.homework40.task2;
//коллекция String - получить коллекцию элементов у которых нечетное количество символов

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("alocasia");
        strings.add("peperomia");
        strings.add("ficus");
        strings.add("bonsai");
        strings.add("cactus");

        List<String> oddLengthStrings = strings.stream()
                .filter(s -> s.length() % 2 != 0)
                .toList();

        System.out.println("Odd-length words in array");
        oddLengthStrings.forEach(System.out::println);
    }
}
