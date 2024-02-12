package homeworks.homework19.task3;


//Создайте массив из 8 случайных целых чисел из отрезка [1;10]
//   Отсортируйте массив по убыванию любым из алгоритмов.


import java.util.Arrays;

public class Task3Demo {
    public static void main(String[] args) {
        ArraySort array = new ArraySort();

        int [] myArray = array.fillArray();
        System.out.println("unsorted array " + Arrays.toString(myArray));

        int [] sortedArray = array.arrayBubbleSort(myArray);
        System.out.println("sorted array " + Arrays.toString(sortedArray));

        int [] reverseArray = array.reverceArray(sortedArray);
        System.out.println("reversed array " + Arrays.toString(reverseArray));
    }
}
