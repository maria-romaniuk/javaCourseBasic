package homeworks.homework32.task3;

public class PriorityDemo {
    public static void main(String[] args) {
        PriorityQueue priorityQueue = new PriorityQueue();

        priorityQueue.enqueue(5,20);
        priorityQueue.enqueue(6,10);
        priorityQueue.enqueue(7,25);
        priorityQueue.enqueue(8,2);
        priorityQueue.enqueue(1,25);
        priorityQueue.enqueue(2,1);
        priorityQueue.enqueue(3,25);

        System.out.println(priorityQueue);

        System.out.println(priorityQueue.dequeue());

    }
}
