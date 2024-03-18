package homeworks.homework41;
//Задача 1: Фильтрация и сортировка коллекции
//
//Задание: Дан список строк. Необходимо отфильтровать из этого списка все строки,
// которые начинаются на букву "A" (без учёта регистра), и вернуть список этих строк, отсортированный в алфавитном порядке.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Alocasia", "Ficus", "Arabica", "avocado", "Bonsai", "philodendron");

        List<String> filteredAndSorted = strings.stream()
                .filter(s -> s.toLowerCase().startsWith("a"))
                .sorted(String::compareToIgnoreCase)
                .sorted(String::compareToIgnoreCase)// метод сортировки, который использует метод compareToIgnoreCase из класса String для сравнения строк без учета регистра.
                                                    // Метод compareToIgnoreCase сравнивает две строки лексикографически, игнорируя различия в регистре символов.
                .collect(Collectors.toList());

        System.out.println(filteredAndSorted);
    }
}
