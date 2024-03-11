package homeworks.homework36.collections;

import java.util.Map;
import java.util.TreeMap;

//   5 Создать TreeMap, где ключом является строка, а значением - ее длина. Вывести на экран все элементы TreeMap.
public class Task5 {
    public static void add(TreeMap<String,Integer> treeMap, String string) {
        treeMap.put(string,string.length());
    }

    public static void main(String[] args) {

        TreeMap<String,Integer> map = new TreeMap<>();

        add(map,"table");
        add(map,"door");
        add(map,"lamp");
        add(map,"plant");

        System.out.println(map);

    }
}
