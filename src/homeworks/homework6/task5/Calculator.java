package homeworks.homework6.task5;

import lessons.lesson6.scanner.UserInput;

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
