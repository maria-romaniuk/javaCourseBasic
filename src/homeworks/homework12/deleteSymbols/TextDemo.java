package homeworks.homework12.deleteSymbols;

import lessons.lesson6.scanner.UserInput;

public class TextDemo {

    public static void main(String[] args) {
        UserInput userInput = new UserInput();

        String text = userInput.inputText("Введите тест с использованием специальных символов: ");

        // здесь будет осуществляться проверка и замена символов
        DeleteSymbols checkAndChange = new  DeleteSymbols();

        String changedText = checkAndChange.change(text);

        // здесь будет вывод итого текст

        System.out.println("Измененный текст: " + changedText);
    }
}
