package homeworks.homework14;


//Дан массив размера n-1, содержащий только различные целые числа в диапазоне от 1 до n . Найдите недостающий элемент.
//
//input: arr[] = {1,2,3,5} out: 4
//
//arr[] = {6,1,2,8,3,4,7,10,5} out: 9


//S = n*(a1 + a2) / 2 - Формула суммы арифметической прогрессии
//S = n*(1+n) / 2

//получить n - отнять от суммы прогрессии сумму чисел в массиве


import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
//
//        int [] array = {6,7,3,1,4,10,12,11,5,9,8};
        int [] array = {6,5,3,1,4};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
//S = n*(1+n) / 2
        int n = array.length + 1;
        int sumProgression = n * (1 + n)/2;
        int sumArray = 0;

        for (int i = 0; i < array.length; i++) {
            sumArray = sumArray + array[i];
        }
        int missedNumber = sumProgression - sumArray;


        System.out.println("Missed number: " + missedNumber);




    }
}


