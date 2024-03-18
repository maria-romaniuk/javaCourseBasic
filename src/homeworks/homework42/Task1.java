package homeworks.homework42;

//Задача "Деление чисел": Напишите программу, которая запрашивает у пользователя два числа и выполняет их деление.
// Используйте обработку исключений, чтобы обрабатывать случаи, когда второе число равно нулю, выводя соответствующее сообщение об ошибке.

import lessons.lesson6.scanner.UserInput;

public class Task1 {
    public static void main(String[] args) {
        UserInput ui = new UserInput();

        try {
            int num1 = ui.inputIntiger("Enter first integer number");

            int num2 = ui.inputIntiger("Enter second integer number");

            if (num2 == 0) {
                throw new IllegalArgumentException("Division by zero is impossible");
            }

            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
