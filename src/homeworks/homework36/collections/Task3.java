package homeworks.homework36.collections;

import java.util.HashMap;
import java.util.Map;

//   3 Создать HashMap, где ключом является число типа Integer, а значением - его квадрат. Вывести на экран все элементы HashMap.
public class Task3 {
    public static void main(String[] args) {
        Map<Integer, Integer> integerMap = new HashMap<>();
        for (int i = 0; i <= 5; i++) {
            integerMap.put(i, i * i);
        }

        System.out.println(integerMap);
    }



}
