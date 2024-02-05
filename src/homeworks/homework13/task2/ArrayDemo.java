package homeworks.homework13.task2;

import java.util.Arrays;

public class ArrayDemo {

    public static void main(String[] args) {
        int [] array = new int[5];
        int element = array[0];
        boolean checkType = false;

        for (int i = 0; i < array.length; i++){
            array[i] = (int) (Math.random() * ( 99 - 10 + 1) + 10);
            element = array[i];
            if(element< array[i]){
                checkType = true;
            }

        }

        System.out.println(Arrays.toString(array));

        if(checkType){
            System.out.println("массив является строго возрастающей последовательностью ");
        }
        else{
            System.out.println("массив является не строго возрастающей последовательностью ");
        }

    }


}
