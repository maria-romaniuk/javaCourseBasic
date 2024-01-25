package homeworks.homework6.task5;

import lessons.lesson6.scanner.UserInput;

public class Calculator {
    int x;
    int y;


    public int calcInput(String messege){
        UserInput num = new UserInput();
        System.out.println(messege);
        int x = num.inputIntiger();
        return x;
    }

    public void addMath(){}
    public void subMath(){}
    public void multiMath(){}
    public void divMath(){}
}
