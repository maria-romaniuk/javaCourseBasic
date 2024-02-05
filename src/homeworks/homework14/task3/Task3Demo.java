package homeworks.homework14.task3;


//Создайте массив из 15 случайных целых чисел из отрезка [0;9].
//Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на отдельной строке.


import java.util.Arrays;
import java.util.Random;

public class Task3Demo {
    public static void main(String[] args) {


        int[] myArray = new int[15];
        int even = 0;

        for (int i = 0; i < myArray.length; i++) {
            int min = 0;
            int max = 9;

            myArray[i] = (int) (Math.random() * (max - min + 1) + min);

            if(myArray[i] %2 == 0){
                even++;
            }
        }

        System.out.println(Arrays.toString(myArray));

        System.out.println(even);
//
//
//        Counter array = new Counter();
//
//        array.fillArray();
//
//        System.out.println(Arrays.toString(array.fillArray()));
//
//        int num = array.countEven(array.myArray);
//        System.out.println(array.countEven(array.myArray));

    }
}

