package homeworks.homework19.task3;

import java.util.Random;

public class ArraySort {

    private Random random = new Random();

    public int [] fillArray (){
        int[] array = new int[8];
        for (int i = 0; i < array.length; i++) {
            array[i]= random.nextInt(10) + 1;
        }
        return array;
    }


    public int[] arrayBubbleSort(int [] array){
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if(array[j+1]< array[j]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    public int[] reverceArray(int [] array){
        for (int i = 0; i < array.length/2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - i -1] = temp;
        }
        return array;
    }

}
