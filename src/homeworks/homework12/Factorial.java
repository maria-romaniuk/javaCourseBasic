package homeworks.homework12;

import lessons.lesson6.scanner.UserInput;


//. Написать метод для вычисления факториала числа (произведение всех чисел от 1 до заданного)

public class Factorial {

    public static void main(String[] args) {
        int factorial = 1;

        UserInput ui = new UserInput();

        int number = ui.inputIntiger("Number: ");

        for (int i = 1; i <= number; i++) {
//            i = i*i;
            factorial = factorial * i;
//            System.out.println("  i : " + i);
        }
            System.out.println("factorial i: " + factorial);




        // i=1
        //factorial = 1*1
        //i = 1*1

        //i =2
        //factorial = 1 (из пред итерации получили 1) * 2 =2;
        //i = 2 * 2;

        //i = 3
        //factorial = 2 (из пред итерации получили 2) * 3 = 6;
        //i = 3 * 3;

        //i = 4
        //factorial = 6 (из пред итерации получили 6) * 4 = 24;
        //i = 4 * 4;

        //i = 5
        //factorial = 24 (из пред итерации получили 24) * 5 = 120;
        //i = 5 * 5;

    }
}
