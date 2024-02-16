package homeworks.homework19.task5;

// Пользователь должен ввести с клавиатуры размер массива - натуральное число больше 3.
//   Если пользователь ввёл не подходящее число, то программа должна просить пользователя повторить ввод.
//   Введенное пользователем число сохраняется в переменную n.
//   Создать массив из n случайных целых чисел из отрезка [0;n] и вывести его на экран.
//   Создать второй массив только из чётных элементов первого массива, если они там есть, и вывести его на экран.


import lessons.lesson6.scanner.UserInput;

import java.util.Random;

public class ArrayService {
    private UserInput ui = new UserInput();
    private int n;
    // Пользователь должен ввести с клавиатуры размер массива - натуральное число больше 3.
//   Если пользователь ввёл не подходящее число, то программа должна просить пользователя повторить ввод.
    public int enterNum(){
        int num = ui.inputIntiger("Enter your number bigger than 3: ");
           if (num >= 3){
               n = num;
           } else{
               return enterNum();
           }
        return n;
    }

//   Введенное пользователем число сохраняется в переменную n.
//   Создать массив из n случайных целых чисел из отрезка [0;n] и вывести его на экран.

    public int[] createArray(int n){
        int [] array = new int[n];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0,n + 1);
        }
        return array;
    }

    //Создать второй массив только из чётных элементов первого массива, если они там есть, и вывести его на экран.
    int evenCount = 0;

    public int[] createEvenArray(int[] array){

        for (int i = 0; i < array.length; i++) {
            if (array[i]%2 == 0){
                evenCount++;
            }
        }
        int[] evenArray = new int[evenCount];
        int evenIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2 ==0){
                evenArray[evenIndex] = array[i];
                evenIndex++;
            }
        }
        return evenArray;
    }
}
