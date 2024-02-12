package homeworks.homework14.task7;


//Создать массив размера , полученного от пользователя Наполнить этот массив случайными числами в диапазоне до 100
//
//найти максимум среди элементов массива и его индекс (если значения повторяются то найти первый)
//найти сумму всех элементов
//если максимальный элемент повторяется несколько раз то создать массив из индесов




//в идеале - оформить основные модули вашей программы отдельными методами - доделать и разбраться почемуне получается



import lessons.lesson6.scanner.UserInput;

import java.util.Arrays;
import java.util.Random;

public class ArrayDemo {

    public static void main(String[] args) {
        UserInput ui = new UserInput();

        int arrayLength = ui.inputIntiger("Enter your array length: ");
        int [] array = new int[arrayLength];
        // отдельный метод

            for (int i = 0; i < array.length; i++) {
                Random random = new Random();
                array[i] = random.nextInt(100 + 1);
            }
        System.out.println(Arrays.toString(array));

            int maxNumber = array[0];
            int maxIndex = 0;
            int sum = array[0];
            for (int i = 0; i < array.length; i++) {

                if (maxNumber < array[i]){
                    maxNumber = array[i];
                    maxIndex = i;
                }
            }
        for (int i = 1; i < array.length ; i++) {
            sum += array[i];
        }
        System.out.println("Your max number in line: " + maxNumber + " with index " + maxIndex);
        System.out.println("Sum of your array: " + sum);
        }









//
//        ArrayInfo array = new ArrayInfo();
//        ArrayMath arrayMath = new ArrayMath();
//
//        array.fillArray();
//        System.out.println(Arrays.toString(array.fillArray()));
//
//        int biggest = array.biggestNumberInArray();
//        System.out.println("biggest " + biggest);

    }

