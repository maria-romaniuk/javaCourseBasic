package homeworks.homework29.list;

//Операции с числовым списком:
//
//Создайте LinkedList для хранения целых чисел.
//Добавьте в список случайные числа в диапазоне от 1 до 100.
//Найдите и выведите максимальное и минимальное числа в списке.
//Отсортируйте список в порядке возрастания и выведите его.


import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Task2 {

    public static void main(String[] args) {
        List<Integer> integers = new LinkedList<>();
//        integers.add((int)(Math.random() * 100) + 1);

        addRandomInteger(integers);
        addRandomInteger(integers);
        addRandomInteger(integers);
        addRandomInteger(integers);
        addRandomInteger(integers);
        addRandomInteger(integers);
        addRandomInteger(integers);

        System.out.println(integers);

        int minNumber = findMinNumber(integers);
        int minNum = Collections.min(integers);
        System.out.println("The smallest number in the List with Collections: " + minNum);
        System.out.println("The smallest number in the List: " + minNumber);


        int maxNumber = findMaxNumber(integers);
        int maxNum = Collections.max(integers);
        System.out.println("the biggest number in the List with Collections: " + maxNum);
        System.out.println("the biggest number in the List: " + maxNumber);



        Collections.sort(integers);
        System.out.println(integers);
    }


    public static void addRandomInteger(List<Integer> list){

        int num = (int)(Math.random() * 100) + 1;
        list.add(num);

    }

    public static int findMinNumber(List<Integer> list){
        int i = 0;
        int temp = list.get(0);
        while (i < list.size()){

            if (list.get(i) < temp){
            temp = list.get(i);
            }
            i++;
        }
        return temp;
    }
    public static int findMaxNumber(List<Integer> list){
        int temp = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)> temp){
                temp = list.get(i);
            }
        }
        return temp;
    }
}
