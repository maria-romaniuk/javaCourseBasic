package homeworks.homework42;

//Задача "Обработка пользовательского ввода": Создайте программу, которая запрашивает у пользователя возраст. Программа
// должна анализировать введённые данные и проверять, что возраст является положительным целым числом. Используйте блок
// try-catch для перехвата исключения InputMismatchException, которое может возникнуть, если пользователь вводит
// не числовые данные. В случае возникновения исключения, программа должна выводить сообщение о том, что введены
// некорректные данные и предлагать пользователю ввести данные заново.


import lessons.lesson6.scanner.UserInput;

import java.util.InputMismatchException;

public class Task2 {
    public static void main(String[] args) {
        UserInput ui = new UserInput();
        int age = 0;
        boolean validInput = false;


        try {
            age = ui.inputIntiger("Enter your age: ");

            if (age <= 0) {
                throw new IllegalArgumentException("Your age can't be zero or less.");
            }

            validInput = true;
        } catch (InputMismatchException e) {
            ui.inputIntiger("Error! Incorrect datahas been entered. Age should be an integer number. Try again, please: ");
        }
    }
}
