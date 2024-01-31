package lessons.lesson12.practice1;

import lessons.lesson6.scanner.UserInput;

public class Task1 {
    public static void main(String[] args) {
        UserInput ui = new UserInput();
        int temperature1 = ui.inputIntiger("Enter your indicator 1:");
        int temperature2 = ui.inputIntiger("Enter your indicator 2:");

        boolean appCheck = true;

        if((temperature1 > 100) && (temperature2 < 100) || (temperature2 > 100) && (temperature1 < 100)){
            System.out.println("Works correctly " + appCheck);
        } else{
            appCheck = false;
            System.out.println("Attention! " + appCheck);
        }

    }
}
