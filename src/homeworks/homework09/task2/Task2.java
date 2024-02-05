package homeworks.homework09.task2;

import lessons.lesson6.scanner.UserInput;

public class Task2 {
    static int num1;
    static int num2;
    static int num3;
    static int num4;
    private static UserInput ui = new UserInput();

    public static void main(String[] args) {

        num1 = ui.inputIntiger("Enter your first number from 0 to 100: ");
        num2 = ui.inputIntiger("Enter your second number from 0 to 100: ");
        num3 = ui.inputIntiger("Enter your third number from 0 to 100: ");
        num4 = ui.inputIntiger("Enter your fourth number from 0 to 100: ");


        System.out.println("Your numbers: " + num1 + " " + num2 + " " + num3 + " " + num4);

        if ((num1 >= 0) && (num1 > num2) && (num1 > num3) && (num1 > num4) && !(num1 > 100)) {
            System.out.println("Your number " + num1 + " is the biggest here");
        } else if ((num2 >= 0) && (num2 > num1) && (num2 > num3) && (num2 > num4) && !(num2 > 100)) {
            System.out.println("Your number " + num2 + " is the biggest here");
        } else if ((num3 >= 0) && (num3 > num1) && (num3 > num2) && (num3 > num4) && !(num3 > 100)) {
            System.out.println("Your number " + num3 + " is the biggest here");
        } else if ((num4 >= 0) && (num1 < num4) && (num2 < num4) && (num3 < num4) && !(num4 > 100)) {
            System.out.println("Your number " + num4 + " is the biggest here");
        } else {
            System.out.println("Your numbers out of line 0 to 100");
        }

        int b = Math.max(num1,num2);
        int c = Math.max(num3,num4);

    }
}
