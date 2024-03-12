package homeworks.homework32.task3;

//Описание: Реализуйте структуру данных "Очередь приоритетов", которая поддерживает стандартные операции добавления
// элемента и извлечения элемента с наивысшим приоритетом. Приоритет каждого элемента определяется в момент добавления в очередь.
//
//Цель: Создать класс PriorityQueue с методами enqueue(element, priority) для добавления элемента с определенным
// приоритетом и dequeue(), который извлекает и возвращает элемент с наивысшим приоритетом. Если два элемента имеют
// одинаковый приоритет, они должны быть обработаны по принципу FIFO.


public class Element {
    private int element;
    private int priority;

    public Element(int element, int priority) {
        this.element = element;
        this.priority = priority;
    }

    public int getElement() {
        return element;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "Element{" +
                "element=" + element +
                ", priority=" + priority +
                '}';
    }
}
