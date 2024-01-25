package homeworks.homework6.task4;

import lessons.lesson6.scanner.UserInput;

public class UserInfo {

    public void newUser(){
        UserInput user = new UserInput();

        String userName = user.inputText("Введите свое Имя:");
        System.out.println("Hi " + userName + "!");
    }
}
