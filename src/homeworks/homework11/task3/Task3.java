package homeworks.homework11.task3;

import lessons.lesson6.scanner.UserInput;

public class Task3 {
    public static void main(String[] args) {
        UserInput ui = new UserInput();

        int number = ui.inputIntiger("Enter your number: ");
        int sum = 0;

       for (int i = 0; number>i; number--){
           sum = sum + number;
       }
        System.out.println("Sum of all numbers in line: " + sum);
    }
}
