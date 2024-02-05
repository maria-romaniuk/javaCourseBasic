package homeworks.homework09.task1;

import lessons.lesson6.scanner.UserInput;

public class Task1 {
    public static void main(String[] args) {
        UserInput ui = new UserInput();

        int num = ui.inputIntiger("Please enter a number from 1 to 3: ");

        if (num == 1){
            System.out.println("Your number is " + num);
        } else if ( num == 2){
            System.out.println("Your number is " + num);
        }
        else if (num == 3){
            System.out.println("That's your lucky number: " + num);
        } else {
            System.out.println("You enter a wrong number, please try again.");
        }
    }
}
