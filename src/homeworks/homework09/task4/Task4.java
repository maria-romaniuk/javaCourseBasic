package homeworks.homework09.task4;

import lessons.lesson6.scanner.UserInput;

public class Task4 {
    static int x;
    private static int time = 45;
    static int newTime;

    private static UserInput ui = new UserInput();

    public static void main(String[] args) {
        x = ui.inputIntiger("Enter a number from 1 too 12: ");

        switch (x){
            case 12:
            case 11:
            case 10:
                newTime = time + 60;
                System.out.println("Great job! Enjoy you TV time( " + newTime +"min)");
                break;
            case 9:
            case 8:
            case 7:
                newTime = time + 45;
                System.out.println("Good job! You can have more time for TV today (" + newTime +"min)");
                break;
            case 6:
            case 5:
            case 4:
                newTime = time + 15;
                System.out.println("Ok! You can watch " + newTime + "min");
                break;
            case 3:
                newTime = time - 30;
                System.out.println("Sadly! You should try better. it is " + newTime + "min for today");
                break;
            case 2:
            case 1:
                newTime = 0;
                System.out.println("That's unacceptable! Sorry, but no TV for today");
                break;

        }

    }
}
