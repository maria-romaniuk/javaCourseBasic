package homeworks.homework42;

//Задача "Парсинг чисел": Создайте программу, которая запрашивает у пользователя строку и пытается преобразовать её в
// целое число с помощью Integer.parseInt(). Используйте обработку исключений для перехвата NumberFormatException,
// если введённая строка не может быть преобразована в число, и выводите соответствующее сообщение.

import homeworks.homework21.encapsulation.task2.User;
import lessons.lesson6.scanner.UserInput;

public class Task3 {
    public static void main(String[] args) {
        UserInput ui = new UserInput();
        String str = ui.inputText("Enter your String for transform to Integer: ");

        try{
            Integer num = Integer.parseInt(str);
            System.out.println("It was a String, now it's an Integer: " + num);
        }catch (NumberFormatException e){
            System.out.println("Error! You can't transform letters to numbers!");
        }
    }

}
