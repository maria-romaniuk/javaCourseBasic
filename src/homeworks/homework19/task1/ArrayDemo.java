package homeworks.homework19.task1;


//Напишите программу, которая меняет местами элементы одномерного массива из String в обратном порядке.
//   Не используйте дополнительный массив для хранения результатов.

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {

        ArrayService service = new ArrayService();

        String[] array = service.fillArray();
        System.out.println(Arrays.toString(array));

        service.reverseArray(array);
        System.out.println(Arrays.toString(array));
    }

}
