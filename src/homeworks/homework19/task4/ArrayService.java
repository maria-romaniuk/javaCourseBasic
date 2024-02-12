package homeworks.homework19.task4;

import java.util.Arrays;
import java.util.Random;

//. Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый
//   Выведите массивы на экран в двух отдельных строках
//   Посчитайте среднее арифметическое элементов каждого массива и сообщите,
//   для какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны)


public class ArrayService {
    private Random random = new Random();

    public int [] fillArray(){
        int [] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(6);
        }
        return array;
    }
    public void printArray(int[] array ){
        System.out.println("Your array " + Arrays.toString(array));
    }


    //arithmetic mean for the array
    public int mathAverage(int [] array){
        int sum = 0;
        int average = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        average = sum / array.length+1;
        return average;
    }

    public void printAverage( int averageFirstArray, int averageSecondArray){
        if (averageFirstArray > averageSecondArray){
            System.out.println("Your  arithmetic mean in the first array is bigger");
        } else if (averageFirstArray == averageSecondArray) {
            System.out.println("Your arithmetic means are equals");
        } else {
            System.out.println("Your arithmetic mean in the second array is bigger");
        }
    }


}
