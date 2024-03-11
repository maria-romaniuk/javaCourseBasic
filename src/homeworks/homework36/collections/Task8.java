package homeworks.homework36.collections;

//    8 Создать ArrayDeque, добавить в него несколько элементов с каждой стороны, извлечь элементы с одной из сторон и
//    вывести на экран.

import java.util.ArrayDeque;

public class Task8 {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        deque.addFirst(43);
        deque.addFirst(3);
        deque.addLast(5);
        deque.addLast(12);
        deque.addLast(23);

        System.out.println(deque);

        int firstElement = deque.removeFirst();
        int lastElement = deque.removeLast();

        System.out.println("First Element in queue: " + firstElement + " | " + "Last Element in queue: " + lastElement);
    }
}
