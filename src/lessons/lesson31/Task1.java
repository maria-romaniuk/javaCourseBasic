package lessons.lesson31;

//1) дан список целых чисел
//написать метод, который удаляет из него все числа, которые больше заданного X
//
//в качестве результата выведите измененный список


import java.util.ArrayList;
import java.util.List;

public class Task1 {

    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>();

        integers.add(5);
        integers.add(7);
        integers.add(2);
        integers.add(4);
        integers.add(22);
        integers.add(1);
        integers.add(14);


        System.out.println(integers);


        Integer maxNumber = 6;
        for (int i = 0; i < integers.size(); i++) {
            if (integers.get(i) >= maxNumber) {
                integers.remove(integers.get(i));
            }
        }
        System.out.println(integers);
    }
}
