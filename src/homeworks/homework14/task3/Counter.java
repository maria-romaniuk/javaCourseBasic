package homeworks.homework14.task3;

import java.util.Arrays;

public class Counter {

    int[] myArray = new int[15];
    int even = 0;

    public int[] fillArray(){
        for (int i = 0; i < myArray.length; i++) {
            int min = 0;
            int max = 9;

            myArray[i] = (int) (Math.random() * ( max - min + 1) + min);

        }
        return myArray;
    }

    public int countEven(int[] myArray){
        for (int i = 0; i < myArray.length; i++) {
            if(myArray[i] %2 == 0){
                even++;
            }
        }

        return even;
    }
}
