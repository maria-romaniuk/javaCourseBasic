package homeworks.homework32;

import java.util.Stack;

//Описание: Дан стек целых чисел, который нужно отсортировать так, чтобы наименьшие элементы оказались на вершине.
// Вы можете использовать дополнительный временный стек, но вы не должны копировать элементы в другие структуры данных
// (например, массивы). Стек поддерживает следующие операции: push, pop, peek и isEmpty.
//
//Цель: Написать функцию, которая отсортирует стек в порядке возрастания элементов сверху вниз.



//push, добавить элемент в стек
// pop, извлечь элемент из стека.  Элемент извлекается из вершины стека и удаляется из него.
// peek получить или получить первый элемент стека или элемент, находящийся в верхней части стека. Полученный элемент не удаляется и не удаляется из стека.
// isEmpty.


public class Task1 {

    public static void main(String[] args) {
        Stack<Integer> integers = new Stack<>();

        integers.push(23);
        integers.push(3);
        integers.push(13);
        integers.push(24);
        integers.push(8);
        integers.push(6);
        integers.push(2);

        System.out.println(integers);


       integers = sort(integers);


        System.out.println(integers);
    }

    public static Stack<Integer> sort(Stack<Integer> integerStack){
        Stack<Integer> stackTemp = new Stack<>();
        while (!integerStack.empty()) {
            int temp = integerStack.pop();

            while (!stackTemp.empty() && stackTemp.peek() > temp) {
                integerStack.push(stackTemp.pop());
            }
            stackTemp.push(temp);
        }
        return stackTemp;
    }

}
