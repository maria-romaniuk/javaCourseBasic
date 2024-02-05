package homeworks.homework13.task1;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {

        int[] array = new int[8];


        for (int i = 0; i < array.length; i++) {

            array[i] = (int) (Math.random() * ( 50 - 1 + 1) + 1);

        }
        System.out.println(Arrays.toString(array));


        for (int i = 0; i <= array.length; i++){
            if (i%2 != 0){
                array[i] = 0;
//                System.out.println("i : " + i);
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
