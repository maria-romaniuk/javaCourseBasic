package homeworks.homework32.task3;

import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList<Element> list;

    public PriorityQueue() {
        this.list = new LinkedList<>();
    }

    public void enqueue(int element, int priority){
        if (list.isEmpty() || priority <= list.getLast().getPriority()){
            list.add(new Element(element, priority));
        } else {
            int indexInsert = 0;

            while (indexInsert < list.size() && priority <= list.get(indexInsert).getPriority()) {
                indexInsert++;
            }

            list.add(indexInsert, new Element(element, priority));
        }
    }
    public Integer dequeue(){
        if (list.isEmpty()) {
            return null;
        }
        return list.poll().getElement();
    }

    @Override
    public String toString() {
        return "MyPriorityQueue{" +
                "list=" + list +
                '}';
    }
}
