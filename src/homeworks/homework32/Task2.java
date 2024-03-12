package homeworks.homework32;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

//Описание: Дана очередь целых чисел и число k, представляющее количество операций ротации, которые необходимо
// выполнить с очередью. Ротация очереди означает перемещение последнего элемента очереди в её начало. Реализуйте
// функцию, которая модифицирует очередь, выполняя k ротаций.
//
//Цель: Написать функцию, которая принимает очередь и число k, затем выполняет k ротаций очереди





//В контексте данной задачи, "ротация" означает перемещение последнего элемента очереди в её начало. Другими словами,
// каждая ротация сдвигает элементы очереди так, что последний элемент становится первым, а остальные элементы сдвигаются на одну позицию вправо.
//
//Например, если у нас есть очередь [1, 2, 3, 4, 5] и мы выполняем одну ротацию, то после ротации очередь будет
// выглядеть так: [5, 1, 2, 3, 4]. Если мы выполняем две ротации, то после второй ротации очередь станет [4, 5, 1, 2, 3], и так далее.

public class Task2 {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();


        queue.offer(1);
        queue.offer(32);
        queue.offer(22);
        queue.offer(43);
        queue.offer(12);
        System.out.println(queue);

        rotation(queue,5);
        System.out.println(queue);
    }

    public static void rotation(Queue<Integer> queue, int count){
        Deque<Integer> deque= new LinkedList<>(queue);
        queue.clear();
        while (!deque.isEmpty()){
            if(count>0){
                queue.add(deque.removeLast());
            }else{
                queue.add(deque.removeFirst());
            }
            count--;
        }
    }
}
