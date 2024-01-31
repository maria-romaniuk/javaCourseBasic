package homeworks.homework11.task1;

import lessons.lesson6.scanner.UserInput;

public class TaskDemo {


    public static void main(String[] args) {
        UserInput ui = new UserInput();

        int sum = 0;

        int enterNum = ui.inputIntiger("Enter your number");

        System.out.print("Even numbers: ");

        for (int i = 0; i <= enterNum; i +=2 ){   //means i = i+2
            System.out.print( i + "|");
            sum += i; // means sum = sum + i(previous sum plus new number in this interaction)
        }
        System.out.println(" ");
        System.out.println("===============");
        System.out.println("Sum of your even numbers: " + sum);
    }
}
