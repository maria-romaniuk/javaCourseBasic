package homeworks.homework36.collections;
//   6 Создать PriorityQueue из 10 элементов типа Integer, добавить несколько элементов, извлечь минимальный элемент
//   и вывести на экран.

import java.util.PriorityQueue;

public class Task6 {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(12);
        queue.add(44);
        queue.add(3);
        queue.add(4);
        queue.add(6);
        System.out.println(queue);
        System.out.println(queue.peek());
    }


}
