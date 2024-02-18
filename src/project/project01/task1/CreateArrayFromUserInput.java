package project.project01.task1;

import lessons.lesson6.scanner.UserInput;

//Добавьте метод createArrayFromUserInput для чтения размера
//массива и его создания.
//
//Добавьте метод fillArrayFromUserInput для заполнения
//массива элементами от пользователя, возвращая созданный
//массив как ссылку.
//
public class CreateArrayFromUserInput {
    private UserInput ui =new UserInput();

    public int[] fillArrayFromUserInput(){
        int arrayLength = ui.inputIntiger("Enter your length of array: ");
        int[] array = new int[arrayLength];
        int i = 0;
        while(i<array.length){
            array[i] = ui.inputIntiger("Enter your integer number:");
            i++;
        }
        return array;
    }

}
