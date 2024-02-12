package homeworks.homework14;


//Создайте массив из всех нечётных чисел от 1 до 99.
//Выведите его на экран в строку в обратном порядке


import java.util.Arrays;
import java.util.Random;

public class Task2 {


    public static void main(String[] args) {
        int arrayLength = 99/2 +1;
            int[] array = new int[arrayLength];
            int[] backArray = new int[arrayLength];
            int odd = 0;
        System.out.println("array length " + array.length);

        for (int i = 1; i <= 99; i+=2) {
            array[odd] = i;
            odd++;

        }
        System.out.println(Arrays.toString(array));


        for (int i = 0; i < arrayLength/2; i++){
            int temp = array[i];
            array[i]= array[arrayLength - 1 - i] ;
            array[arrayLength - 1 - i] = temp;

        }
        System.out.println("reverse array:  " + Arrays.toString(array));




    }
}
