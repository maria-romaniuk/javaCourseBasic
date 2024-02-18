package project.project01.task1;


//Задание: Создайте класс ArrayService, содержащий метод sort,
//который принимает массив целых чисел и сортирует его по убыванию.
//
//Добавьте метод createArrayFromUserInput для чтения размера
//массива и его создания.
//
//Добавьте метод fillArrayFromUserInput для заполнения
//массива элементами от пользователя, возвращая созданный
//массив как ссылку.
//
//Добавьте метод printArray для вывода отсортированного массива.
//
//Реализуйте класс ArraySortDemo для демонстрации работы программы.


import java.util.Arrays;

public class ArrayService {

    public int[] sortArray(int[] array){
        Arrays.sort(array);
        return array;
    }

    public int[] reverceArray(int[] array){
        int temp = 0;
        for (int i = 0; i < array.length/2; i++) {
           temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i -1] = temp;
        }
        return array;
    }
    //Добавьте метод printArray для вывода отсортированного массива.
    public void printArray(String messege,int[] array){
        System.out.println(messege);

        System.out.println(Arrays.toString(array));
    }

}
