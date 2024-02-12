package homeworks.homework19.task2;


//Напишите программу, которая определит, сколько слов Вы ввели с консоли.


import java.util.Arrays;

public class Task2 {

    public static void main(String[] args) {
        ArrayService service = new ArrayService();

        String[] array = service.fillArray();

        System.out.println(Arrays.toString(array));

        int numOfWords = service.wordsCount(array);


        System.out.println("You enter "+ numOfWords+ " words");


    }
}
