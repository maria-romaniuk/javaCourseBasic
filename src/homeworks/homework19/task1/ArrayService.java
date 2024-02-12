package homeworks.homework19.task1;

import lessons.lesson6.scanner.UserInput;

public class ArrayService {
    private UserInput ui = new UserInput();

    public String[] fillArray(){
        String text = ui.inputText("Enter you text");
        String[] array = text.split(" ");

        return array;

    }

    public void reverseArray( String[] array){
        for (int i = 0; i < array.length/2; i++){
            String temp = array[i];
            array[i]= array[array.length - 1 - i] ;
            array[array.length - 1 - i] = temp;

        }
    }
}
