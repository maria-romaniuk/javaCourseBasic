package homeworks.homework11.task4;

import lessons.lesson6.scanner.UserInput;

public class Task4 {

    static UserInput ui = new UserInput();
    public static void main(String[] args) {


        for (int i =1; i<=10; i++){
            System.out.print(i + ":");
            for (int y=1; y<=10; y++){
                System.out.print( i * y +"|");
            }
            System.out.println();
        }
    }
}
