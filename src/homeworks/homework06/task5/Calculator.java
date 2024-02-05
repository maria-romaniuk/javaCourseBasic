package homeworks.homework06.task5;

import lessons.lesson6.scanner.UserInput;

//Реализовать программу, выводящую на экран результаты сложения, вычитания, умножения и деления двух чисел, введенных
// пользователем. Каждая из арифметических операций должна быть реализована как отдельный метод. Ввод пользователем
// данных реализуйте отдельным классом с соответствующим методом.


public class Calculator {
    int x;
    int y;


    public void calcInput(){
        UserInput num = new UserInput();
       this.x = num.inputIntiger("Введите число 1");
       this.y = num.inputIntiger("Введите число 2");
    }
    public int sumMath(){
        int sum = x + y;
        System.out.println("Результат сложения: " + sum);
        return sum;
    }
    public int subMath(){
        int sub = x - y;
        System.out.println("Результат вычитания: "+ sub);
        return sub;
    }
    public int multiMath(){
        int multi = x * y;
        System.out.println("Результат умножения: " + multi);
        return multi;
    }
    public int divMath(){
        int division = x / y;
        System.out.println("Результат деления: " + division);
        return division;
    }
}
