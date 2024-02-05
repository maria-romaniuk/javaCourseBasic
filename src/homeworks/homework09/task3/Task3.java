package homeworks.homework09.task3;

import lessons.lesson6.scanner.UserInput;

public class Task3 {
    private static UserInput ui = new UserInput();
    public static void main(String[] args) {
        int x = ui.inputIntiger("Enter number from 1 to 7: ");

        switch (x){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday - Day off");
                break;
            case 7:
                System.out.println("Sunday - Day off");
                break;
        }
    }
}
