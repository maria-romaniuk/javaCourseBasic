package homeworks.homework36.collections;

//4 Создать HashSet, добавить в него несколько строк и проверить, содержит ли он определенную строку.

import java.util.HashSet;
import java.util.Set;

public class Task4 {
    public static void main(String[] args) {
        Set<String> strings= new HashSet<>();
        strings.add("table");
        strings.add("lamp");
        strings.add("door");
        strings.add("rug");

        System.out.println(strings.contains("door"));

    }
}
