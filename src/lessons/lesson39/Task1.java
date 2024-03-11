package lessons.lesson39;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(12);
        list.add(1);
        list.add(33);
        list.add(23);
        System.out.println(list);

        Collections.sort(list,(o1,o2) -> o2.compareTo(o1));

        System.out.println(list);
    }

}
