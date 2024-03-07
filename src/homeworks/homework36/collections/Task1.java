package homeworks.homework36.collections;

//   1 Создать ArrayList из 10 элементов, отсортировать его по возрастанию и вывести на экран.


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task1 {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(6);
        integers.add(3);
        integers.add(12);
        integers.add(7);
        integers.add(20);
        integers.add(43);
        integers.add(34);
        integers.add(2);
        integers.add(18);
        integers.add(55);
        System.out.println(integers);

        Collections.sort(integers);
        System.out.println(integers);
    }
}
