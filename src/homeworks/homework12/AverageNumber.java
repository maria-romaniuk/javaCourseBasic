package homeworks.homework12;

import lessons.lesson6.scanner.UserInput;


//. Напишите программу, которая запрашивает у пользователя несколько чисел при вводе 0 - печатает сумму всех введенных
// чисел и их среднее арифметическое значение
public class AverageNumber {
    public static void main(String[] args) {
        int sum = 0;
        int average = 0;
        boolean condition = true;
        int iteration = 0;
        UserInput ui = new UserInput();

        while (condition){
            int numbers = ui.inputIntiger("number:");
          if (numbers == 0){
              condition = false;
              iteration--;
          } else {
              sum += numbers;

          }
          iteration++;
              average = sum/iteration;

        }
        System.out.println("iteration: " + iteration);
        System.out.println("sum: " + sum);
        System.out.println("average: " + average);
    }

}
