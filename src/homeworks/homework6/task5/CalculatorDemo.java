package homeworks.homework6.task5;

import java.util.Arrays;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator number1 = new Calculator();

        int x = number1.calcInput("Введите число №1: ");

        Calculator number2 = new Calculator();

        int y = number2.calcInput("Введите число №2: ");

        System.out.println(x + " " + y);

    }

}
