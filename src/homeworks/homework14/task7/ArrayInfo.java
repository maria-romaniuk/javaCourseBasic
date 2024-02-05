package homeworks.homework14.task7;

import lessons.lesson6.scanner.UserInput;

import java.util.Random;

public class ArrayInfo {
    UserInput ui = new UserInput();
    
    int arrayLength = ui.inputIntiger("Enter your array length: ");
    public int [] array = new int[arrayLength];
    
    public int[] fillArray(){
        for (int i = 0; i < array.length; i++) {
            Random random = new Random();
            array[i] = random.nextInt(100);
        }
        return array;
    }

    int sum;
    ArrayInfo newArray = new ArrayInfo();


    public int biggestNumberInArray(){
        int maxNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            if (maxNumber < array[i]){
                maxNumber = array[i];
            }
        }
        return maxNumber;
    }


    
    
}
