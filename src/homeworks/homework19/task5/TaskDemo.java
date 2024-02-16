package homeworks.homework19.task5;


// Пользователь должен ввести с клавиатуры размер массива - натуральное число больше 3.
//   Введенное пользователем число сохраняется в переменную n.
//   Если пользователь ввёл не подходящее число, то программа должна просить пользователя повторить ввод.
//   Создать массив из n случайных целых чисел из отрезка [0;n] и вывести его на экран.
//   Создать второй массив только из чётных элементов первого массива, если они там есть, и вывести его на экран.


import java.util.Arrays;
import java.util.Scanner;

public class TaskDemo {
    public static void main(String[] args) {
        ArrayService service = new ArrayService();

        int n =service.enterNum();

        int[] array = service.createArray(n);
        System.out.println(Arrays.toString(array));

        int[] evenArray = service.createEvenArray(array);

        System.out.println(Arrays.toString(evenArray));


    }

}
