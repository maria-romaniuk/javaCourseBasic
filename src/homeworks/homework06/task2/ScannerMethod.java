package homeworks.homework06.task2;

import java.util.Scanner;


//Введите 2 слова, используйте сканер. Получить слово, состоящее из первой половины первого слова и второй половины
// второго слова. Если количество букв в слове - нечетное, то среднюю букву в слове не учитывать. Распечатать на консоль.


public class ScannerMethod {
    public String myText (String message){
        Scanner newScanner = new Scanner(System.in);
        System.out.println(message);
        String text = newScanner.nextLine();
        return text;
    }

}
