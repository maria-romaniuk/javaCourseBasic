package homeworks.homework40.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//коллекция String - получить строку содержащую все элементы этой коллекции
public class Task3 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("alocasia");
        list.add("peperomia");
        list.add("ficus");
        list.add("bonsai");
        list.add("cactus");

        String stringConcat = list.stream()
                .collect(Collectors.joining());

//        String stringConcat2 = String.join("", list);  тоже самое что и выше

        System.out.println(stringConcat);
    }
}
