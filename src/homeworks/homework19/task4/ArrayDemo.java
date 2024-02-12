package homeworks.homework19.task4;



//. Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый
//   Выведите массивы на экран в двух отдельных строках
//   Посчитайте среднее арифметическое элементов каждого массива и сообщите,
//   для какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны)


import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {

        ArrayService service = new ArrayService();

        int[] arrayFirst = service.fillArray();
        int[] arraySecond = service.fillArray();

        service.printArray(arrayFirst);
        service.printArray(arraySecond);

//        System.out.println("first array" + Arrays.toString(arrayFirst));
//        System.out.println("second array" + Arrays.toString(arraySecond));


        int averageFirstArray = service.mathAverage(arrayFirst);
        int averageSecondArray = service.mathAverage(arraySecond);


        System.out.println(averageFirstArray);
        System.out.println(averageSecondArray);

        service.printAverage(averageFirstArray,averageSecondArray);


    }
}
