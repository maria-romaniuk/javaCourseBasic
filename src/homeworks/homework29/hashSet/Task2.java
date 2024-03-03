package homeworks.homework29.hashSet;

//Удаление дубликатов из списка:
//
//Создайте ArrayList с дублирующимися элементами.
//Преобразуйте ArrayList в HashSet, чтобы автоматически удалить дубликаты.
//Выведите новый список без дубликатов.
//Добавьте новые элементы в HashSet и снова преобразуйте его обратно в ArrayList.


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task2 {

    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("black");
        colors.add("white");
        colors.add("orange");
        colors.add("black");
        colors.add("purple");
        colors.add("yellow");
        colors.add("green");
        colors.add("black");
        colors.add("purple");
        colors.add("blue");

        System.out.println("ArrayList: "+ colors);

        Set<String> uniqColors = new HashSet<>(colors);
        System.out.println("Unique set: " + uniqColors);

        uniqColors.add("dark blue");
        uniqColors.add("grey");

        System.out.println("Set with added characters: " + uniqColors);

        List<String> newColorsList = new ArrayList<>(uniqColors);
        System.out.println("New List: " + newColorsList);


    }

}
