package homeworks.homework06.task4;

import lessons.lesson6.scanner.UserInput;


//Тема: создание переменной типа String. Напишите программу в которой создайте переменную типа String и присвойте ей в
// качестве начального значения ваше имя. Выведете на консоль значение этой переменной.
//
//Тема: Конкатенация строк. Напишите программу в которой создайте переменную типа String и присвойте ей в качестве
// начального значения ваше имя. Выведете на консоль приветствие типа "Hi YourName".
//
//Тема: Считывание строк с консоли. Программа должна спрашивать как зовут пользователя, считывать его имя с консоли и
// выводить приветствие в виде: "Hello UserName!".


public class UserInfo {

    public void newUser(){
        UserInput user = new UserInput();

        String userName = user.inputText("Введите свое Имя:");
        System.out.println("Hi " + userName + "!");
    }
}
