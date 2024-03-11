package homeworks.homework36.collections;

import java.util.Stack;

//   7 Создать Stack, добавить в него несколько элементов. Проверить есть ли в коллекции заданный элемент.
//   Если есть,то найти его глубину и вывести на экран.
public class Task7 {
    public static void findElement(Stack<Integer> list, Integer findNum){
        if (list.contains(findNum)) {
            int depth = list.search(findNum); //LiFo
            System.out.println("Element "+ findNum +" found at depth: "+ depth);
        }else {
            System.out.println("Element "+ findNum +" not found in the stack");
        }
    }

    public static void main(String[] args) {
        Stack<Integer> integers = new Stack<>();
        integers.push(4);
        integers.push(43);
        integers.push(12);
        integers.push(5);
        integers.push(8);

        System.out.println(integers);
        findElement(integers,1);
    }
}
